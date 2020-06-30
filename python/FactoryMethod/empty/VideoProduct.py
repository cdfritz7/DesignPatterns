from Product import Product

class VideoProduct(Product):

    def is_equal(self, name):
        '''
        returns true if the name matches this products name - case sensitive
        '''

    def get_string(self):
        '''return a string of the form "Video : video_name"'''
