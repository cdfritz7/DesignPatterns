public class LegalResume extends Resume{

  public LegalResume(String content){
    super(content);
  }
  
  public String get_resume(){
    /*
    returns a string in the following format
    the header "--- Legal ---"
    the resume header
    the content
    */
    return "--- Legal ---\n"+this.resume_header()+"\n"+this.content;
  }
}
