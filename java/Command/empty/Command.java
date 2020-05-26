/*
The command interface, provides the abstract execute() which is implemented by
children
*/
public abstract class Command{
  public Receiver obj;

  //stores the receiver object (stock)
  public Command(Receiver my_obj){
  }

  abstract void execute();
}
