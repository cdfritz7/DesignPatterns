class main{

  public static void assertT(boolean b, String err) throws AssertionError{
    if(!b)
      throw new AssertionError(err);
  }

  public static void main(String[] args){

    System.out.println("Running Tests");

    DocumentFactory legal_factory = new LegalDocumentFactory();
    Letter legal_letter = legal_factory.create_letter("Hello, world");
    Resume legal_resume = legal_factory.create_resume("No Work Experience");
    String ll_str = legal_letter.get_letter();
    String lr_str = legal_resume.get_resume();

    assertT(ll_str.equals("--- Legal ---\n--- Letter ---\nHello, world"), "Failed Legal Letter Test");
    assertT(lr_str.equals("--- Legal ---\n--- Resume ---\nNo Work Experience"), "Failed Legal Resume Test");

    DocumentFactory modern_factory = new ModernDocumentFactory();
    Letter modern_letter = modern_factory.create_letter("Wherefore art thou");
    Resume modern_resume = modern_factory.create_resume("CEO, McDonalds");
    String ml_str = modern_letter.get_letter();
    String mr_str = modern_resume.get_resume();

    assertT(ml_str.equals("--- Modern ---\n--- Letter ---\nWherefore art thou"), "Failed Modern Letter Test");
    assertT(mr_str.equals("--- Modern ---\n--- Resume ---\nCEO, McDonalds"), "Failed Modern Resume Test");

    System.out.println("Tests Passed");
  }
}
