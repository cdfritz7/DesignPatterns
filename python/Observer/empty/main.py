from Observable import Observable
from Observer import Observer

'''
here, the Observable represents a parent process that notifies it's children
about it's current state
'''
if __name__ == "__main__":

    print("Running Tests")

    parent = Observable()

    child_1 = Observer()
    child_2 = Observer()
    child_3 = Observer()

    assert(parent.state == "ready")

    parent.add_observer(child_1)
    parent.add_observer(child_2)
    parent.add_observer(child_3)

    parent.notify_observers()

    assert(parent.state == "ready")
    assert(child_1.parent_state == "ready")
    assert(child_2.parent_state == "ready")
    assert(child_3.parent_state == "ready")

    parent.remove_observer(child_2)

    #change the state, this should automatically notify observers
    parent.set_state("running")

    assert(parent.state == "running")
    assert(child_1.parent_state == "running")
    assert(child_2.parent_state == "ready")
    assert(child_3.parent_state == "running")

    print("Tests Passed")
