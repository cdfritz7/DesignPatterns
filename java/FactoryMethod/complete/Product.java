abstract class Product{

  String name = "";

  public Product(String name){
    //sets the name of the product
    this.name = name;
  }

  public abstract Boolean is_equal(String name);
  public abstract String get_string();
}
