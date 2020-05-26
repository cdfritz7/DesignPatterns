public class main{
  public static void main(String[] args){

    System.out.println("Tests Started");

    Template haiku_one = new HaikuOne();
    Template haiku_two = new HaikuTwo();

    assert haiku_one.get_haiku() == "Winter seclusion\nListening, that evening\nTo the rain in the mountain" : "Haiku One is incorrect";
    assert haiku_two.get_haiku() == "My life,\nHow much more of it remains\nThe night is brief";

    System.out.println("Tests passed");
  }
}
