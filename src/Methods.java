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
    
    //Searching for a string inside a string. -1 is returned if not found.
    //NOTE: This is case sensitive
    
    //Search for specific car inside a list of cars
    String carlist = "Dodge Viper;Lotus Esprit;Chevrolet Corvette;Lamborghini Countach";
    int stringposition = carlist.indexOf("Lotus Esprit");
    System.out.println("We found the car at position: " + stringposition);
    
    
    
    
    
    
    
    
    
    
    
    }
}