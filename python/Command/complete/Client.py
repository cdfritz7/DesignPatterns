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
        self.invoker = Invoker()

    def order(self, name, cmd):
        cmd = cmd.strip().upper()

        #tell the invoker(broker) to execute a command based on a new receiver(stock)
        if(cmd == "BUY"):
            self.invoker.execute(BuyCommand(Receiver(name)))
        elif(cmd == "SELL"):
            self.invoker.execute(SellCommand(Receiver(name)))
        else:
            raise ValueError("Invalid command in Client.order")

    def get_history(self):
        #returns the history of the invoker
        return self.invoker.history
