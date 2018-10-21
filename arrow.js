// const myTodo = function (name){
//     return `my name is ${name}`
// }


// const myTodo = (name) => `my name is ${name}`

// console.log(myTodo('Akshit'))


const todos = [{
    title:'My bread',
    isDone: true
},{
    title:'Riding a Bike',
    isDone: false
},{
    title:'I am very Luck boy',
    isDone: true
},{
    title:'My Cricket team',
    isDone: true
},{
    title:'Sidhu Moosewala',
    isDone: false
},{
    title:'Guri',
    isDone: false
}]


// const findTodos = todos.filter((todo) => todo.isDone === true)

// const findTodos = todos.filter((todo) => todo.isDone === false todo )

const printTitle = todos.filter(function(todo){
   if( todo.isDone !== true){
    return console.log (todo.title)
   }
})

printTitle
// console.log(printTitle)