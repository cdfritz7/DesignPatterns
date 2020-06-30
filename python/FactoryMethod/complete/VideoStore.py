from Store import Store
from VideoProduct import VideoProduct

class VideoStore(Store):
    
    def make_product(self, name):
        '''Ovverides from parent - return a new VideoProduct Object'''
        return VideoProduct(name)
