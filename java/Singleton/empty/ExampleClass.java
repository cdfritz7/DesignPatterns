public class ExampleClass {

  public String my_string;
  public SingletonEager eager_log;
  public SingletonLazy lazy_log;
  public boolean is_lazy;

  /*default constructor, prints "A", eager Singleton logger */
  public ExampleClass(){
    my_string = "A";
    is_lazy = false;
  }

  /*
  constructor, out_string is the string to be printed by the classs,
  logger_type is one of {"eager", "lazy"} and defines the type of Singleton
  implementation
  */
  public ExampleClass(String out_string, String logger_type){
    my_string = out_string;

    if(logger_type.equals("lazy")){
      is_lazy = true;
      lazy_log = SingletonLazy.get_instance();
    }else if(logger_type.equals("eager")){
      is_lazy = false;
      eager_log = SingletonEager.get_instance();
    }else{
      throw new IllegalArgumentException("Invalid logger_type");
    }
  }

  /* outputs predefined string and logs behaviour */
  public void print(){
    System.out.println(my_string);

    if(is_lazy)
      lazy_log.add_to_log("printed " + my_string);
    else
      eager_log.add_to_log("printed " + my_string);
  }
}
