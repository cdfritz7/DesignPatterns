class SingletonEager:
    obj = None

    #initialization of static variable to owner class not allowed in python
    #so we do it in constructor
    def __init__(self):
        self.log = ""
        if(SingletonEager.obj == None):
            SingletonEager.obj = 1 #placeholder
            SingletonEager.obj = SingletonEager()

    @staticmethod
    def get_instance():
        return SingletonEager.obj

    def add_to_log(self, string):
        if(self.log == ""):
            self.log += string
        else:
            self.log += "\n"+string

    def get_log(self):
        return self.log
