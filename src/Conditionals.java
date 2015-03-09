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
        
        //switch statement
        switch (grade) {
            case "A":
                System.out.println("You got an A.");
                break;
            case "B":
                System.out.println("You got a B.");
                break;
            case "C":
                System.out.println("You got a C.");
                break;
            case "D":
                System.out.println("You got a D.");
                break;
            case "F":
                System.out.println("You failed.");
                break;
            default:
                System.out.println("No score. Please contact admin.");
        }
        
        //Ternary operator
        
        //If the skill level is greater than 5, the number of enemies is 10.
        //Otherwise, it's 5:
        int skillLevel = 5;
        int numberOfEnemies = (skillLevel > 5) ? 10:5;
        
        //If the gender is male, display Mr. If female, display Ms.:
        String gender = "female";
        System.out.print( (gender.equals("male")) ? "Mr." : "Ms.");
        
        
        
    }
}
