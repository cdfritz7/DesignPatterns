public class main{

  public static void assertT(boolean b, String err) throws AssertionError{
    if(!b)
      throw new AssertionError(err);
  }

  public static void main(String[] args){

    System.out.println("Tests Started");

    Template haiku_one = new HaikuOne();
    Template haiku_two = new HaikuTwo();

    assertT(haiku_one.get_haiku().equals("Winter seclusion\nListening, that evening\nTo the rain in the mountain"), "Haiku One is incorrect");
    assertT(haiku_two.get_haiku().equals("My life,\nHow much more of it remains\nThe night is brief"), "Haiku Two is incorrect");

    System.out.println("Tests passed");
  }
}
