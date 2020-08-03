// Find the minimum of n numbers

#include <iostream>
using namespace std;

void swapv(int x, int y)
{
  int temp;
  temp = x;
  x = y;
  y = temp;
}

void swapp(int *x, int *y)
{
  int temp;
  temp = *x;
  *x = *y;
  *y = temp;
}

void swapr(int &x, int &y)
{
  int temp;
  temp = x;
  x = y;
  y = temp;
}

void main()
{
	int a = 10, b = 20;
  swapv(a, b);
  cout << a << b << endl;
  swapp(&a, &b);
  cout << a << b << endl;

  a = 50;
  b = 100;
  swapr(a, b);
  cout << a << b << endl;
}
