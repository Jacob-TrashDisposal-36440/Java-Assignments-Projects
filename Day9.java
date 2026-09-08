import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Day9 {

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

    public static void main(String[]args){
        //problem 1
        ArrayList<String> teamRoles = new ArrayList<>(Arrays.asList(
            "Captain","Vice Captain", 
            "Lead Designer", "Designer", 
            "Lead Mechanic", "Mechanic", 
            "Lead Software", "Software", 
            "Lead Outreach", "Outreach"
        ));

        System.out.println(teamRoles.size());
        teamRoles.remove("Designer");
        System.out.println(teamRoles.size());

        //problem 2
        Random randomint = new Random();
        ArrayList<Integer> matchScores = new ArrayList<>();

        for (int i  = 6; i>0;i--) matchScores.add(randomint.nextInt(1,30));

        for (int i = 0; i<matchScores.size(); i++){
            System.out.println("Match"+i+" : "+ matchScores.get(i));
        }

        //problem 3
        ArrayList<Integer>scores = new ArrayList<>();
        for (int i = 5; i>0;i--) scores.add(randomint.nextInt(0,50));

        int greatest = 0;
        for (int num: scores){
            if (num>greatest) greatest = num;
        }
        
        System.out.println(scores);
        System.out.println("Greatest: "+greatest);

        //problem 4
        ArrayList<String> teamMemberRoles = new ArrayList<>(Arrays.asList(
            "Captain","Vice Captain", 
            "Lead Designer", "Designer", 
            "Lead Mechanic", "Mechanic", 
            "Lead Software", "Software", 
            "Lead Outreach", "Outreach",
            "Driver"
        ));
        
        System.out.println("Is Driver a role: "+ teamMemberRoles.contains("Driver"));
        System.out.println("Is Donkey a role: "+ teamMemberRoles.contains("Donkey"));

        //Problem 5
        ArrayList<teamMember> teamMembers = new ArrayList<>();

        teamMembers.add(new teamMember("Jacob","Captain",11));
        teamMembers.add(new teamMember("Marcos","Vice Captain",10));
        teamMembers.add(new teamMember("Kush","Strategist",9));

        for (teamMember member:teamMembers) member.introduce();
    }
}
