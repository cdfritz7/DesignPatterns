from Command import Command
from Receiver import Receiver

class SellCommand(Command):
    """command object for buying a stock"""

    def execute(self):
        #executes the sell command of the stored object
        self.obj.sell()
