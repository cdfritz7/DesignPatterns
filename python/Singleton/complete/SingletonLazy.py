class SingletonLazy:
    obj = None
    
    def __init__(self):
        self.log = ""
            
    @staticmethod
    def get_instance():
        if(SingletonLazy.obj == None):
            SingletonLazy.obj = SingletonLazy()
        return SingletonLazy.obj
    
    def add_to_log(self, string):
        if(self.log == ""):
            self.log += string
        else:
            self.log += "\n"+string
        
    def get_log(self):
        return self.log