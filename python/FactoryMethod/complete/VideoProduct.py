from Product import Product

class VideoProduct(Product):

    def is_equal(self, name):
        '''
        returns true if the name matches this products name - case sensitive
        '''
        return self.name == name

    def get_string(self):
        return "Video : "+self.name
