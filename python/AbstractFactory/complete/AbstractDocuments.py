class Resume(object):
    def __init__(self, content):
        ''' save content parameter '''
        self.content = content

    def resume_header(self):
        return "--- Resume ---"

    def ger_resume(self):
        '''implemented in child classes, implementation here should reflect that'''
        raise NotImplementedError("__str__ abstract in Resume class")

class Letter(object):
    def __init__(self, content):
        '''save content parameter'''
        self.content = content

    def letter_header(self):
        return "--- Letter ---"

    def get_letter(self):
        '''implemented in child classes, implementation here should reflect that'''
        raise NotImplementedError("__str__ abstract in Letter class")
