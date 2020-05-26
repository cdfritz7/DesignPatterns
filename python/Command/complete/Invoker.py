from Command import Command

class Invoker(object):
    """
    the invoker class. Here, it represents a broker that records
    the command that took place
    """

    def __init__(self):
        #set the initial history to blank
        self.history = []

    def execute(self, command):
        #add command to history and execute the command
        self.history.append(command)
        command.execute()
