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
    //return the current singleton object
  }

  void add_to_log(string s){
    //append s to the log
  }

  string get_log(){
    //return the current log
  }
};

//instantiate the class wide singleton object here

#endif
