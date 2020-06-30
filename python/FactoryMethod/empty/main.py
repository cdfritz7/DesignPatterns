from MusicStore import MusicStore
from VideoStore import VideoStore

if __name__ == "__main__":

    print("Tests Started")

    '''
    create our music store object, and run tests by adding and deleting products
    removals in the vide store are case sensitive
    '''
    video_store = VideoStore()

    video_store.add("Citizen Kane")
    video_store.add("Pulp Fiction")
    video_store.add("The Notebook")

    assert(video_store.get_inventory() == """Video : Citizen Kane
Video : Pulp Fiction
Video : The Notebook
""")

    video_store.remove("Citizen Kane")
    video_store.remove("pUlp FicTion")
    video_store.add("Toy Story")

    assert(video_store.get_inventory() == """Video : Pulp Fiction
Video : The Notebook
Video : Toy Story
""")

    '''
    create our music store object, and run tests by adding and deleting products
    removals in the music store are case-insensitve
    '''
    music_store = MusicStore()

    music_store.add("Fur Elise")
    music_store.add("Otherside")
    music_store.add("Wonderwall")

    assert(music_store.get_inventory() == """Music : Fur Elise
Music : Otherside
Music : Wonderwall
""")

    music_store.remove("Wonderwall")
    music_store.remove("otherSide")
    music_store.add("All Star")

    assert(music_store.get_inventory() == """Music : Fur Elise
Music : All Star
""")

    print("Tests Passed")
