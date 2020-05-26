public class HaikuTwo extends Template{
  /*
  Overrides the abstract methods from superclass Template to write a haiku
  My life,
  How much more of it remains
  The night is brief
  */

  @Override
  public String write_first_line(){
    return "My life,";
  }

  @Override
  public String write_second_line(){
    return "How much more of it remains";
  }

  @Override
  public String write_third_line(){
    return "The night is brief";
  }
}
