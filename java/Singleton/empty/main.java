public class main{

  public static void assertT(boolean b, String err) throws AssertionError{
    if(!b)
      throw new AssertionError(err);
  }

  public static void main(String[] args){

    /* what we will compare our logs to */
    String expected = "printed A\nprinted B\nprinted A";

    /*
    our test of the lazy singleton implementation, has each instatiation
    perform some action, then checks the log
    */
    System.out.println("Running Lazy Singleton Test");

    assert SingletonLazy.obj == null : " Lazy Singleton Instantiated too early";

    ExampleClass lazy_A = new ExampleClass("A", "lazy");
    ExampleClass lazy_B = new ExampleClass("B", "lazy");

    lazy_A.print();
    lazy_B.print();
    lazy_A.print();

    assertT(lazy_A.lazy_log.get_log().equals(expected), "lazy log A not correct");
    assertT(lazy_B.lazy_log.get_log().equals(expected), "lazy log B not correct");

    System.out.println("Lazy Singleton Test Passed");

    /*
    our test of the eager singleton implementation, has each instantiation
    perform some action, then checks the log
    */
    System.out.println("\nRunning Eager Singleton Test");

    assert SingletonEager.obj != null : " Eager Singleton not Instantiated";

    ExampleClass eager_A = new ExampleClass("A", "eager");
    ExampleClass eager_B = new ExampleClass("B", "eager");

    eager_A.print();
    eager_B.print();
    eager_A.print();

    assertT(eager_A.eager_log.get_log().equals(expected), "eager log A not correct");
    assertT(eager_B.eager_log.get_log().equals(expected), "eager log B not correct");

    System.out.println("Eager Singleton Test Passed");
  }
}
