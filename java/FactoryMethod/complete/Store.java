import java.util.ArrayList;

abstract class Store{

  public ArrayList<Product> products = new ArrayList<Product>();

  /*
  create a new product with the product class'
  make_product method and add it to our list
  */
  public void add(String name){
    Product new_product = this.make_product(name);
    this.products.add(new_product);
  }

  /*
  find the product with 'name' using the product class'
  is_equal  method and delete it
  */
  public void remove(String name){
    for(int i = this.products.size()-1; i >= 0; i--){
      if(this.products.get(i).is_equal(name)){
        this.products.remove(i);
      }
    }
  }

  /*
  return a string of the current products, with newline after each
  */
  public String get_inventory(){
    String cur_str = "";
    for(Product p : this.products){
      cur_str += p.get_string()+"\n";
    }
    return cur_str;
  }

  public abstract Product make_product(String name);
}
