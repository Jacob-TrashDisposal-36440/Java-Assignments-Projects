import java.util.ArrayList;

public class Day10 {

    // Problem 1 MatchSimulator example class.

    public static class MatchSimulator {
        ArrayList<Integer> cycleScores;
        int totalScore;

        public MatchSimulator(){
            this.cycleScores = new ArrayList<>();
            this.totalScore = 0;
        }

        public void logCycle(int points){
            cycleScores.add(points);
            totalScore += points;
        }

        //Problem 2, Method returning the average.
        public double getAverageCycle(){
            double newTotalScore = totalScore;
            double newCycleScores = cycleScores.size();
            return newTotalScore/newCycleScores;
        }

        //Problem 3, Method finding highest cycle.
        public int getBestCycle(){
            int best = 0;
            for (Integer score: cycleScores ){
                if (score>best){
                    best = score;
                }
            }
            return best;
        }
        
        //Problem 4, a method that utilises all other method outputs to print.
        public void printSummary(){
            System.out.println(
            "\n\nFull Match Summary:\n"+
            "\n~Cycle Scores: "+cycleScores+
            "\n~Total Score: "+totalScore+
            "\n~Average Cycle: "+getAverageCycle()+
            "\n~Best Cycle: "+ getBestCycle());
        }
    }

    public static void main(String[]args){

        //Problem 1, creating a object and calling logcycle method 4 times.
        MatchSimulator matchSim = new MatchSimulator();
        matchSim.logCycle(10);
        matchSim.logCycle(20);
        matchSim.logCycle(5);
        matchSim.logCycle(15);

        //Problem 2, testing my average point returnal method.
        System.out.println(matchSim.getAverageCycle());

        //Problem 3, finding highest cycle.
        System.out.println(matchSim.getBestCycle());

        //Problem 4, print summary method.
        matchSim.printSummary();
        
        //Problem 5, match simulation:
        MatchSimulator realMatchSim = new MatchSimulator();
        realMatchSim.logCycle(0);
        realMatchSim.logCycle(10);
        realMatchSim.logCycle(50);
        realMatchSim.logCycle(15);
        realMatchSim.logCycle(5);
        realMatchSim.logCycle(35);

        realMatchSim.printSummary();
    }
}
