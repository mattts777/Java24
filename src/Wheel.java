//Count the number of letters use in each phrase
class Wheel {
    public static void main(String[] args){
        String[] phrase = {
            "A Stitch in time saves nine",
            "Don't eat yellow snow",
            "Just do it",
            "I want my MTV",
            "Play it again, Sam",
            "Life is good",
            "God is good"
            
        };
        int[] letterCount = new int[26];
        for (int count = 0; count < phrase.length; count++){
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++){
                char lett = letters[count2];
                if ((lett>='A') & (lett <='Z')){
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'Z'; count++){
            System.out.print(count + ": " + letterCount[count - 'A'] + " ");
        }
        System.out.println();
    }
}