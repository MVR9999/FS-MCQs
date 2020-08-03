# include <iostream>
using namespace std;

void main()
{
  int a = 10;
  int &b = a;
  int &c = &b;		// illegal. If you comment, it will work.
  int &c = b;
  cout << " B is " << b << endl;
  cout << " C is " << c << endl;
}
