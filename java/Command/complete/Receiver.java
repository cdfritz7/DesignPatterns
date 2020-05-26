/*
the receiver is the stock that the commands are performed on
*/
class Receiver{
  public String name;

  //simply stores the name of the stock
  public Receiver(String my_name){
    this.name = my_name;
  }

  //simply prints what buy order has been executed
  public void buy(){
    System.out.println("Execute order : buy " + this.name);
  }

  //simply prints what sell order has been executed
  public void sell(){
    System.out.println("Execute order : sell " + this.name);
  }

}
