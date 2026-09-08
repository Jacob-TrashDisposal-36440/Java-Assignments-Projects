public class Day1 {
    public static void main(String[]args) {
        String car = "Viper";
        int speed = 100;
        double engine = 2.4;
        boolean souped = true;
        char tires = 'A';

        System.out.println("My favourite car is a red " 
        + car + " "
        + speed + " K/H " 
        + engine + 
        " L, Fully souped up:" + souped + 
        " with grade " + tires + " tires");

        String robotName = "Axel";
        int weightinGrams = 500;
        double batteryVoltage = 5.5;
        boolean isCompetitionReady = false;

        System.out.println(robotName 
            + " weighs " + weightinGrams 
            + " grams, and has a voltage of " + batteryVoltage 
            + " watts. Competition ready: " + isCompetitionReady);

        //int num = 3.5;
        //Java wont compile any code because a decimal value has been given to a integer variable... Type error. 
        //Because of the integer assignment java will drop the decimal and lose the original variable data, 
        //Java refuses to compile because a loss of data cant happen without permission, hence the error.

        int seconds = 125;
        double newseconds = seconds;
        System.out.println(seconds);
        System.out.println(newseconds);
            
        char letter = 'A';
        System.out.println((int) letter);

        //In java the char assignment is actually code for a unassigned integer between 0 and 65 535, 
        //in this case the numerical value given to character "A" is 65. Because of this we can use characters in math operations.

        String name = "Jacob Michelli";
        int age = 16;
        double experience = 4.8;
        boolean captain = true;
        char favCharacter = 'J';

        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I have around " + experience + " years of experience." + 
            " My role as captain = " + captain + " and my favourite character so far is " + favCharacter + " = " + (int) favCharacter
        );
    }
}
