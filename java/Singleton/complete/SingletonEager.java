
public class SingletonEager {
  public static SingletonEager obj = new SingletonEager();
  private String log;

  private SingletonEager(){
    //set the log to blank
    log = "";
  }

  public static SingletonEager get_instance(){
    //return the Singleton object
    return obj;
  }

  public void add_to_log(String s){
    //add String s to the current log
    if(log.equals(""))
      log = log + s;
    else
      log = log + "\n" + s;
  }

  public String get_log(){
    return log;
  }
}
