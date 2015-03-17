//A class of objects inherits all superclasses above it.
        
//Overriding methods - if a method is defined inside a subclass as well
//as the superclass above, the subclass method is used.

//To override a method, it has to be declared the same way. Example:
//Public methods must remain public, the value sent back by the method
//must be the same, and the number and type of arguments must not change.

//A subclass is defined using the extends statement. Example:

class AnimatedLogo extends JApplet {
    //Behavior and atributes go here
}

class Inheritance {
    public static void main(String[] args){
       //"this" is used to refer to the current object. For example,
       //the following code sets the title of this object:
       this.title = "MyObject";
        
       //The "super" keyword refers to the immediate superclass of the object.
       //examples below:
               super("abc",12); //constructor method
               super.hawaii = 50; //variable
               super.surfing(); //method
        
        //See the Point3D class file for more super and this examples.
    }
    
    
    
}