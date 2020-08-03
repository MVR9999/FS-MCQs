#include <iostream>
using namespace std;

class data {
  public:
    virtual void getData();
    virtual void delData();  
    data() { 
      cout << "data constructor called " << endl;
    }
    virtual ~data() { 
      cout << "data destructor called " << endl;
    }
};

void data::getData()
{
  cout << "data getData method called" << endl;
}

void data::delData()
{
  cout << "data delData method called" << endl;
}

class file: public data {
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

class db: public data {
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
  data &obj = file();
  //data *obj = new file();
  cout << "size of data " << sizeof(data) << endl;
  obj.getData();
  obj.delData();
  //delete obj;
}