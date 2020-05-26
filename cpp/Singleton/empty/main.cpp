#include <stdio.h>
#include <iostream>
#include <stdexcept>
#include <cassert>

#include "SingletonEager.hpp"
#include "SingletonLazy.hpp"

using namespace std;

/*
simple class for testing the Singleton implementations
simply prints "A" and logs it's activities
*/
class ClassA{
private:
  SingletonLazy* lazy;
  SingletonEager* eager;
  bool is_lazy;

public:
  ClassA(){
    lazy = SingletonLazy::get_instance();
    is_lazy = false;
  }

  ClassA(string log_type){
    if(log_type == "eager"){
      eager = SingletonEager::get_instance();
      is_lazy = false;
    }else if(log_type == "lazy"){
      lazy = SingletonLazy::get_instance();
      is_lazy = true;
    }else{
      throw std::invalid_argument("ClassA argument must be 'lazy' or 'eager'");
    }
  }

  void printA(){
    cout<<"A"<<endl;
    if(is_lazy){
      (*lazy).add_to_log("ClassA printed A");
    }else{
      (*eager).add_to_log("ClassA printed A");
    }
  }
};

/*
simple class for testing the Singleton implementations
simply prints "B" and logs it's activities
*/
class ClassB{
private:
  SingletonLazy* lazy;
  SingletonEager* eager;
  bool is_lazy;

public:
  ClassB(){
    lazy = SingletonLazy::get_instance();
    is_lazy = false;
  }

  ClassB(string log_type){
    if(log_type == "eager"){
      eager = SingletonEager::get_instance();
      is_lazy = false;
    }else if(log_type == "lazy"){
      lazy = SingletonLazy::get_instance();
      is_lazy = true;
    }else{
      throw std::invalid_argument("ClassA argument must be 'lazy' or 'eager'");
    }
  }

  void printB(){
    cout<<"B"<<endl;
    if(is_lazy){
      (*lazy).add_to_log("ClassB printed B");
    }else{
      (*eager).add_to_log("ClassB printed B");
    }
  }
};

int main(){

  /*our test for the SingletonLazy class, has ClassA and ClassB log their
  activities then checks that the singleton has the right log*/
  cout<<"Lazy Singleton Test"<<endl;
  assert(SingletonLazy::obj == NULL);

  ClassA lazy_a("lazy");
  ClassB lazy_b("lazy");

  lazy_a.printA();
  lazy_b.printB();
  lazy_a.printA();

  SingletonLazy* lazy = SingletonLazy::get_instance();
  string lazy_string = "ClassA printed A\nClassB printed B\nClassA printed A";
  assert((*lazy).get_log() == lazy_string);
  cout<<"Test Passed"<<endl<<endl;

  /*our test for the SingletonEager class, has ClassA and ClassB log their
  activities then checks that the singleton has the right log*/
  cout<<"Eager Singleton Test"<<endl;
  assert(SingletonEager::obj != NULL);
  
  ClassA eager_a("eager");
  ClassB eager_b("eager");
  eager_a.printA();
  eager_b.printB();
  eager_a.printA();

  SingletonEager* eager = SingletonEager::get_instance();
  string eager_string = "ClassA printed A\nClassB printed B\nClassA printed A";
  assert((*eager).get_log() == eager_string);
  cout<<"Test Passed"<<endl;
}
