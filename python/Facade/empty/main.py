from Facade import Facade
from datetime import datetime

if __name__ == "__main__":
    print("running tests")

    cur_time = Facade().get_time()
    print(f"The Current Time is : {cur_time}")

    assert(cur_time == str(datetime.now().time())[:8])

    print("finished tests")
