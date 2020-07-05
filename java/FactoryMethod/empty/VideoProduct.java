class VideoProduct extends Product{

  /*VideoProduct constructor, same functionality as Product Constructor*/
  public VideoProduct(String name){
  }

  /*returns true if the name matches this Product's name - case sensitive*/
  public Boolean is_equal(String name){
  }

  public String get_string(){
    return "Video : "+this.name;
  }
}
