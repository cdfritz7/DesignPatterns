from Adaptee import Adaptee

class Adapter(object):

    def __init__(self, name, age, eye_color):
        self.adaptee = Adaptee(name, age, eye_color)

    def get_name(self):
        return self.adaptee.name

    def set_name(self, name):
        self.adaptee.name = name

    def get_age(self):
        return self.adaptee.age

    def set_age(self, age):
        self.adaptee.age = age

    def get_eye_color(self):
        return self.adaptee.eye_color

    def set_eye_color(self, eye_color):
        self.adaptee.eye_color = eye_color
