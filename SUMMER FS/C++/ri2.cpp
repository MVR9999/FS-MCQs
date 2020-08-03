#include <iostream>
using namespace std;

class parent
{
	public:
		void m(){
			cout << "M of parent called" << endl;
		}
};

class child1: public virtual parent 
{
	public:
		void m(){
			cout << "m of child1 called" << endl;
		}
};

class child2: public virtual parent 
{
	public:
		void m2(){
			cout << "m2 of child2 called" << endl;
		}
};

class grandChild : public child1, public child2
{
	public:
    grandChild() : parent(), child1(), child2() {}
};

void main()
{
  grandChild obj;
	obj.m();
  obj.m2();
}