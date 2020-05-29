from Adaptee import Adaptee

class Adapter(object):

    def __init__(self, name, age, eye_color):
        self.adaptee = Adaptee(name, age, eye_color)

    #add getter and setter methods for each Adaptee attribute
