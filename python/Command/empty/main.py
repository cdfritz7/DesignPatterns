from Client import Client

if __name__ == "__main__":
    my_client = Client()

    print("Running Tests")

    my_client.order("AAPL", "BUY")
    my_client.order("GOOG", "BUY")
    my_client.order("GOOG", "SELL")
    my_client.order("AAPL", "BUY")

    my_history = my_client.get_history()

    assert(my_history[0].obj.name == "AAPL")
    assert(my_history[1].obj.name == "GOOG")
    assert(my_history[2].obj.name == "GOOG")
    assert(my_history[3].obj.name == "AAPL")

    print("Tests Passed")
