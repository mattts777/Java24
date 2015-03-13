public class GeneralInfo {
    //There are object variables and class variables.
    //Add static to create a class variable:
    static int testCount = 0;
    
    //There are also class methods. Use static in front of the method name to create one:
    static void showTestCoverage(){
        System.out.println("There are " + testCount + " tests");
    }
    
    //Variable scope - variables can only be used inside the brackets.
    //A variable created inside a method cannot be used in other methods.
    //You can only use a variable in more than one method if it was created
    //as an object variable or class variable.
    
    
    public static void main(String[] args){
        //protected variables can be used in the same class, any subclasses,
        //or classes in the same package
        
        //private variables can only be used in the same class
        
        //When no access control is set, the variable is available only to classes
        //in the same package.
        
        //You can still access private variables by using accessor methods in the
        //same class that are public and read the variable and can change it with
        //a new variable. This is called encapsulation and prevents misuse of objects.
        
        //To call the previous class method above, you would use:
        GeneralInfo.showTestCoverage();
        
    }
    
    
    
}