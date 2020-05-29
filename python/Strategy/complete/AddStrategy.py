from Strategy import Strategy

class AddStrategy(Strategy):

    def execute(self, num1, num2):
        #override execute from parent to add two numbers
        return num1 + num2
