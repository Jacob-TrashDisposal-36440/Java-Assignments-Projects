public class Day7 {
    //Create a new class
    public static class Motor{
        //Class fields that will be used in every instance.
        String name;
        double maxPower;

        //Constructor Method, used to create a object with the class.
        public Motor(String name, double maxPower){
            this.name = name;
            this.maxPower = maxPower;
        }

        //New method for every object: Describe.
        public void describe(){
            System.out.println(name + " (" + maxPower + ")");
        }
    }

    public static class Robot{
        String teamName;
        int teamNumber;
        double weightKg;

        public Robot(String teamName,int teamNumber, double weightKg){
            this.teamName = teamName;
            this.teamNumber = teamNumber;
            this.weightKg = weightKg;
        }

        public boolean isUnderWeightLimit(){
            return weightKg <= 18.0;
        }
    }

    public static class teamMember{
        String name;
        String role;
        int grade;

        public teamMember(String name, String role, int grade){
            this.name = name;
            this.role = role;
            this.grade = grade;
        }

        public void introduce(){
            System.out.println("Team member: "+ name + " is " + role + " (Grade: " + grade + " )");
        }
    }

    public static class Battery{
        String name;
        double voltage;

        public Battery(String name, double voltage){
            this.name = name;
            this.voltage = voltage;
        }

        public boolean needsCharging(){
            return voltage<11.0;
        }
    }
    public static void main(String[]args){
        //Problem 1, Creating 2 objects.
        Motor topRight = new Motor("Top Right", 12.0);
        Motor topLeft = new Motor("Top Left", 12.0);

        System.out.println(topRight.name + " (" + topRight.maxPower + ")");
        System.out.println(topLeft.name + " (" + topLeft.maxPower + ")");

        //Problem 2, Calling the describe method on both objects
        System.out.println();
        topRight.describe();
        topLeft.describe();

        //Problem 3, New class.
        Robot starterRobot = new Robot("Starter Robot", 12345, 14.5);
        System.out.println("isUnderWeightLimit = "+starterRobot.isUnderWeightLimit());

        //Problem 4, creating 3 team members
        teamMember jacob = new teamMember("Jacob", "Captain", 11);
        teamMember marcos = new teamMember("Marcos", "Vice Captain", 11);
        teamMember aarav = new teamMember("Aarav","Engineering Lead", 10);

        teamMember [] teamMembers = {jacob, marcos, aarav};
        
        System.out.println();
        for (teamMember member : teamMembers) {
            member.introduce();
        }

        //Problem 5, 3 batterys for charging?

        Battery a = new Battery("A",12.0);
        Battery b = new Battery("B",3.0);
        Battery c = new Battery ("C",5.0);

        Battery [] batteries = {
            a,
            b,
            c
        };

        System.out.println();
        for (Battery object : batteries){
            if (object.needsCharging()){
                System.out.println(object.name + " needs charging.");
            }
        }
    }

}
