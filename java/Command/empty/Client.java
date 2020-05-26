import java.util.ArrayList;

/*
this is the client class, it takes order inputs, and uses
the invoker (broker) to buy and sell stocks, there is no complex internal
logic implemented here. For instance, you can sell stocks you don't have
*/
class Client{

  //save a new invoker (broker) as an attribute

  //tell the invoker(broker) to execute a command based on a new receiver(stock)
  public void order(String name, String cmd){
  }

  //returns the history of the invoker
  public ArrayList<Command> get_history(){
  }
}
