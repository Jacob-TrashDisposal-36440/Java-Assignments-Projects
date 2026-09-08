public class Day5 {
    public static void main(String[]args){
        int[] nums ={10,20,30,40,50};
        System.out.println(nums);
        System.out.println(nums[0]);
        System.out.println(nums.length);

        nums[1] = 25;
        System.out.println(nums[1]);

        nums[1]+=5;
        System.out.println(nums[1]);

        String[] a = new String[10];
        System.out.println(a.length);
        
        for (int i = a.length; i>0;i--){
            System.out.println(i);

        }

        //Problem 1
        String[] roles = {"Captain", 
        "Vice Captain", 
        "Design Lead", 
        "Designer", 
        "Software Lead", 
        "Software Engineer", 
        "OutReach Lead", 
        "OutReacher", 
        "Notebook Lead",
        "Mechanical Engineer"};

        for (int i = 0; i<roles.length;i++){
            System.out.println(roles[i]);
        }

        //Problem 2 
        int[] match_Scores = {25,10,0,40,35};
        int highest = 0;

        for (int i = 0; i<match_Scores.length;i++){
            if (match_Scores[i]>highest){
                highest = match_Scores[i];
            }
        }
        System.out.println(highest);

        //Problem 3
        Double[] voltages={1.6,8.55,12.0,3.9,12.75};
        double totalv=0;
        for (int i = 0; i<voltages.length;i++){
            totalv+=voltages[i];
        }
        System.out.println((double)totalv/voltages.length);

        //Problem 4
        int[] array={1,7,3,8,5,9};

        for (int i = array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
        
        //Problem 5
        int[] scores = {30,5,0,65,0};
        int h = 0;
        for (int matchscore:scores){
            if (matchscore>h){
                h=matchscore;
            }
        }
        System.out.println("Highest Score:" + h);
    }
}

