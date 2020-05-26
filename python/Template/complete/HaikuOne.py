from Template import Template

class HaikuOne(Template):
    '''
    implements the methods from superclass Template to write a haiku
    Winter seclusion
    Listening, that evening
    To the rain in the mountain
    '''

    def write_first_line(self):
        return "Winter seclusion"

    def write_second_line(self):
        return "Listening, that evening"

    def write_third_line(self):
        return "To the rain in the mountain"
