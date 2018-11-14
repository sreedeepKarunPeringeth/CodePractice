This file is created directly from the browser.


Interface:

3 types of methods: 
	1. abstract method ( public ): have to give body in the implementation class. 
	2. default method  (public ): by default available in impl classes.
	3. static method   (public ): not available in impl classes ( not inherited). can access directly using interface class name.
	
	
members:

	1. public final static by default. 
			can access using object and directly. its final so constant.	

New features added in java 8 wrt to interface:

1. can add default methods with implementation 
		This is bz if we want to add new functionality for the interface, we can't add new methods 
		bz already many classes would have implemented that interface. Hence define new default methods to add this functinoaliy for the interface. 

2. can add static methods with implementation. 
		This is not inherited but can be called directly using the Interface class name ( no need of objects).
		
		
		
		
		
