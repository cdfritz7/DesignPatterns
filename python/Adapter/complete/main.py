from Adapter import Adapter

if __name__ == "__main__":
    '''
    for some reason we cannot use the original Adaptee interface, instead, we
    must have getters and setters for each attribute. To solve this, we use the
    Adapter Design Pattern to create a new interface (Adapter) that fulfills our
    requirements
    '''

    print("Starting Testing")

    person1 = Adapter("Rogelio", 25, "blue")
    person2 = Adapter("Adelaide", 43, "green")
    person3 = Adapter("Jonathan", 5, "brown")

    assert(person1.get_name() == "Rogelio")
    assert(person2.get_age() == 43)
    assert(person3.get_eye_color() == "brown")

    assert(person2.adaptee != None)

    print("Changing Attributes")
    
    person1.set_age(26)
    person2.set_name("Andrew")
    person3.set_eye_color("violet")

    assert(person1.get_age() == 26)
    assert(person1.get_eye_color() == "blue")
    assert(person2.get_name() == "Andrew")
    assert(person2.get_eye_color() == "green")
    assert(person3.get_eye_color() == "violet")
    assert(person3.get_age() == 5)

    assert(person1.adaptee != None)
    assert(person2.adaptee != None)
    assert(person3.adaptee != None)

    print("Tests Passed")
