from AbstractDocuments import *

class LegalResume(Resume):

    def get_resume(self):
        '''
        returns a string in the following format:
        the header "--- Legal ---",
        the resume header
        the content
        '''

class LegalLetter(Letter):

    def get_letter(self):
        '''
        returns a string in the following format:
        the header "--- Legal ---",
        the letter header
        the content
        '''
