import java.util.Scanner;

public class Day2 {
    public static void main(String[]args){

        //play with integers and doubles
        int x = 5;
        int y = 5;
        double z = x;
        double a = y;

        System.out.println(x + " + " + y + " = " + (x + y));

        System.out.println(z + " + " + a + " = " + (z + a));

        System.out.println(x + " + " + z + " = " + (x + z));

        System.out.println(a + " + " + y + " = " + (a + y));

        System.out.println(a + " + " + y + " = " + ((int)a + y));

        System.out.println(x + " + " + y + " = " + ((double)x + y));

        System.out.println(x + " + " + y + " = " + (double)(x + y));

        System.out.println(z + " + " + a + " = " + (int)(z + a));

        //play with arithmetic
        
        System.out.println((int)a%2);
        
        if (a%2 == 1){
            System.out.println((int)a + " Is Odd");
        }
            
        boolean odd = false;
        if ((a*2)%2 == 1) {
            odd = true;
        }else{
            odd = false;
        }
        if (odd == true){
            System.out.println(a*2 + " Is Odd");

        }else{
            System.out.println(a*2 + " Is Even");
        }
        int newvar = ((x*2) /3) %2;

        System.out.println(newvar);

        newvar += 4;
        newvar*=2;
        newvar/=2;
        newvar-=4;

        System.out.println(newvar);

        //Problem 1
        a = 17;
        int b = 5;

        System.out.println((int)a / b);
        System.out.println((double)a / b);

        //Any equation that uses decimal/double assigned variables will automatically overide and convert 
        // the rest of the variables and answer within the equation into a decimal/double. 
        //A equation all integers without doubles/decimals will always yield a integer no matter the remainder.

        //Problem 2 + Trying to collect a input.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter another number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println(num + " and " + num2);

        System.out.println("Ok enter a final number now: ");
        num = scanner.nextInt();
        scanner.nextLine();

        if (num%2 == 1){
            odd = true;
            System.out.print("Odd");
        }else{
            odd = false;
            System.out.print("Even");
        }
        int counter = 5;
        while (counter > 0){
            System.out.println("Enter Num: ");
            num = scanner.nextInt();
            scanner.nextLine();

            if (num%2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("odd");
            }
            counter-=1;
            }
            scanner.close();
        
        // Problem 3

        double volt = 11.4;
        double maxvolt = 12;

        System.out.println((volt/maxvolt)*100 + "% Charged");

        //Problem 4

        int totalsec = 150;
        int secondsElapsed = 95;
        
        int remainingSeconds = totalsec-secondsElapsed;

        System.out.println("Remaining Seconds = " + remainingSeconds);
        
        //Problem 5

        int motorRPM = 6000;
        int gearReduction = 20;

        int outputRPM = motorRPM/gearReduction;

        System.out.println(outputRPM);

        System.out.println(motorRPM/(double)gearReduction);

        //A gear reduction assigned as a double yields a final motor rpm as a double with a decimal.
        //Without any variables becoming doubles the final motor rpm will be a integer.
    }

}
