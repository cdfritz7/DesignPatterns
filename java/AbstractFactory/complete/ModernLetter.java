public class ModernLetter extends Letter{

  public ModernLetter(String content){
    super(content);
  }
  
  public String get_letter(){
    /*
    returns a string in the following format
    the header "--- Modern ---"
    the letter header
    the content
    */
    return "--- Modern ---\n"+this.letter_header()+"\n"+this.content;
  }
}
