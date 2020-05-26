class Observer(object):
    '''
    the observer class, receives notifications from the Observable (subject) class
    about it's changes in state
    '''

    def __init__(self):
        #set the initial parent state
        self.parent_state = ""

    def notify(self, p_state):
        #set parent state based on notification
        self.parent_state = p_state
