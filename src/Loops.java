class Loops {
    public static void main(String[] args) {
        //for loop
        for (int dex = 1; dex <=200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");            
            
        }
        
        //while loop
        int gameLives = 5;
        while (gameLives > 0) {
            System.out.println("You have " + gameLives + " lives left.");
            gameLives--;
        }
        
        //do-while loop
        //This is different than a while loop because the conditional test is conducted
        //after the statements inside the loop, instead of before.
        gameLives = 5;
        do {
            System.out.println("You have gained " + gameLives + " lives.");
            gameLives++;
        } while (gameLives < 5);
        
        //Adding code to exit a loop immediately if needed with the break command
        int index = 0;
        while (index <=1000) {
            System.out.print("Index = " + index + "\t");
            index = index + 5;
            if (index == 400){
                break;
            }
        }
        
        //Using continue to immediately start over. In this example, the text
        //"car = 40" is never displayed as a result
        int car = 0;
        while (car <= 100) {
            car = car + 5;
            if (car == 40){
                continue;
            }
            System.out.print("car = " + car + "\t");
            
        }
        
        //Using named loops to break out of a specific loop, use a colon
        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) {
            for (int i = 0; i<target; i++) {
                if (points > 50){
                    break targetLoop;
                }
                System.out.print("points = " + points + "\t");
                points = points + i;
            }
        }
        
        //Complex for loops - You can use more than variable in initialization,
        //conditional, and change sections of the loop. Use commas to separate:
        int i,j;
        for (i=0, j=0;i*j<1000;i++, j+=2){
            System.out.println(i + " * " + j + " = " + (i*j));
        }
        
        double displayCount = 10;
        double endValue = 14;
        
        //Sections of a for loop can also be empty, for example when a counter variable
        //has already been defined elsewhere in the program:
        for (; displayCount < endValue; displayCount++){
            System.out.println(displayCount);
        }
        
    }
    
    
    
    
}