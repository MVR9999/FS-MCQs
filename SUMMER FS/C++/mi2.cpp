#include <iostream>
using namespace std;

class A
{
  int i;
  static int si;
};

int A::si = 0;

class B 
{
  int j;
};

class C : public A, public B
{
  int k;
};

void main()
{
  cout << "size of A " << sizeof(A) << endl;
  cout << "size of B " << sizeof(B) << endl;
  cout << "size of C " << sizeof(C) << endl;
}