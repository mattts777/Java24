//Using the Java Util Class to sort arrays

import java.util.Arrays;

class Name {
    public static void main(String[] args){
        String names[] = { "Lauren", "Shawna", "Matthew", "Brian", "Drew", "Mark",
                "Eric", "Dan"};
        System.out.println("The original order:");
        for (int i = 0; i<names.length; i++){
            System.out.print(i + ": " + names[i] + " ");
        }
        Arrays.sort(names);
        System.out.println("\nThe new order:");
        for (int i = 0; i<names.length; i++){
            System.out.print(i + ": " + names[i] + " ");
            
        }
        System.out.println();
        }
        
        
    }
    
    
