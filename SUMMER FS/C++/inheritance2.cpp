#include <iostream>
using namespace std;

#define interface struct

interface Idata {
    virtual void getData() = 0;
    virtual void delData() = 0;    
};

class file: public Idata {
  public:
    void getData();
    void delData();  
        file() { 
      cout << "file constructor called " << endl;
        }
    ~file() { 
      cout << "file destructor called " << endl;
    }

};

void file::getData()
{
  cout << "file getData method called" << endl;
}

void file::delData()
{
  cout << "file delData method called" << endl;
}

class db: public Idata {
  public:
    void getData();
    void delData();  
        db() { 
      cout << "db constructor called " << endl;
        }
    ~db() { 
      cout << "db destructor called " << endl;
    }

};

void db::getData()
{
  cout << "db getData method called" << endl;
}

void db::delData()
{
  cout << "db delData method called" << endl;
}

void main()
{
  Idata &obj = db();
  obj.getData();
  obj.delData();

  Idata *obj2 = new file();
  obj2->getData();
  delete obj2;
}