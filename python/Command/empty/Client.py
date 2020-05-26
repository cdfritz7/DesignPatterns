from Invoker import Invoker
from Command import Command
from Receiver import Receiver
from BuyCommand import BuyCommand
from SellCommand import SellCommand

class Client:
    """
    this is the client class, it takes order inputs, and uses
    the invoker (broker) to buy and sell stocks, there is no complex internal
    logic implemented here. For instance, you can sell stocks you don't have
    """

    def __init__(self):
        #save a new invoker (broker) as an attribute

    def order(self, name, cmd):
        #tell the invoker(broker) to execute a command based on a new receiver(stock)

    def get_history(self):
        #returns the history of the invoker
