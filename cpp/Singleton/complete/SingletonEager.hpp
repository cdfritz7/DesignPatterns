#ifndef SINGLETON_EAGER
#define SINGLETON_EAGER

#include <string>

using namespace std;

class SingletonEager{
private:
  string log = "";

public:
  static SingletonEager *obj;

  static SingletonEager* get_instance(){
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


SingletonEager *SingletonEager::obj = new SingletonEager();

#endif
