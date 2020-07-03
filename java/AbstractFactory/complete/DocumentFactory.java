public abstract class DocumentFactory{

  //create_resume abstract method
  public abstract Resume create_resume(String content);

  //create_letter abstract method
  public abstract Letter create_letter(String content);
}
