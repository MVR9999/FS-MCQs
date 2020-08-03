/*
The following steps define the result of name lookup in a class scope, C. 
First, every declaration for the name in the class and in each of its base class
sub-objects is considered. A member name M in one sub-object B hides a member 
name M in a sub-object A if A is a base class sub-object of B. Any declarations
that are so hidden are eliminated from consideration. Each of these 
declarations that was introduced by a using-declaration is considered to be
from each sub-object of C that is of the type containing the declaration 
designated by the using-declaration. If the resulting set of declarations are 
not all from sub-objects of the same type, or the set has a nonstatic member 
and includes members from distinct sub-objects, there is an ambiguity and the 
program is ill-formed. Otherwise that set is the result of the lookup.
*/

/*
Name lookup is a separate phase to overload resolution.

Name lookup occurs first. That is the process of deciding which scope the name
applies to. In this case we must decide whether obj.M means obj.B::M, or 
obj.A::M, or obj.C::M. The name lookup rules do not take into account 
function parameters or anything; it is purely about names and scopes.

Only once that decision has been made, do we then perform overload resolution
on the different overloads of the function in the scope where the name was found.
*/

# include <iostream>
using namespace std;

class A
{
	public:
		void M(){
			cout << "M of A called" << endl;
		}
};

class B 
{
	public:
		void M(int i){
			cout << "M with one arg of B called " << i << endl;
		}
};

class C : public A, public B
{
  public:
    using A::M;
    using B::M;

    void M(){
      A::M();
			cout << "M of C called" << endl;
		}
};

void main()
{
	C obj;
	obj.M();
  obj.M(10);
}