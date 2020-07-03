from DocumentFactory import DocumentFactory
from ModernDocuments import *

class ModernDocumentFactory(DocumentFactory):

    def create_resume(self, content):
        '''
        returns a new ModernResume object with the content parameter
        '''
        return ModernResume(content)

    def create_letter(self, content):
        '''
        returns a new ModernLetter object with the content parameter
        '''
        return ModernLetter(content)
