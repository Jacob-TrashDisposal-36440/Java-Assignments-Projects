public class Day3 {
    public static void main(String[]args){

        // playing with conditionals
        int a = 5;
        boolean play = true;
        while (play) {
            if (a == 0){
                play = false;
            }
            System.out.println(a);
            a-=1;
        }

        if (a==0 && play){
            System.out.println(play);

        }else if (!play && a!=0) {
            System.out.println(play + " " + a);
        }

        //problem 1
        int distance = 10;

        if (distance<10){
            System.out.println("Stop");
        } else if (distance < 30){
            System.out.println("Slow");
        } else {
            System.out.println("Go");
        }
        
        //Problem 2
        String allianceColor = "blue";

        if (allianceColor.equals("red")) {
            System.out.println("Red Alliance");
        }else if (allianceColor.equals("blue")) {
            System.out.println("Blue Alliance");
        }else{
            System.out.println("Unknown Alliance");
        }

        //Problem 3
        boolean allSystemsGo = false;
        double batteryVoltage = 12;

        if (allSystemsGo && batteryVoltage > 11.5){
            System.out.println("All Systems Go");
        }else{
            System.out.println("Error Check Systems and Battery");
        }

        //Problem 4
        int studentGrade = 11;
        
        if (studentGrade > 6 && studentGrade < 10){
            System.out.println("Junior Division");
        } else if (studentGrade > 9 && studentGrade < 13){
            System.out.println("Senior Division");
        }
        
        //Problem 5
        int secondsRemaining = 9;
        boolean robotHasClimbed = false;

        if (secondsRemaining <= 10 && !robotHasClimbed){
            System.out.println("Attempt Climb Now!");
        } else if (secondsRemaining <= 10) {
            System.out.println("Hold Position");
        }
    }
}
