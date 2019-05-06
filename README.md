# java-novice-to-advance

Guide to Novice to Advance Java

# Generics
- What is Generics? 
- Subtype/SuperType
- Logical Seperation of concern.
- What is generic type?
- How to declear? Method , Class , constractor, member variable of class. 
- what is Wildcat"?" 
- Why/When we use Wildcat or Generics type
- Example : 
       
       public <T extends InterfaceA > List<? extends Comparable<? extends T>> shortThis(List<? extends Comparable<? extends T>> items){
       .... }
- https://shantonusarker.blogspot.com/2016/03/java-generics-simplified.html
- https://github.com/RichardWarburton/generics-examples
# Multi-threading and synchronization

# Logging 

# NIO

# JDBC

# Reflection

# Annotation 
- Custom Annotation
- Pre processor, post processor. 

# Lambda expressions
- Lambda syntax
- Functional interfaces
- Package java.util.function and predefined functional interfaces
- Method references
- Constructor references
- Default methods in interfaces
- Default methods and diamond problem

# Streams
- What is a Stream?
- Ways to create a Stream
- Map/Filter/Reduce approach
- Map/Filter/Aggregate
- Aggregation functions
- Reduce in sequental and parallel processing
- forEach method
- Consumers chaining
- Predicates
- peek method
- map operation
- flatmap operation
- aggregation and reduction
- Optional type
- Collectors
- Using collectors as group by
- IntStream and other special streams
- Random stream
- Parallel streams
 
# Fork/Join framework
- ForkJoinPool
- Classes used for Fork/Join
- Fork/Join example
- Fork/Join and parallel stream processing: benchmarks
 
# Date and Time API
- Problems with Date and Calendar in Java 8
- LocalDate, LocalTime, LocalDateTime
- Instant class
- Clock class
- ZonedDateTime
- DayOfWeek class
- Duration class
- Period class

# Asynchronous programming 
- Problems with multithreading
- Parallel and asynchronous programming
- Benefits of asynchrnous approach
- Java 1 approach to multithreading
- Java 5 approach: Future class
- Java 8 approach: CompletableFuture class
- Data flow as a pipeline
- Starting several pipelines in parallel
- Composing futures
- Combining futures
- Synchronous and asynchronous CompletableFuture methods
- Using anyOf/applyToEither to get the winner result
- Summary of CompletableFuture methods
- Handling exceptions in CompletableFuture
- Using checkpoints in method handling
- Cancellation of CompletableFuture
- Using CompletableFuture in real-life data flow processing
- Asynchronous APIs in Java

# Serialization

# Design Patterns 

# AOP
- Basic : https://www.eclipse.org/aspectj/doc/next/faq.html
- Proxy 
- Dependency Injection 
- IOC
- Performance Impact : https://web.archive.org/web/20150520175004/https://docs.codehaus.org/display/AW/AOP+Benchmark

# JNI
- Native C/C++
- Native C#/Dotnet
- Native python

# JMS

# Socket Programming 

# HTTP Clients

# Listeners

# Event Driven Programming

# Unit Testing : 
- https://github.com/sarkershantonu/Unit-Testing-Examples/tree/master/course

# Manage Object Lifecycle
- NO/Implicit Constructor
- Constructors without Arguments
- Constructors with Arguments
- Initialization Blocks
- Construction guarantee
- Visibility
- Garbage collection
- Finalizers
- Static initialization
- Pattern : Singleton
- Pattern : Utility/Helper Class
- Pattern : Factory
- Pattern : Dependency Injection
- Pattern : Builder

# Manage data/model/entity classes
- hashCode
- equals 
- toString
- clone, deep clone, shallow clone
- equals & == operator
- IDE code generators. 

# Design your Classes & Objects

# Design Enums 

# Method Writing best practices 

# Exceptions efficiently 

# JVM Tuning
- https://github.com/sarkershantonu/jvm-tuning

# Java Agent 
- What is Java Agent 
- Attaching agent with CLI parameter
- Monitoring agent
- Data transfe through agent
- Protocol integration with agents
