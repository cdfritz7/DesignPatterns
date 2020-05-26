import java.util.ArrayList;

class main{
  public static void main(String[] args){
    Client my_client = new Client();

    System.out.println("Running Tests");

    my_client.order("AAPL", "BUY");
    my_client.order("GOOG", "BUY");
    my_client.order("GOOG", "SELL");
    my_client.order("AAPL", "BUY");

    ArrayList<Command> my_history = my_client.get_history();

    assert my_history.get(0).obj.name == "AAPL" : "First stock name incorrect";
    assert my_history.get(1).obj.name == "GOOG" : "second stock name incorrect";
    assert my_history.get(2).obj.name == "GOOG" : "third stock name incorrect";
    assert my_history.get(3).obj.name == "AAPL" : "fourth stock name incorrect";

    System.out.println("Tests Passed");
  }
}
