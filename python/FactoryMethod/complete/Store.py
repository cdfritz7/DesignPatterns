from Product import Product

class Store(object):

    def __init__(self):
        """
        init an empty list of products
        """
        self.products = []

    def add(self, name):
        """
        create a new product with the product classe's
        make_product method and add it to our list
        """
        new_product = self.make_product(name)
        self.products.append(new_product)

    def remove(self, name):
        """
        find the product with 'name' using the product classe's
        is_equal method and delete it
        """
        for i in range(len(self.products)-1, -1, -1):
            if self.products[i].is_equal(name):
                del self.products[i]

    def get_inventory(self):
        """
        returns a string of the current products - with a newline after each
        """
        cur_str = ""
        for product in self.products:
            cur_str += product.get_string()+"\n"
        return cur_str

    def make_product(self, name):
        """
        'abstract' method - should be implemented in child classes- content
        here should reflect that
        """
        raise NotImplementedError("Implement make_product in child classes")
