class VideoStore extends Store{

  /*Overrides make_product from parent - returns a new VideoProduct Object*/
  public Product make_product(String name){
    return new VideoProduct(name);
  }
}
