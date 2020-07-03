class DocumentFactory(object):

    def create_resume(self, content):
        '''
        returns a resume object, abstract method here, implementation should
        reflect that
        '''
        raise NotImplementedError("create_resume abstract in DocumentFactory")

    def create_letter(self, content):
        '''
        returns a letter object, abstract method here, implementation should
        reflect that
        '''
        raise NotImplementedError("create_letter abstact in DocumentFactory")
