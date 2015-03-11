class SpaceRemover {
    
    public static void main (String[] args) {
        String mostFamous = "Rudolph the Red-Nosed Reindeer";
        //Store the above text in a character array called mfl. This fills the
        //array with one element for each character in the text. "R" goes into 0,
        //"u' into 1, and so on, until the last "r" in element 29.
        char[] mfl = mostFamous.toCharArray();
        
        //Use a for loop to look at each character in the mfl array. If the
        //character is not a space, it is displayed. If it is a space, a "."
        //character is displayed instead.
        for (int dex = 0; dex < mfl.length; dex++){
            char current = mfl[dex];
            if (current != ' ') {
                System.out.print(current);
        }else {
                System.out.print('.');
                }
            
        }
        System.out.println();
        
        
        
        
    }
    
    
    
    
    
    
}