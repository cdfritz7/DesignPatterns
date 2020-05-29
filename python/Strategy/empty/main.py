from Context import Context
from AddStrategy import AddStrategy
from SubtractStrategy import SubtractStrategy

if __name__ == "__main__":

    #read in and format file
    print("Reading in in.txt")

    lines = []
    with open("in.txt") as myfile:
        lines = myfile.readlines()

    lines = [line.strip().split(' ') for line in lines]

    #create context object that will hold strategy
    print("Tests Started")

    my_context = Context()

    #change strategy based on lines and test
    expected = [6, -13, -91, -44, 1, 0, 8]

    for i in range(len(lines)):
        type = lines[i][0]
        num1 = int(lines[i][1])
        num2 = int(lines[i][2])

        if(type == "add"):
            my_context.change_strategy(AddStrategy())
        elif(type == "subtract"):
            my_context.change_strategy(SubtractStrategy())
        else:
            raise ValueError('Invalid type in in.txt')

        assert(my_context.execute_strategy(num1, num2) == expected[i])

    print("Tests Passed")
