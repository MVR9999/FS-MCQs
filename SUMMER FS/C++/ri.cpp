# include <iostream>
using namespace std;

#define MAX 10

class parent
{
  int parentData[MAX];
	public:
    parent()
    {
      cout << "Parent constructor called" << endl;
    }
		void m(){
			cout << "M of parent called" << endl;
		}
    ~parent()
    {
      cout << "Parent destructor called" << endl;
    }
};

class child1: public parent       // add virtual
{
  int child1Data[MAX];
	public:
    child1()
    {
      cout << "child1 constructor called" << endl;
    }
    ~child1()
    {
      cout << "child1 destructor called" << endl;
    }
		void m(){
			cout << "M of child1 called" << endl;
		}
};

class child2: public parent     // add virtual
{
  int child2Data[MAX];

	public:
    child2()
    {
      cout << "child2 constructor called" << endl;
    }
    ~child2()
    {
      cout << "child2 destructor called" << endl;
    }
		void m(){
			cout << "M of child2 called" << endl;
		}
};

class grandChild : public child1, public child2
{
	public:
    grandChild() : child1(), child2() {}  // add parent()
		void m(){
			cout << "M of grandChild called" << endl;
    }
};

void main()
{
  grandChild obj;
	obj.m();
  cout << "Size of parent object " << sizeof(parent) << endl;
  cout << "Size of child1 object " << sizeof(child1) << endl;
  cout << "Size of child2 object " << sizeof(child2) << endl;
  cout << "Size of grandchild object " << sizeof(grandChild) << endl;
}