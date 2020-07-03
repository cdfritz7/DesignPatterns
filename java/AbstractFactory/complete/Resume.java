abstract class Resume{

  public String content;
  
  public Resume(String content){
    //save content parameter as attribute
    this.content = content;
  }

  public String resume_header(){
    return "--- Resume ---";
  }

  public abstract String get_resume();
}
