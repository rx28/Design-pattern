Template Method is a behavioral design pattern that defines
the skeleton of an algorithm in the superclass but lets
subclasses override specific steps of the algorithm without
changing its structure.

---------------------------------------------------------------------------------
Example:
The Abstract Class declares methods that act as steps of an
algorithm, as well as the actual template method which calls
these methods in a specific order. The steps may either be
declared abstract or have some default implementation.

Concrete Classes can override all of the steps, but not the template method
itself.