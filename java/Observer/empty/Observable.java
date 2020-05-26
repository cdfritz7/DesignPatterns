import java.util.ArrayList;

/*
the "subject" or "observable" class, state changes in this class are sent to
the observer
*/
public class Observable {

  //initialize list of observer and state

  //add an observer and give it Observable's current state
  public void add_observer(Observer obs){}

  //remove an observer from our list
  public void remove_observer(Observer obs){}

  //notify all observers about our current state
  public void notify_observers(){}

  //set the current state and notify our Observers of the change
  public void set_state(String state){}
}
