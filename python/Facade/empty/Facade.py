from datetime import datetime

class Seconds(object):
    '''interface for getting the seconds part of the current time'''

class Minutes(object):
    '''interface for getting the minutes portion of the current time'''

class Hours(object):
    '''interface for getting the hours portion of the current time'''

class Facade(object):
    '''
    a simple interface for getting the current time, combines Seconds,
    Hours and Minutes classes
    '''

    def get_time(self):
        
