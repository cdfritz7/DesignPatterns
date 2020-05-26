class Template(object):
    '''
    the template class encapsulates the more complex behaviour by adding together
    creating a skeleton method in terms of a series of high level steps,
    here, we write the lines of a haiku
    '''

    def write_first_line(self):
        #this method is not implemented in this class so write it accordingly
        raise NotImplementedError

    def write_second_line(self):
        #this method is not implemented in this class so write it accordingly
        raise NotImplementedError

    def write_third_line(self):
        #this method is not implemented in this class so write it accordingly
        raise NotImplementedError

    def get_haiku(self):
        #append and return the three lines of the haiku
        return self.write_first_line() + "\n" + self.write_second_line() + "\n" + self.write_third_line()
