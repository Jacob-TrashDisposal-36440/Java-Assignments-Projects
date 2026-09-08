public class Day8 {
    //Problem 1 Example Class
    public static class Counter{
        int count;

        public Counter(int count){
            this.count = 0;
        }
        public void increment() {
            this.count = this.count + 1;
        }
 
        public int getCount() {
            return this.count;
        }

    }
    //Problem 2: class bank account class.
    public static class classBankAccount{
        double balance;

        public classBankAccount(){
            this.balance = 1000;
        }

        public void withdrawel(double amount){
            this.balance-=amount;
        }

        public void deposit(double amount){
            this.balance+=amount;
        }

        public double getBalance(){
            return this.balance;
        }
    }
    //Problem 3, robot state
    public static class robotState{
        String currentState;

        public robotState(){
            this.currentState = "Idle";
        }
        public String setState(String newState){
            return currentState = newState;
        }
    }

    //Problem 4
    public static class matchClock{
        int secondsElapsed;

        public matchClock(){
            this.secondsElapsed = 0;
        }
        public int tick(){
            return secondsElapsed +=1;
        }
        public int getTimeRemaining(){
            return 150 - secondsElapsed;
        }
    }

    //Problem 5 score tracker object blueprint class
    public static class scoreTracker{
        int totalScore;

        public scoreTracker(){
            this.totalScore = 0;
        }

        public void addPoints(int points){
            this.totalScore+=points;
        }

        public void printTotal(){
            System.out.println("Current Score: "+this.totalScore);
        }

        public void resetScore(){
            this.totalScore = 0;
        }

        public int addPenalty(int points){
            this.totalScore -= points;
            if (this.totalScore < 0) {
                this.totalScore = 0;
            }
            return this.totalScore;
        }

    }
    
    public static void main(String[]args){
        //Problem 1 Object creation + incrementation method.
        Counter points = new Counter(0);
        points.increment();
        System.out.println(points.getCount());

        //Problem 2, bank account object:
        classBankAccount account = new classBankAccount();
        System.out.println(account.getBalance());

        account.deposit(1000.0);
        System.out.println(account.getBalance());

        account.withdrawel(1325.82);
        System.out.println(account.getBalance());

        //Problem 3, Changing robot states...
        robotState state = new robotState();
        System.out.println(state.currentState);
        state.setState("Active");
        System.out.println(state.currentState);
        state.setState("Autonomous");
        System.out.println(state.currentState);

        //Problem 4 object ticks.
        matchClock matchTime = new matchClock();

        for (int i = 20; i>0;i--){
            matchTime.tick();
        }
        System.out.println("Remaining Match Time: " + matchTime.getTimeRemaining());

        //Problem 5 using and adding methods to the score tracker object BP.
        scoreTracker score = new scoreTracker();
        score.addPoints(10);
        score.addPoints(15);
        score.printTotal();
        score.addPenalty(20);
        score.printTotal();
        score.resetScore();
        score.printTotal();
    }   

}
