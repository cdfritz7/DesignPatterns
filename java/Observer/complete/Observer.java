public class Observer {

  //set the initial parent state
  public String parent_state = "";

  //set parent state based on notification
  public void notify(String ps){
    this.parent_state = ps;
  }
}
