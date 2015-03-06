class Conditionals {
    
    public static void main(String[] args) {
        double accountbal = 100;
        String grade = "A";
        String answer = "";
        String rightAnswer = "";
        int studentgrade = 100;
        int score = 100;
        char lettergrade = 'A';
        
        //Less than or equal to
        if (accountbal <= 0){
            System.out.println("You are broke");
        }
        //Equals
        if (answer == rightAnswer) {
            studentgrade = studentgrade + 10;
            
        }
        //Not Equal
        if (answer != rightAnswer) {
            score = score - 5;
        }
        //If-Else
        if (answer == rightAnswer) {
            score += 10;
            
        } else {
            score -= 5;
        }
        
        //Multiple If-Else statements
        if (lettergrade == 'A') {
            score = 100;
        } else if (lettergrade == 'B'){
            score = 90;                  
        } else if (lettergrade == 'C'){
            score = 80;
        } else {
            score = 70;
        }
    }
}