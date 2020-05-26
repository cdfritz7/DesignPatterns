
public class SingletonEager {

  //create singleton object

  private String log;

  private SingletonEager(){
    //set the log to blank
  }

  public static SingletonEager get_instance(){
    //return the Singleton object
  }

  public void add_to_log(String s){
    //add String s to the current log - pay attention to newlines
  }

  public String get_log(){
    //return the current log
  }
}
