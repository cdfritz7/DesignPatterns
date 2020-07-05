class VideoProduct extends Product{

  /*VideoProduct constructor, same functionality as Product Constructor*/
  public VideoProduct(String name){
    super(name);
  }
  
  /*returns true if the name matches this products name - case sensitive*/
  public Boolean is_equal(String name){
    return this.name.equals(name);
  }

  public String get_string(){
    return "Video : "+this.name;
  }
}
