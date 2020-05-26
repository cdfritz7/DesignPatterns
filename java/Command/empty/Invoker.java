import java.util.ArrayList;

/*
the invoker class. Here, it represents a broker that records
the command that took place
*/
class Invoker{
  public ArrayList<Command> history = new ArrayList<Command>();

  //add command to history and execute the command
  public void execute(Command cmd){
  }
}
