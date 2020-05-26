from HaikuOne import HaikuOne
from HaikuTwo import HaikuTwo

if __name__ == "__main__":

    print("Tests Started")

    haiku_one = HaikuOne()
    haiku_two = HaikuTwo()

    assert(haiku_one.get_haiku() == """Winter seclusion
Listening, that evening
To the rain in the mountain""")

    assert(haiku_two.get_haiku() == """My life,
How much more of it remains
The night is brief""")

    print("Tests passed")
