from SingletonEager import SingletonEager
from SingletonLazy import SingletonLazy

#simple class that just prints "A" and logs its activities
class ClassA:

    def __init__(self, log_type="eager"):
        if(log_type == "eager"):
            _ = SingletonEager()
            self.logger = SingletonEager
        elif(log_type == "lazy"):
            self.logger = SingletonLazy
        else:
            raise ValueError("log_type parameter should be 'lazy' or 'eager'")

    def print_a(self):
        print("A")
        self.logger.get_instance().add_to_log("ClassA printed A")

#simple class that just prints "B" and logs its activities
class ClassB:

    def __init__(self, log_type="eager"):
        if(log_type == "eager"):
            _ = SingletonEager()
            self.logger = SingletonEager
        elif(log_type == "lazy"):
            self.logger = SingletonLazy
        else:
            raise ValueError("log_type parameter should be 'lazy' or 'eager'")

    def print_b(self):
        print("B")
        self.logger.get_instance().add_to_log("ClassB printed B")

'''
tests lazy and eager singleton implementations by instantiating ClassA and
ClassB, calling their methods, and then checking the logging done by
the singleton class used in ClassA in ClassB
'''
if __name__ == "__main__":

    assertion_string = """ClassA printed A
ClassA printed A
ClassB printed B
ClassB printed B
ClassA printed A"""

    #lazy instantiation
    print("Lazy Instantiation Test")

    lazy_a = ClassA("lazy")
    lazy_b = ClassB("lazy")

    #test that the singleton object is not instantiated
    assert(lazy_a.logger.obj == None and lazy_b.logger.obj == None)

    lazy_logger = SingletonLazy.get_instance()

    lazy_a.print_a()
    lazy_a.print_a()
    lazy_b.print_b()
    lazy_b.print_b()
    lazy_a.print_a()

    assert(assertion_string == lazy_logger.get_log())
    print("passed")

    #eager instantiation
    print("\nEager Instantiation Test")

    eager_a = ClassA("eager")
    eager_b = ClassB("eager")

    #check that the singleton object is instantiated
    assert(eager_a.logger.obj != None and eager_b.logger.obj != None)

    eager_logger = SingletonEager.get_instance()

    eager_a.print_a()
    eager_a.print_a()
    eager_b.print_b()
    eager_b.print_b()
    eager_a.print_a()

    assert(assertion_string == lazy_logger.get_log())
    print("passed")
