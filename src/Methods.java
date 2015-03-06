class Methods {

    public static void main(String[] args) {

    //Comparing two strings
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
    
    }
}