public abstract class Template{
  /*
  the template class encapsulates the more complex behaviour by adding together
  creating a skeleton method in terms of a series of high level steps,
  here, we write the lines of a haiku
  */

  public abstract String write_first_line();
  public abstract String write_second_line();
  public abstract String write_third_line();

  //get the three appended lines of the haiku
  public String get_haiku(){
    return write_first_line()+"\n"+write_second_line()+"\n"+write_third_line();
  }
}
