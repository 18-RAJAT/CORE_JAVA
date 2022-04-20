FAQ's
1. What is meant by String Pool in Java?
   String Pool in Java is a special area in Java Heap memory where string literals are stored.



2. Where is the String Pool stored?
   String Pool is stored in the Heap Memory.



3. Why do we need String Pool in Java?
   It is created to decrease the number of string objects created in the memory. Whenever a new string is created, JVM first checks the string pool. If it encounters the same string, then instead of creating a new string, it returns the same instance of the found string to the variable.



4. Why is String immutable in Java?
   An immutable object is an object whose internal state remains constant after it has been created. Strings are immutable as references can be treated as a normal variable and we can pass them around in the code, between methods without worrying about whether the actual String object to which it is pointing, will change.



5. Does string pool make Java more memory efficient?
   Yes, a string pool helps to save memory by preserving immutable strings in a pool so that the instances can be reused.