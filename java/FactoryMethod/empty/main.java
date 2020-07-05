class main{

  public static void assertT(boolean b, String err) throws AssertionError{
    if(!b)
      throw new AssertionError(err);
  }

  public static void main(String[] args){
    System.out.println("Starting Tests");

    /*
    create our music store object, and run tests by adding and deleting products
    removals in the video store are case sensitive
    */
    Store video_store = new VideoStore();

    video_store.add("Citizen Kane");
    video_store.add("Pulp Fiction");
    video_store.add("The Notebook");

    assertT(video_store.get_inventory().equals("Video : Citizen Kane\nVideo : Pulp Fiction\nVideo : The Notebook\n"),
            "Error at initial video_store assertion");

    video_store.remove("Citizen Kane");
    video_store.remove("pUlp FicTion");
    video_store.add("Toy Story");

    assertT(video_store.get_inventory().equals("Video : Pulp Fiction\nVideo : The Notebook\nVideo : Toy Story\n"),
            "Error at second video_store assertion");

    /*
    create our music store object, and run tests by adding and deleting products
    removals from the music store are case-insensitive
    */
    Store music_store = new MusicStore();

    music_store.add("Fur Elise");
    music_store.add("Otherside");
    music_store.add("Wonderwall");

    assertT(music_store.get_inventory().equals("Music : Fur Elise\nMusic : Otherside\nMusic : Wonderwall\n"),
            "Error at first music_store assertion");

    music_store.remove("Wonderwall");
    music_store.remove("otherSiDe");
    music_store.add("All Star");

    assertT(music_store.get_inventory().equals("Music : Fur Elise\nMusic : All Star\n"),
            "Error at second music_store assertion");

    System.out.println("Tests Passed");
  }
}
