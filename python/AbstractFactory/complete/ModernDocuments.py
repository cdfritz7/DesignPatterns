from AbstractDocuments import *

class ModernResume(Resume):

    def get_resume(self):
        '''
        returns a string in the following format:
        the header "--- Modern ---",
        the resume header
        the content
        '''
        return "--- Modern ---\n"+self.resume_header()+'\n'+self.content

class ModernLetter(Letter):

    def get_letter(self):
        '''
        returns a string in the following format:
        the header "--- Modern ---",
        the letter header
        the content
        '''
        return "--- Modern ---\n"+self.letter_header()+'\n'+self.content
