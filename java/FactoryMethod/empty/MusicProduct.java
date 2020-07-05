class MusicProduct extends Product{

  /*MusicProduct constructor, same functionality as Product constructor
  saves a string parameter designating the name of the product*/
  public MusicProduct(String name){
  }

  /*returns true if the name matches this products name - case insensitive
  ovverides the abstract is_equal method from Product*/
  public Boolean is_equal(String name){
  }

  public String get_string(){
    return "Music : "+this.name;
  }
}
