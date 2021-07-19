//super class
abstract class Shape
{
     String name ;
     double area;
     // abstract method or function
     abstract void display();
}

/*Abstract class is the one that simply represents
 a concept and whose objects cannot be created.
 and it is created through a keyword abstract
 
 
 Abstract method/function are those with no statement inside 
  the body of the function.
  
  In an abstracct method a semicoln is used at the end of the 
  function
 
  for example :  abstract void display();
 
  The abstract methods of a superclass would require overriding
 in each subclass , i.e we should srite their definiation
  in the subclass*/
     
