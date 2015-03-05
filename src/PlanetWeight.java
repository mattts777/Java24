class PlanetWeight {
    public static void main(String[] args) {
        System.out.print("Your weight on Earth is ");
        double weight = 160;
        System.out.println(weight);
        
        System.out.print("Your weight on Mercury is ");
        double mercuryweight = weight * .378;
        System.out.println(mercuryweight);
        
        System.out.print("Your weight on the Moon is ");
        double moonweight = weight * .166;
        System.out.println(moonweight);
      
        System.out.print("Your weight on Jupiter is ");
        double jupiterweight = weight * 2.364;
        System.out.println(jupiterweight);
    }
}