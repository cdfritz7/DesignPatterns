from Command import Command
from Receiver import Receiver

class BuyCommand(Command):
    """command object for selling a stock"""

    def execute(self):
        #executes the buy operation on the stored object
        self.obj.buy()
