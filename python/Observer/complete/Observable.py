from Observer import Observer

class Observable(object):
    '''
    the 'subject' or 'observable' class, state changes in this class are sent to the
    observers
    '''

    def __init__(self):
        #initialize our list of observers
        self.observers = []
        self.state = "ready"

    def add_observer(self, obs):
        #add an observer to our list of observers and notify it
        self.observers.append(obs)
        obs.notify(self.state)

    def remove_observer(self, obs):
        #remove an observer from our list
        self.observers = list(filter(lambda x : x != obs, self.observers))

    def notify_observers(self):
        #notify observers of current state
        for obs in self.observers:
            obs.notify(self.state)

    def set_state(self, state):
        #set the current state and notify observers of change
        self.state = state
        self.notify_observers()
