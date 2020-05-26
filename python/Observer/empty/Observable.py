from Observer import Observer

class Observable(object):
    '''
    the 'subject' or 'observable' class, state changes in this class are sent to the
    observers
    '''

    def __init__(self):
        #initialize our list of observers and our state

    def add_observer(self, obs):
        #add an observer to our list of observers and notify it of current state

    def remove_observer(self, obs):
        #remove an observer from our list

    def notify_observers(self):
        #notify observers of current state

    def set_state(self, state):
        #set the current state and notify observers of change
