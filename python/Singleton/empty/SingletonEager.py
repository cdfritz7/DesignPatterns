class SingletonEager:
    obj = None

    #initialization of static variable to owner class not allowed in python
    #so we do it in constructor
    def __init__(self):
        #instantiate class on init and set log to blank

    @staticmethod
    def get_instance():
        #return the single instance

    def add_to_log(self, string):
        #append "string" to the current log

    def get_log(self):
        #return the current log
