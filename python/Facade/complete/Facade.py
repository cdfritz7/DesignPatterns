from datetime import datetime

class Seconds(object):
    '''interface for getting the seconds part of the current time'''
    def get(self):
        return str(datetime.now().time())[6:8]

class Minutes(object):
    '''interface for getting the minutes portion of the current time'''
    def get(self):
        return str(datetime.now().time())[3:5]

class Hours(object):
    '''interface for getting the hours portion of the current time'''
    def get(self):
        return str(datetime.now().time())[0:2]

class Facade(object):
    '''
    a simple interface for getting the current time, combines Seconds,
    Hours and Minutes classes
    '''

    def get_time(self):
        sec = Seconds().get()
        min = Minutes().get()
        hrs = Hours().get()

        return hrs + ":" + min + ":" + sec
