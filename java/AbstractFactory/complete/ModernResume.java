public class ModernResume extends Resume{

  public ModernResume(String content){
    super(content);
  }
  
  public String get_resume(){
    /*
    returns a string in the following format
    the header "--- Modern ---"
    the resume header
    the content
    */
    return "--- Modern ---\n"+this.resume_header()+"\n"+this.content;
  }
}
