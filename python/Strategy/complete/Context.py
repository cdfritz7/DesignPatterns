from Strategy import Strategy

class Context(object):

    def __init__(self):
        #set the initial strategy
        self.strategy = None

    def change_strategy(self, strat):
        #change current strategy to passed in strat
        self.strategy = strat

    def execute_strategy(self, num1, num2):
        #execute the current stategy on passed in numbers
        return self.strategy.execute(num1, num2)
