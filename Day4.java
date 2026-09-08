import java.util.Scanner;

public class Day4 {
    public static void main(String[]args){

        //Problem 1
        for (int var = 10; var >= 1; var--) {

            System.out.println(var);

            if (var == 1){
                System.out.println("Match Start!");
            }
        }

        //Problem 2
        double total = 0;
        
        for (double var = 1; var <=10; var++){
            total+= Math.pow(var,2);
        }

        System.out.println(total);

        //Problem 3
        int timer = 30;

        while (timer >=0) {
            System.out.println(timer + " Seconds Left!");
            timer-=1;
        }

        //Problem 4
        Scanner scan = new Scanner(System.in);
        total = 0;

        for (int var = 1; var<7;var++){
            System.out.println("Enter score for round " + var + " (5/10)");
            int input = scan.nextInt();
            scan.nextLine();

            total+=input;
        }

        System.out.println("Final Total: " + (int)total);
        scan.close();

        //Problem 5
        for (int i = 0;i < 4;i++){

            for (int a = 0;a < 4;a++){

                System.out.print(" * ");

            }
            System.out.println();
        }        
    }
    
}
