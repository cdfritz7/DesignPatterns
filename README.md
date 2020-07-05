##About
This project serves to explain and give examples for common design
patterns. Each design pattern example is written in both Python and Java.
Additionally, each example has corresponding 'empty' code that is meant to be
filled in and tested. Filling in these 'empty' implementations can serve as an
exercise for anyone wanted to gain a better understanding of design patterns.

The `python` and `java` directories each house sub-directories for the following
design patterns.
- Abstract Factory
- Adapter
- Command
- Facade
- Factory Method
- Observer
- Singleton
- Strategy
- Template

Each design pattern sub-directory has a `complete` directory, an `empty`
directory, a `description.txt` and a UML diagram. The `complete` directory holds
the completed implementation of the design pattern. The `empty` directory holds
an incomplete implementation with comments detailing how to fill it in.
The `description.txt` file gives a description of the design pattern, how/why the design pattern is used, a description of the provided implementation, and instructions
on how to test that implementation.

##Running Code
###Python
All provided python code is written in python3, so a python3 interpreter is
needed to run these examples. Aside from that, there should be not other
dependencies.

To run any of the code in the `python` directory, you can use the following
command inside a `complete` or `empty` directory.
```bash
$python3 main.py
```

Instructions for running code can also be found in the `description.txt` for
each design pattern .

###Java
The provided Java code was compiled and run with Java 11.0.6. However, the code
is not fancy, and should run with any modern java version. The only imports used
in the java code come from the JDK, so no external dependencies are needed if
you already have java on your machine.

To run any of the code in the `java` directory, you can use the following
command inside a `complete` or `empty` directory.
```bash
$javac main.java
$java main
```
This will generated `.class` files, which you may want to remove with
```bash
$rm *.class
```

Instructions for running code can also be found in the `description.txt` for
each design pattern.

##Contributing
Any contributions to the repository would be greatly appreciated. For bugs,
small comments or spelling/grammar/content correction, please open up an issue
describing what you would like to see corrected.

If you'd like to contribute new design patterns, or add design pattern
implementations in another language, please follow the existing layout and
open up a pull request.
