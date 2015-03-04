class Variable {
    public static void main(String[] args) {
        //Variable Types
        int tops;
        float GradePointAverage; //holds decimal numbers up to 38 places.
        double mydouble; //holds decimal numbers up to 300 places.
        char key = 'C';
        String productName = "Larvets";
        byte escapeKey = 27; //-128 to 127.
        short roomNumber = 777;//-32768 to 32767
        long USNationalDebt;//-9.22 quintillion to 9.22 quintillion
        boolean gameOver = false;//True or False
        
        //Constants
        final int TOUCHDOWN = 6;//capitalize constants
        final int FIELDGOAL = 3;
        final int PAT = 1;
        final int TWOPTCONV = 2;
        
        //Operators
        double weight = 205;
        weight = weight + 10; //Addition
        
        weight = weight - 15; //Subtraction
        
        weight = weight / 3; //Division
        
        //This statement finds the remainder of 245 divided by 3:
        int remainder = 245 % 3;
        
        int score = 10;
        int total = 500 + (score * 12); //Multiplication and addition
        
        //Incrementing and Decrementing
        int x = 3;
        int answer = x++ * 10; //x++ = postfixing incrementing by 1
        int y = 3;
        int result = ++y * 10; //++y = prefixing incrementing by 1
        
        System.out.println("answer = " + answer);
        System.out.println("result = " + result);
        
    }
}