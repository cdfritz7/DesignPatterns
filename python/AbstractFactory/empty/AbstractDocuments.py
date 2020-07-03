class Resume(object):
    def __init__(self, content):
        ''' save content parameter '''

    def resume_header(self):
        return "--- Resume ---"

    def ger_resume(self):
        '''implemented in child classes, implementation here should reflect that'''

class Letter(object):
    def __init__(self, content):
        '''save content parameter'''

    def letter_header(self):
        return "--- Letter ---"

    def get_letter(self):
        '''implemented in child classes, implementation here should reflect that'''
