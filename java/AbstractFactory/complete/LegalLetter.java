public class LegalLetter extends Letter{

  public LegalLetter(String content){
    super(content);
  }
  
  public String get_letter(){
    /*
    returns a string in the following format
    the header "--- Legal ---"
    the letter header
    the content
    */
    return "--- Legal ---\n"+this.letter_header()+"\n"+this.content;
  }
}
