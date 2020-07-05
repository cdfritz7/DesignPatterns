class MusicStore extends Store{

  /*Overrides from parent - return a new MusicProduct Object*/
  public Product make_product(String name){
    return new MusicProduct(name);
  }
}
