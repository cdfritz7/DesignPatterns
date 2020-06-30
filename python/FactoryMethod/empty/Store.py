from Product import Product

class Store(object):

    def __init__(self):
        """
        init an empty list of products
        """

    def add(self, name):
        """
        create a new product with the product classe's
        make_product method and add it to our list
        """

    def remove(self, name):
        """
        find the product with 'name' using the product classe's
        is_equal method and delete it
        """

    def get_inventory(self):
        """
        returns a string of the current products - with a newline after each
        """

    def make_product(self, name):
        """
        'abstract' method - should be implemented in child classes- content
        here should reflect that
        """
