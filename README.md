# Programming Design Pattern

Implementation with several programming languages

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

---

- [Refactoring](https://sourcemaking.com/refactoring)

  - Composing Methods of Refactoring


    - **Extract Method** (If you have a code fragment that can be grouped together, turn the fragment into a method whose name explains the purpose of the method) 
    - **Inline Method** (If a method's body is just as clear as its name, put the method's body into the body of its callers and remove the method)
    - **Inline Temp** (If you have a temp that is assigned to once with a simple expression, and the temp is getting in the way of other refactorings, replace all references to that temp with the expression)
    - **Introduce Explaining Variable** (If you have a complicated expression, put the result of the expression, or parts of the expression, in a temporary variable with a name that explains the purpose)
    - **Remove Assignments to Parameters** (If the code assigns to a parameter, use a temporary variable instead)
    - **Replace Method with Method Object** (If uou have a long method that uses local variables in such a way that you cannot apply Extract Method, turn the method into its own object so that all the local variables become fields on that object)
    - **Replace Temp with Query** (If you are using a temporary variable to hold the result of an expression, extract the expression into a method. Replace all references to the temp with the expression. The new method can then be used in other methods)
    - **Split Temporary Variable** (If you have a temporary variable assigned to more than once, but is not a loop variable nor a collecting temporary variable, make a separate temporary variable for each assignment)
    - **Substitute Algorithm** (If you want to replace an algorithm with one that is clearer, replace the body of the method with the new algorithm)

  - Moving Features Between Objects
    - **Extract Class** (If you have one class doing work that should be done by two, create a new class and move the relevant fields and methods from the old class into the new class) 
    - **Hide Delegate** (If a client is calling a delegate class of an object, create methods on the server to hide the delegate)
    - **Inline Class** (If a class isn't doing very much, move all its features into another class and delete it)
    - **Introduce Foreign Method** (If a server class you are using needs an additional method, but you can't modify the class, create a method in the client class with an instance of the server class as its first argument)
    - **Introduce Local Extension** (If a server class you are using needs several additional methods, but you can't modify the class, create a new class that contains these extra methods. Make this extension class a subclass or a wrapper of the original) 
    - **Move Field** (If a field is, or will be, used by another class more than the class on which it is defined, create a new field in the target class, and change all its users) 
    - **Move Method** (If a method is, or will be, using or used by more features of another class than the class on which it is defined, create a new method with a similar body in the class it uses most. Either turn the old method into a simple delegation, or remove it altogether) 
    - **Remove Middle Man** (If a class is doing too much simple delegation, get the client to call the delegate directly)

  - Organizing Data

    - **Change Bidirectional Association to Unidirectional** (If you have a two-way association but one class no longer needs features from the other, drop the unneeded end of the association)
    - **Change Reference to Value** (If you have a reference object that is small, immutable, and awkward to manage, turn it into a value object)
    - **Change Unidirectional Association to Bidirectional** (If you have two classes that need to use each other's features, but there is only a one-way link, add back pointers, and change modifiers to update both sets)
    - **Change Value to Reference** (If you have a class with many equal instances that you want to replace with a single object, turn the object into a reference object)
    - **Duplicate Observed Data** (If you have domain data available only in a GUI control, and domain methods need access, copy the data to a domain object. Set up an observer to synchronize the two pieces of data) 
    - **Encapsulate Collection** (If a method returns a collection, make it return a read-only view and provide add/remove methods) 
    - **Encapsulate Field** (If there is a public field, make it private and provide accessors) 
    - **Replace Array with Object** (If you have an array in which certain elements mean different things, replace the array with an object that has a field for each element)
    - **Replace Data Value with Object** (If you have a data item that needs additional data or behavior, turn the data item into an object)
    - **Replace Magic Number with Symbolic Constant** (If you have a literal number with a particular meaning, create a constant, name it after the meaning, and replace the number with it)
    - **Replace Record with Data Class** (If you need to interface with a record structure in a traditional programming environment, make a dumb data object for the record) 
    - **Replace Subclass with Fields** (If you have subclasses that vary only in methods that return constant data, change the methods to superclass fields and eliminate the subclasses)
    - **Replace Type Code with Class** (If a class has a numeric type code that does not affect its behavior, replace the number with a new class) 
    - **Replace Type Code with State/Strategy** (If you have a type code that affects the behavior of a class, but you cannot use subclassing, replace the type code with a state object) 
    - **Replace Type Code with Subclasses** (If you have an immutable type code that affects the behavior of a class, replace the type code with subclasses) 
    - **Introduce Explaining Variable** (If you have a complicated expression, put the result of the expression, or parts of the expression, in a temporary variable with a name that explains the purpose) 
    - **Remove Assignments to Parameters** (If the code assigns to a parameter, use a temporary variable instead)
    - **Self Encapsulate Field** (If you are accessing a field directly, but the coupling to the field is becoming awkward, create getting and setting methods for the field and use only those to access the field)

  - Simplifying Conditional Expressions

    - **Consolidate Conditional Expression** (If you have a sequence of conditional tests with the same result, combine them into a single conditional expression and extract it) 
    - **Consolidate Duplicate Conditional Fragments** (If the same fragment of code is in all branches of a conditional expression, move it outside of the expression) 
    - **Decompose Conditional** (If you have a complicated conditional (if-then-else) statement, extract methods from the condition, then part, and else parts)
    - **Introduce Assertion** (If a section of code assumes something about the state of the program, make the assumption explicit with an assertion) 
    - **Introduce Null Object** (If you have repeated checks for a null value, replace the null value with a null object) 
    - **Remove Control Flag** (If you have a variable that is acting as a control flag for a series of boolean expressions, use a break or return instead) 
    - **Replace Conditional with Polymorphism** (If you have a conditional that chooses different behavior depending on the type of an object, move each leg of the conditional to an overriding method in a subclass. Make the original method abstract)
    - **Replace Nested Conditional with Guard Clauses** (If a method has conditional behavior that does not make clear the normal path of execution, use guard clauses for all the special cases)

  - Making Method Calls Simpler

    - **Add Parameter**             (If a method needs more information from its caller, add a parameter for an object that can pass on this information)
    - **Encapsulate Downcast**      (If a method returns an object that needs to be downcasted by its callers, move the downcast to within the method)
    - **Hide Method** (If a method is not used by any other class, make the method private)
    - **Introduce Parameter Object** (If you have a group of parameters that naturally go together, replace them with an object)
    - **Hide Delegate** (If a client is calling a delegate class of an object, create methods on the server to hide the delegate) 
    - **Parameterize Method** (If several methods do similar things but with different values contained in the method body, create one method that uses a parameter for the different values)
    - **Preserve Whole Object** (If you are getting several values from an object and passing these values as parameters in a method call, send the whole object instead)
    - **Remove Parameter** (If a parameter is no longer used by the method body, remove it)
    - **Remove Setting Method** (A field should be set at creation time and never altered. Remove any setting method for that field) 
    - **Rename Method** (If the name of a method does not reveal its purpose, change the name of the method) 
    - **Replace Constructor with Factory Method** (If you want to do more than simple construction when you create an object, replace the constructor with a factory method)
    - **Replace Error Code with Exception** (If a method returns a special code to indicate an error, throw an exception instead) 
    - **Replace Exception with Test** (If you are throwing a checked exception on a condition the caller could have checked first, change the caller to make the test first)
    - **Replace Parameter with Explicit Methods** (If you have a method that runs different code depending on the values of an enumerated parameter, create a separate method for each value of the parameter)
    - **Replace Parameter with Method** (If an object invokes a method, then passes the result as a parameter for a method. The receiver can also invoke this method, remove the parameter and let the receiver invoke the method)
    - **Separate Query from Modifier** (If you have a method that returns a value but also changes the state of an object, create two methods, one for the query and one for the modification) 

  - Dealing with Generalization
    - **Collapse Hierarchy**        (If a superclass and subclass are not very different, merge them together)
    - **Extract Interface**         (If several clients use the same subset of a class's interface, or two classes have part of their interfaces in common, extract the subset into an interface)
    - **Extract Subclass**          (If a class has features that are used only in some instances, create a subclass for that subset of features)
    - **Replace Array with Object** (If you have an array in which certain elements mean different things, replace the array with an object that has a field for each element)
    - **Replace Data Value with Object** (If you have a data item that needs additional data or behavior, turn the data item into an object)
    - **Extract Superclass**        (If you have two classes with similar features, create a superclass and move the common features to the superclass) 
    - **Form Template Method**      (If you have two methods in subclasses that perform similar steps in the same order, yet the steps are different, get the steps into methods with the same signature, so that the original methods become the same. Then you can pull them up)
    - **Pull Up Constructor Body**  (If you have constructors on subclasses with mostly identical bodies, create a superclass constructor; call this from the subclass methods)
    - **Pull Up Field**             (If two subclasses have the same field, move the field to the superclass)
    - **Pull Up Method**            (If you have methods with identical results on subclasses, move them to the superclass)
    - **Push Down Field**           (If a field is used only by some subclasses, move the field to those subclasses)
    - **Push Down Method**          (If behavior on a superclass is relevant only for some of its subclasses, move it to those subclasses)
    - **Replace Delegation with Inheritance** (If you're using delegation and are often writing many simple delegations for the entire interface, make the delegating class a subclass of the delegate)
    - **Replace Inheritance with Delegation** (If a subclass uses only part of a superclasses interface or does not want to inherit data, create a field for the superclass, adjust methods to delegate to the superclass, and remove the subclassing)

# Cloud Design Pattern

- [aws cloud design pattern](http://en.clouddesignpattern.org/index.php/Main_Page)

  - Basic Patterns

    - Snapshot Pattern (Data Backups)
    - Stamp Pattern (Server Replication)
    - Scale Up Pattern (Dynamic Server Spec Up/Down)
    - Scale Out Pattern (Dynamically Increasing the Number of Servers)
    - On-demand Disk Pattern (Dynamically Increasing/Decreasing Disk Capacity)



# Reference

## Video

- [UML 2.0 Tutorial](https://www.youtube.com/watch?v=3cmzqZzwNDM&list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc&index=3)
- [Design Patterns Video Tutorial](https://www.youtube.com/playlist?list=PLF206E906175C7E07)

## Book

- Design Patterns: Elements of Reusable Object-Oriente?d Software
- Head First Design Patterns

## Web

- [.net design patterns](http://dofactory.com/net/design-patterns)
- [101 Design Patterns & Tips for Developers](https://sourcemaking.com/design-patterns-and-tips)
- [aws cloud design pattern](http://en.clouddesignpattern.org/index.php/Main_Page)
- [azure cloud design patterns](https://msdn.microsoft.com/en-us/library/dn568099.aspx)
- [Tutorials, architecture guides and additional resources to help you build on Cloud Platform](https://cloud.google.com/solutions/)