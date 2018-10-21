#include<iostream>
using namespace std;
class A
{public:
	void print1()
	{cout<<"\n this is a class A public function";
	}

private:
	void print2()
	{cout<<"\n this is a class A public function";
	}
	protected:
		void print3()
		{cout<<" \nthis is a class A public function";
		}
	};
	class B:public A
	{public:
		void print4()
		{ A a;
		a.print1();
		B b;
		b.print3();
		cout<<" \nthis is a class B function";
		}
	};
	int main()
	{B b;
	b.print4();
	}
	
	
	
