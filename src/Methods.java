class Methods {

    public static void main(String[] args) {

    //Comparing two strings
    //NOTE: This is case sensitive
    String favorite = "Lotus Esprit";
    String guess = "Corvette Z06";
        
    System.out.println("Is Matt\'s favorite car a " + guess + "?");
    System.out.println("Answer: " + favorite.equals(guess));
    
    //Determining string length
    String charactername = "Talien";
    int charnamelength = charactername.length();
    
    //Changing a string's case
    String charclass = "Human";
    String changecharclass = charclass.toUpperCase();
    guess = guess.toUpperCase();
    
    //Searching for a string inside a string. -1 is returned if not found.
    //NOTE: This is case sensitive
    
    //Search for specific car inside a list of cars
    String carlist = "Dodge Viper;Lotus Esprit;Chevrolet Corvette;Lamborghini Countach";
    int stringposition = carlist.indexOf("Lotus Esprit");
    System.out.println("We found the car at position: " + stringposition);
    
    }
    
    //Example of a simple method that returns a value
     public boolean testResult(String testcase){
        boolean success = false;
        return success;
        
    }
    
    //Methods can have the same name if they have a different number of arguments
    //or the arguments are of different variable types. Example:
    void messageUser(){
        System.out.println("Hello");
    }   
    //The arguments to a method are called the method's signature.
    void messageUser(String message){
        System.out.println(message);
    }
    
    
}
