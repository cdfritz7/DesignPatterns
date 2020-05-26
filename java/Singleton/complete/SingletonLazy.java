
public class SingletonLazy{
  public static SingletonLazy obj = null;
  private String log;

  private SingletonLazy(){
    log = "";
  }

  public static SingletonLazy get_instance(){
    //create singleton object if it has not been created, then return the object
    if(obj == null){
      obj = new SingletonLazy();
    }

    return obj;
  }

  public void add_to_log(String s){
    //add string s to the current log
    if(log.equals(""))
      log = s;
    else
      log = log + "\n" + s;
  }

  public String get_log(){
    //return the current log
    return log;
  }

}
