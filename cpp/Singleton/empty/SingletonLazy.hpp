#ifndef SINGLETON_LAZY
#define SINGLETON_LAZY

#include <string>

using namespace std;

class SingletonLazy{
private:
  string log = "";

public:
  static SingletonLazy *obj;

  static SingletonLazy* get_instance(){
    //complete this method to instantiate or return the Singleton object
  }

  void add_to_log(string s){
    //append s to the current log
  }

  string get_log(){
    //return the current log
  }
};

SingletonLazy *SingletonLazy::obj = NULL;

#endif
