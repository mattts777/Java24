public class DSLModem extends Modem {
    String method = "DSL phone connection";
    
    public int connect(){
        System.out.println("Connecting to the Internet...");
        System.out.println("Using a " + method);
        
        //This code for JUnit setup testing
        return 777;
    }
    
    
    
}