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

// Copy constructor
complex :: complex(const complex& x) 					
{
  cout << "Copy constructor called " << endl;
  rpart = x.rpart;
  ipart = x.ipart;
}

//operator =
complex & complex :: operator = (const complex & x) 			
{	
  cout << "Assignment operator called " << endl;
	if(this != &x)
	{
    rpart = x.rpart;
    ipart = x.ipart;
	}
	return (*this);
} 


void main()
{
  complex a(1,2), b(3), c;

  c = a + b;  // a.operator +(b)

  c = a;
  complex d = b;    // complex d(b);

  cout << c << endl;
  cout << d << endl;
}
