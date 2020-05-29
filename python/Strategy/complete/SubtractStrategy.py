from Strategy import Strategy

class SubtractStrategy(Strategy):

    def execute(self, num1, num2):
        #override execute from Strategy to substract two numbers
        return num1 - num2
