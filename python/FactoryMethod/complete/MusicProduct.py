from Product import Product

class MusicProduct(Product):

    def is_equal(self, name):
        '''
        returns true if the name matches this products name - case insensitive
        '''
        return self.name.lower() == name.lower()

    def get_string(self):
        return "Music : "+self.name
