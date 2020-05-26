from Template import Template

class HaikuTwo(Template):
    '''
    implements the methods from superclass Template to write a haiku
    My life,
    How much more of it remains
    The night is brief
    '''

    def write_first_line(self):
        return "My life,"

    def write_second_line(self):
        return "How much more of it remains"

    def write_third_line(self):
        return "The night is brief"
