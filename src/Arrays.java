class Arrays {
    
    public static void main (String[] args) {
        //Boolean array elements have a default value of false.
        
        //Keep in mind large arrays take up a lot of memory. Just
        //using a 50 by 50 ([50][50] array is the equivalent of storing
        //2500 individual variables (50 times 50).
        
        //Once specified this way, more elements cannot be added:
        String[] reindeerNames = { "Dasher", "Dancer", "Prancer", "Vixen",
            "Comet", "Cupid", "Donder", "Blitzen", "Rudolph"};
        
        System.out.println("There are " + reindeerNames.length + " reindeer.");
        
        //Must specify the number of elements when using 'new'
        //Reminder that values start at 0, so the following would
        //create a String array of 0-9:
        String[] topGifts = new String[10];
        
        //Multidimensional arrays
        //To create an array that has 2 dimensions, such as X,Y coordinates,
        //add an additional set of brackets:
        boolean[][] selectedPoint = new boolean[100][100];
        selectedPoint[4][15] = true;
        selectedPoint[25][75] = true;
        selectedPoint[77][42] = true;
        
        
        
    }
    
}