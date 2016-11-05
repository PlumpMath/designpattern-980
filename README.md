# Design Pattern

Implementation with several programming languages

---

- [101 Design Patterns & Tips for Developers](https://sourcemaking.com/design-patterns-and-tips)

  - Createional Patterns
  - Structual Patterns
  - Behavioral Patterns
  - Composing Methods of Refactoring
    - Extract Method
  - Moving Features Between Objects
  - Organizing Data
  - Simplifying Conditional Expressions
  - Making Method Calls Simpler
  - Dealing with Generalization
    - Collapse Hierarchy
      - If a superclass and subclass are not very different, merge them together
    - Extract Interface
      - If several clients use the same subset of a class's interface, or two classes have part of their interfaces in common, extract the subset into an interface 
    - Extract Subclass
      - If a class has features that are used only in some instances, create a subclass for that subset of features 
    - Replace Array with Object
      - If you have an array in which certain elements mean different things, replace the array with an object that has a field for each element 
    - Replace Data Value with Object
      - If you have a data item that needs additional data or behavior, turn the data item into an object 
    - Extract Superclass
      - If you have two classes with similar features, create a superclass and move the common features to the superclass 
    - Form Template Method
      - If you have two methods in subclasses that perform similar steps in the same order, yet the steps are different, get the steps into methods with the same signature, so that the original methods become the same. Then you can pull them up 
    - Pull Up Constructor Body
      - If you have constructors on subclasses with mostly identical bodies, create a superclass constructor; call this from the subclass methods 
    - Pull Up Field
      - If two subclasses have the same field, move the field to the superclass 
    - Pull Up Method
      - If you have methods with identical results on subclasses, move them to the superclass 
    - Push Down Field
      - If a field is used only by some subclasses, move the field to those subclasses 
    - Push Down Method
      - If behavior on a superclass is relevant only for some of its subclasses, move it to those subclasses 
    - Replace Delegation with Inheritance
      - If you're using delegation and are often writing many simple delegations for the entire interface, make the delegating class a subclass of the delegate 
    - Replace Inheritance with Delegation
  - Big Refactorings
    - Convert Procedural Design to Objects
    - Extract Hierarchy
    - Tease Apart Inheritance

---

- [GOF Pattern](http://www.dofactory.com/net/design-patterns)
  
  - Creational Pattern
    - Abstract Factory	(Creates an instance of several families of classes)
    - Builder	(Separates object construction from its representation)
    - Factory Method	(Creates an instance of several derived classes)
    - Prototype	(A fully initialized instance to be copied or cloned)
    - Singleton	(A class of which only a single instance can exist)    

  - Structural Pattern
    - Adapter	(Match interfaces of different classes)
    - Bridge	(Separates an object’s interface from its implementation)
    - Composite	(A tree structure of simple and composite objects)
    - Decorator	(Add responsibilities to objects dynamically)
    - Facade	(A single class that represents an entire subsystem)
    - Flyweight	(A fine-grained instance used for efficient sharing)
    - Proxy	(An object representing another object)
  
  - Behaviorial Pattern
    - Chain of Resp.	(A way of passing a request between a chain of objects)
    - Command	(Encapsulate a command request as an object)
    - Interpreter	(A way to include language elements in a program)
    - Iterator	(Sequentially access the elements of a collection)
    - Mediator	(Defines simplified communication between classes)
    - Memento	(Capture and restore an object's internal state)
    - Observer	(A way of notifying change to a number of classes)
    - State	(Alter an object's behavior when its state changes)
    - Strategy	(Encapsulates an algorithm inside a class)
    - Template (Method	Defer the exact steps of an algorithm to a subclass)
    - Visitor	(Defines a new operation to a class without change)
    
---  

- [Game Programming Pattern](http://gameprogrammingpatterns.com/contents.html)
  - Sequencing Pattern
    - Double Buffer
    - Game Loop
    - Update Method
  - Behavioral Pattern
    - Bytecode
    - Subclass Sandbox
    - Type Object
  - Decoupling Pattern
    - Component
    - Event Queue
    - Service Locator
  - Optimization Pattern
    - Data Locality
    - Dirty Flag
    - Object Pool
    - Spatial Partition
