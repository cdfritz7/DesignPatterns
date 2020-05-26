import java.util.ArrayList;

/*
this is the client class, it takes order inputs, and uses
the invoker (broker) to buy and sell stocks, there is no complex internal
logic implemented here. For instance, you can sell stocks you don't have
*/
class Client{

  //save a new invoker (broker) as an attribute
  public Invoker broker = new Invoker();

  //tell the invoker(broker) to execute a command based on a new receiver(stock)
  public void order(String name, String cmd){
    if(cmd.equals("BUY")){
      this.broker.execute(new BuyCommand(new Receiver(name)));
    }else if(cmd.equals("SELL")){
      this.broker.execute(new SellCommand(new Receiver(name)));
    }else{
      throw new java.lang.IllegalArgumentException("cmd must be 'BUY' or 'SELL'");
    }
  }

  //returns the history of the invoker
  public ArrayList<Command> get_history(){
    return this.broker.history;
  }
}
