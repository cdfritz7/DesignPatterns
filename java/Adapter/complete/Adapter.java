public class Adapter{
  public Adaptee adaptee;

  public Adapter(String name, int age, String eye_color){
    adaptee = new Adaptee(name, age, eye_color);
  }

  public String get_name(){
    return adaptee.name;
  }

  public void set_name(String name){
    adaptee.name = name;
  }

  public int get_age(){
    return adaptee.age;
  }

  public void set_age(int age){
    adaptee.age = age;
  }

  public String get_eye_color(){
    return adaptee.eye_color;
  }

  public void set_eye_color(String eye_color){
    adaptee.eye_color = eye_color;
  }
}
