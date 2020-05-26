class Command(object):
    """
    The command interface, stores the receiver (stock) the command will be
    performed on, and provides the abstract execute() which is implemented by
    children
    """

    def __init__(self, obj):
        #stores the receiver (stock) the command will be performed on

    def execute(self):
        #this method is not implemented so write it accordingly
