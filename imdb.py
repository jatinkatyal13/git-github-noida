from bs4 import BeautifulSoup
import requests
import sys

movie_name = input("Enter name of movie: ")

#------------------------- For all 'Movies' results -------------------------
search ='http://www.imdb.com/find?q='
search += '%20'.join(movie_name.split())
search += '&s=tt&ttype=ft&ref_=fn_ft'

#------------ For all results: Movie, TV, TV Episode, Video Game ------------
#search ='http://www.imdb.com/find?ref_=nv_sr_fn&q='
#search += '+'.join(movie_name.split())
#search += '&s=all'
#-----------------------------------------------------------------------------

try:
    #print('Creating response ...')
    response_search_page = requests.get(search)
except:
    print('Failed to create response of search page')
    sys.exit()

try:
    #print('Creating soup object ...')
    soup = BeautifulSoup(response_search_page.text,'lxml')
except:
    print('Could not make soup from response')
    sys.exit()

try:
    #print("Finding 'article' div ...")
    article_div = soup.find('div',{'class':'article'})
except:
    print('Failed to find article div from soup')
    sys.exit()

try:
    #print('Finding whether there are any results ...')
    result_header = soup.find(['h1']).text
    if result_header.find('No results') >= 0:
        input(result_header)
        sys.exit()
    print('Displaying results ...','\n')
except:
    #Failed to find result header in article div
    sys.exit()

try:
    #print('Finding Movie List ...')
    movieListSection = article_div.find('table',{'class':'findList'})
except:
    print('Failed to find movie list section')
    sys.exit()

try:
    #print('Finding all movies from all movies section ...')
    moviesList = movieListSection.find_all('td',{'class':'result_text'})
except:
    print('Failed to load all movies from Movies section')
    sys.exit()

movies_info = []
movies = []

#iterating
print()
for movie in moviesList:
    info = {}
    info['name'] = movie.text.strip()

    if movie_name.upper() not in info['name'].upper():
        continue

    info['link'] = movie.find(['a'])['href']
    
    movie_page_response = requests.get('http://www.imdb.com'+info['link'])
    movie_soup = BeautifulSoup(movie_page_response.text,'lxml')
    title_strip = movie_soup.find('div',{'class':'title_bar_wrapper'})
        
    title_bar = title_strip.find('div',{'class':'subtext'})
    dur = title_bar.find('time')

    info['duration'] = dur.text.strip()

    rating_div = title_strip.find('div',{'class':'ratingValue'})
    if rating_div == None:
        info['rating'] = 'Unrated'
    else:
        info['rating'] = rating_div.text.strip()
            
    print('Name:',info['name'])
    print('Duration:',info['duration'])
    if info['rating'] == 'Unrated':
        print('Unrated Movie')
    else:
        print('Rating:',info['rating'])
    print('Link: http://www.imdb.com'+info['link'])
    print('\n')
        
    movies_info.append(info)
    
    movies.append(info['name'])
        
print('-----------------------------------------------------------------------------\n')
