from Store import Store
from MusicProduct import MusicProduct

class MusicStore(Store):

    def make_product(self, name):
        '''Overides from parent - return a new MusicProduct Object'''
