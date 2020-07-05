class MusicProduct extends Product{

  /*MusicProduct constructor, same functionality as Product constructor*/
  public MusicProduct(String name){
    super(name);
  }

  /*returns true if the name matches this products name - case insensitive*/
  public Boolean is_equal(String name){
    return this.name.toLowerCase().equals(name.toLowerCase());
  }

  public String get_string(){
    return "Music : "+this.name;
  }
}
