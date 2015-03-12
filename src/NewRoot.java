//Before running this program, you need to configure NetBeans to run it
//with a command-line argument (Run-Set Project Configuration-Customize).
//Type NewRoot as the main class and 777 in the Arguments field and click OK.

//Be sure and use Run-Run Project instead of Run File.

class NewRoot {
    public static void main(String[] args){
        // This takes any command-line arguments and converts the string
        //to an integer for use in finding the square root of the input
        int number = 100;
        if (args.length>0){
            //args[0] holds the 1st command-line argument submitted when
            //the application was run
            number = Integer.parseInt(args[0]);
        }
        System.out.println("The square root of "
                + number
                + " is "
                + Math.sqrt(number) );
        
    }
    
    
    
}