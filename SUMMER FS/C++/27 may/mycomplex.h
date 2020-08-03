#include <iostream>
using namespace std;

class complex
{
	float rpart, ipart;			

	public:
		friend ostream & operator << (ostream &, complex &);	
		complex operator + (complex);
    friend complex operator +(const complex &, const complex &);
		complex operator - (complex &);	
		complex(float = 0.0, float = 0.0); 	
		~complex();					
};