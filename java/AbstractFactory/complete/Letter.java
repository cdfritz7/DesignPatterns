abstract class Letter{

  public String content;
  
  public Letter(String content){
    //save content parameter
    this.content = content;
  }

  public String letter_header(){
    return "--- Letter ---";
  }

  public abstract String get_letter();
}
