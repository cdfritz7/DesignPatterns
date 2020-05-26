public class main{
  public static void main(String[] args){
    /*
    here, the Observable represents a parent process that notifies its children
    (Observers) about its current state
    */

    System.out.println("Running Tests");

    Observable parent = new Observable();

    Observer child_1 = new Observer();
    Observer child_2 = new Observer();
    Observer child_3 = new Observer();

    System.out.println("Children Added");

    assert parent.state.equals("ready") : "Initial parent state not correct";

    parent.add_observer(child_1);
    parent.add_observer(child_2);
    parent.add_observer(child_3);

    parent.notify_observers();

    assert parent.state.equals("ready") : "Second parent state check not correct";
    assert child_1.parent_state.equals("ready") : "Child 1 state not correct";
    assert child_2.parent_state.equals("ready") : "Child 2 state not correct";
    assert child_3.parent_state.equals("ready") : "Child 3 state not correct";

    parent.remove_observer(child_2);

    //change the state, this should notify children automatically
    parent.set_state("running");

    System.out.println("Parent State Changed");
    
    assert parent.state.equals("running");
    assert child_1.parent_state.equals("running");
    assert child_2.parent_state.equals("running");
    assert child_3.parent_state.equals("running");

    System.out.println("Tests Passed");
  }
}
