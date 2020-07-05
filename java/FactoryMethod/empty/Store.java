import java.util.ArrayList;

abstract class Store{

  public ArrayList<Product> products = new ArrayList<Product>();

  /*
  create a new product with the product class'
  make_product method and add it to our list
  */
  public void add(String name){
  }

  /*
  find the product with 'name' in our Product ArrayList using the product class'
  is_equal  method and delete it
  */
  public void remove(String name){
  }

  /*
  return a string of the current products, with a newline after each
  */
  public String get_inventory(){
  }

  /*
  add the make_product(String name) method here
  an abstract method that creates a new product, this is the Factory method
  implemented in children classes
  */
}
