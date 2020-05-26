import java.util.ArrayList;

/*
the "subject" or "observable" class, state changes in this class are sent to
the observer
*/
public class Observable {

  //initialize list of observer and state
  public ArrayList<Observer> observers = new ArrayList<Observer>();
  public String state = "";

  //add an observer and give it Observable's current state
  public void add_observer(Observer obs){
    observers.add(obs);
    obs.notify(this.state);
  }

  //remove an observer from our list
  public void remove_observer(Observer obs){
    this.observers.remove(obs);
  }

  //notify all observers about our current state
  public void notify_observers(){
    for(Observer obs : this.observers){
      obs.notify(this.state);
    }
  }

  //set the current state and notify our Observers of the change
  public void set_state(String state){
    this.state = state;
    this.notify_observers();
  }
}
