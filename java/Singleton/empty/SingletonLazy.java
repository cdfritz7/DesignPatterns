
public class SingletonLazy{

  //define singleton object

  private String log;

  private SingletonLazy(){
    //set the log to blank
  }

  public static SingletonLazy get_instance(){
    //create singleton object if it has not been created, then return the object
  }

  public void add_to_log(String s){
    //add string s to the current log - pay attention to newlines
  }

  public String get_log(){
    //return the current log
  }

}
