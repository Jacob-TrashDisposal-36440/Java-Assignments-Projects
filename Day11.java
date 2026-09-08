public class Day11 {
    //Problem 1, basic inheritance:
    public static class Robot{
        String name = "Enzo";

        public void announce(){
            System.out.println("\nName: "+name);
        }
    }

    public static class CompetitionRobot extends Robot{

        //Problem 2 adding compete method
        public void compete(){
            System.out.println("\nCompeting now!");
        }

        //Problem 3 overiding inheritance method.
        @Override 
        public void announce(){
            System.out.println("\nTime to Compete!!!");
        }
    }

    //Problem 4, two level hierarchy.
    public static class Motor{
        Character motor = 'A';

        public void callMotor(){
            System.out.println("\nMotor: "+motor);
        }
    }

    public static class DriveMotor extends Motor{
        int motorPower;

        public void fD(int power){
            int motorPowerMax = power;
            motorPower = power;
            for (int i = 0; i<motorPowerMax;i++){
                System.out.println("Motor Power ~ "+motorPower);
                motorPower-=1;
            }
        }
    }

    public static class MecanumMotor extends DriveMotor{
        String direction = "Forward";
        public void getDirection(){
            System.out.println("Travelling: "+direction);
        }
    }

    //Problem 5, getting to my own OP mode.
    public static class MyOpMode{
        public void init(){
            System.out.println("\nInitializing...");
        }
    }

    public static class AutonomousMode extends MyOpMode{
        public void run(){
            init();
            MecanumMotor autoRoutine = new MecanumMotor();
            autoRoutine.fD(8);
            autoRoutine.callMotor();
        }
    }

    public static void main(String[]args){
        //Problem 1 basic inheritance of announce method.
        CompetitionRobot enzo = new CompetitionRobot();
        enzo.announce();

        //Problem 2 calling compete method from object + announce method from objects extension.
        enzo.announce();
        enzo.compete();

        //Problem 4, 2 level inheritance\
        MecanumMotor motor = new MecanumMotor();
        motor.callMotor();
        motor.getDirection();
        motor.fD(10);

        //Problem 5, getting to my own OpMode
        AutonomousMode auto = new AutonomousMode();
        auto.run();
    }
}
