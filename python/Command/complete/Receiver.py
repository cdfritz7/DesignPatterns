class Receiver(object):
    """
    the receiver is the stock that the commands are performed on
    """

    def __init__(self, name):
        #simply stores the name of the stock
        self.name = name

    def buy(self):
        #simply prints what buy order has been executed
        print("Execute order : buy " + self.name)

    def sell(self):
        #simply prints what sell order has been executed
        print("Execute order : sell " + self.name)
