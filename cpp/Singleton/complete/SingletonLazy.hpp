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
    if(!obj){
      obj = new SingletonLazy;
    }
    return obj;
  }

  void add_to_log(string s){
    if(log != "")
      log = log + "\n";
    log = log + s;
  }

  string get_log(){
    return log;
  }
};

SingletonLazy *SingletonLazy::obj = NULL;

#endif
