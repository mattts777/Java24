class Casting {
    
    public static void main(String[] args){
        //Casting = converting information into another form
        float source = 7.06F;
        System.out.println(source);
        int destination = (int) source;
        System.out.println(destination);
        
        //This casts a Graphics object called comp into a Graphics2D object.
        //You don't lose any information in the cast, but you gain all the
        //methods and variabls the subclass defines.
        
        //Commented out to avoid errors
        //Graphics comp = new Graphics();
        //Graphics2D comp2D = (Graphics2D) comp;
     
        //This creates an Integer object with a value of 5309:
        Integer suffix = new Integer(5309);
        
        //This statement causes the newSuffix variable to have an int value of 5309:
        int newSuffix = suffix.intValue();
        
        //This converts a string to an integer with a value of 25
        String count = "25";
        int myCount = Integer.parseInt(count);
        
    }

class Graphics {
    
}
class Graphics2D {
    
}
}