#include <iostream>
using namespace std;

void repchar(char = '*', int = 5);

void main()
{
	repchar();
	repchar('=');
	repchar('+', 8);
}

void repchar(char ch, int n)
{
	for(int j = 0; j < n; j++)
	cout << ch << endl;
}
