
//The TestLab class is an app that takes 1 argument when you run it from
//the command line: the number of tests to create.
//Reminder to use Run->Set Project Configuration->Customize,
//Type TestLab in the Main Class field, enter the number of tests to create, and click OK
//Then Choose Run->Run Project to run it properly.
public class TestLab {
    //Read the # of tests the user wants to create in as a string to the method
    public static void main(String[] args){
        //Convert the string value to an Integer
        int numTests = Integer.parseInt(args[0]);
        //As long as it's greater than 0, proceed with test creation:
        if (numTests >0){
           
           //Create a new object array called tests of dimensions/size equal
           //to the value entered from the command line, which was then converted
           //to an Integer
           Test123[] tests = new Test123[numTests];
           
           //Loop through each test. For each test, create a new Test123() object.
           for (int i=0; i < numTests; i++){
               tests[i] = new Test123();
           }
          //Display the number of tests created.
          System.out.println("There were " + Test123.getTestCount() + " tests created.");
        }
        
    }
    
    
}