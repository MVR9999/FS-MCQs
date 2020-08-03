#include "mycomplex.h"

// Constructor
complex :: complex(float r, float i) 
{
  cout << "constructor called " << endl;
	rpart = r;
	ipart = i;
}

// Destructor
complex :: ~complex()
{
	cout <<"Destructor of complex class called " << this->rpart 
    << " " << this->ipart << endl;
}

// Binary + operator definition
complex complex :: operator + (complex b)
{
	return complex (this->rpart + b.rpart, this->ipart + b.ipart);
}

// Binary + operator definition
complex operator + (const complex & a, const complex & b)
{
  cout << "friend called " << endl;
	return complex (a.rpart + b.rpart, a.ipart + b.ipart);
}

// Output operator definition
ostream & operator << (ostream & o, complex & a)
{
  return ( o << a.rpart << " + " << a.ipart << "i" );
}

// Binary - operator definition
complex complex :: operator - (complex & b)
{
	return complex (rpart - b.rpart, ipart - b.ipart);
}

void main()
{
  complex a(1,2), b(3), c;
  c = a + b;      
  cout << c << endl;    
  c = a - b;      
  cout << c << endl;
  c = 5 + b;
  cout << c << endl;
}
