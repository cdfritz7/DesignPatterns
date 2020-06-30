class Product(object):

    def __init__(self, name):
        '''
        sets the name attribute of product
        '''
        self.name = name

    def is_equal(self, product):
        '''
        should be implemented in child classes -
        implementation here should reflect that
        '''
        raise NotImplementedError("Implement is_equal in child classes")

    def get_string(self):
        '''
        should be implemented in child classes -
        implementation here should reflect that
        '''
        raise NotImplementedError("Implement get_string in child classes")
