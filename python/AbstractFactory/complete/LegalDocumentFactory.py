from DocumentFactory import DocumentFactory
from LegalDocuments import *

class LegalDocumentFactory(DocumentFactory):

    def create_resume(self, content):
        '''
        returns a new LegalResume object with the content parameter
        '''
        return LegalResume(content)

    def create_letter(self, content):
        '''
        returns a new LegalLetter object with the content parameter
        '''
        return LegalLetter(content)
