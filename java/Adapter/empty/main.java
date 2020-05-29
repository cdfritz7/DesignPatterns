public class main{
  public static void assertT(boolean b) throws AssertionError{
    if(!b)
      throw new AssertionError();
  }

  public static void main(String[] args){
    /*
    for some reason we cannot use the original Adaptee interface, instead, we
    must have getters and setters for each attribute. To solve this, we use the
    Adapter Design Pattern to create a new interface (Adapter) that fulfills our
    requirements
    */

    System.out.println("Starting Testing");

    Adapter person1 = new Adapter("Rogelio", 25, "blue");
    Adapter person2 = new Adapter("Adelaide", 43, "green");
    Adapter person3 = new Adapter("Jonathan", 5, "brown");

    assertT(person1.get_name().equals("Rogelio"));
    assertT(person2.get_age() == 43);
    assertT(person3.get_eye_color().equals("brown"));

    assert(person2.adaptee != null);

    System.out.println("Changing Attributes");

    person1.set_age(26);
    person2.set_name("Andrew");
    person3.set_eye_color("violet");

    assertT(person1.get_age() == 26);
    assertT(person1.get_eye_color().equals("blue"));
    assertT(person2.get_name().equals("Andrew"));
    assertT(person2.get_eye_color().equals("green"));
    assertT(person3.get_eye_color().equals("violet"));
    assertT(person3.get_age() == 5);

    assertT(person1.adaptee != null);
    assertT(person2.adaptee != null);
    assertT(person3.adaptee != null);

    System.out.println("Tests Passed");
  }
}
