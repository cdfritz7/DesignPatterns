public class HaikuOne extends Template{
  /*
  Overrides the abstract methods from superclass Template to write a haiku
  Winter seclusion
  Listening, that evening
  To the rain in the mountain
  */

  @Override
  public String write_first_line(){
    return "Winter seclusion";
  }

  @Override
  public String write_second_line(){
    return "Listening, that evening";
  }

  @Override
  public String write_third_line(){
    return "To the rain in the mountain";
  }
}
