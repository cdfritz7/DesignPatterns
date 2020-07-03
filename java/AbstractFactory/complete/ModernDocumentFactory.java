class ModernDocumentFactory extends DocumentFactory{

  public Resume create_resume(String content){
    //returns a new LegalResume object with the content parameter
    return new ModernResume(content);
  }

  public Letter create_letter(String content){
    //returns a new LegalLetter object with the content parameter
    return new ModernLetter(content);
  }
}
