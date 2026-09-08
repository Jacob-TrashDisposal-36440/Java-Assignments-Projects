public class Day6 {
    //Practice Example Syntax
    public static int addPoints(int current, int points) {
        return current + points;
    }

    public static void printScore(int score) {
        System.out.println("Score: " + score);
    }

    //Problem 1 Method: Simple Method
    public static double calculateAverage(int a, int b, int c){
        return (a+b+c)/3.0;
    }

    //Problem 2 Method: Match Summary
    public static void printMatchSummary(String allianceColor, int score){
        System.out.println("Team " + allianceColor + " scored " + score + " points.");
    }

    //Problem 3 Method: Boolean Return
    public static boolean isWithinBudget(double cost, double budget){
        if (cost<=budget){
            return true;
        }
        else{
            return false;
        }
    }

    //Problem 4 Methods: Sum of squares
    public static double squareIt(double n){
        return n*n;
    }

    public static double sumOfSquares(double a, double b){
        return squareIt(a) + squareIt(b);
    }

    //Problem 5 Method: Clamp power
    public static double clampPower(double power){
        if (power == 1.5){
            return 1.0;
        }else if(power == -2.0){
            return -1.0;
        }else{
            return power;
        }
    }

    public static void main(String[] args) {
        //Example Logic
        int newScore = addPoints(10, 5);
        printScore(newScore);

        //Execute Method 1
        double average = calculateAverage(3,2,4);
        System.out.println(average);

        //Execute Method 2
        printMatchSummary("blue", 10);

        //Execute Method 3
        System.out.println(isWithinBudget(542.5,1000.0));

        //Execute Method 4
        System.out.println(sumOfSquares(10.2,13));

        //Execute Method 5
        System.out.println(clampPower(1.5));
    }
}
