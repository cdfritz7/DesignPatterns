/*command object for selling a stock*/
class SellCommand extends Command {

  //constructor to save receiver
  public SellCommand(Receiver my_obj){
    super(my_obj);
  }

  //executes the buy operation on the stored object
  public void execute(){
    this.obj.buy();
  }
}
