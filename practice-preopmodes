public class Playing{

    public static class robot{
        //Motor Fields
        double motorPowerA;
        double motorPowerB;
        double motorPowerC;
        double motorPowerD;

        String motorA;
        String motorB;
        String motorC;
        String motorD;

        //Other Fields
        String controlHub;
        int controlHubPowerInput;
        int controlHubPowerOutput;

        String driverHub;
        String controller1;
        String controller2;

        int battery;

        //Creating the object, in this case a robot, by adding our own specifications, can be altered to our expectations.
        public robot(String A, String B, String C, String D, 
                     String controlHub, int controlHubPowerInput, int controlHubPowerOutput, 
                     String driverHub, String controller1, String controller2,
                     int battery){

            this.motorA = A;
            this.motorB = B;
            this.motorC = C;
            this.motorD = D;

            this.controlHub = controlHub;
            this.controlHubPowerInput = controlHubPowerInput;
            this.controlHubPowerOutput = controlHubPowerOutput;
            
            this.driverHub = driverHub;
            this.controller1 = controller1;
            this.controller2 = controller2;

            this.battery = battery;
        }
        //To see if the motor selected in object creation has a possible connection to the real model.
        public String motorDiagnostics(String whichMotor){
            if (whichMotor == this.motorA){
                return (this.motorA + ": Online");
            }
            else if (whichMotor == this.motorB){
                return (this.motorB + ": Online");
            }
            else if (whichMotor == this.motorC){
                return (this.motorC + ": Online");
            }
            else if (whichMotor == this.motorD){
                return (this.motorD + ": Online");
            }
            else {
                return (whichMotor + ": Not Found");
            }
        }

        public String batteryDiagnostics(){
            if (this.battery<0){
                return "Battery: Dead";
            }
            else if (this.battery>12){
                return "Wrong Voltage Entered";
            }
            else{
                this.controlHubPowerInput = this.battery;
                return "Current Battery level: "+ this.battery +"\nCurrent ControlHub Power Input: "+controlHubPowerInput;
            }
        }

        public String controlHubDiagnostics(int battery, String controlHub){
            if (controlHub == this.controlHub){
                return("Current ControlHub: "+this.controlHub+": Online\nCurrent Power Output: "+this.controlHubPowerOutput+"\nCurrent Power Input: "+this.controlHubPowerInput);
            }   
            else {
                return("Control Hub: Not Found");
            }
        }

        public String driverDiagnostics(String driver1, String driver2, String driverHub){
            if (driverHub == this.driverHub){
                if (driver1 == this.controller1){
                    if (driver2 == this.controller2){
                        return "Driver Hub: Connected\nDriver 1: Connected\nDriver 2: Connected";
                    }
                    else{
                        return "Driver Hub: Connected\nDriver 1: Connected\nDriver 2: Not Found";
                    }
                }
                else if (driver2 == this.controller2){
                    return "Driver Hub: Connected\nDriver 1: Not Found\nDriver 2: Connected";
                }
                else{
                    return "Driver Hub: Connected\nNo Controllers Found.";
                }
            }
            else{
                return"Driver Hub: Not Found";
            }
        }

        //To run a diagnostic check, since I dont have a real robot with command lines to physically connect to components 
        // I just match the inputed connection strings with the real model number connection names, I presume there would be commands 
        // Already installed for this but this is a cool virtual way to play around with. 
        // Now if the user inputs the wrong connection type while creating the robot object in the main method, and error in the diagnostics would occur.
        // This diagnostic method vvv can be altered to look for real motors and controlhubs that have been connected physically and give out a code output.
        public void diagnostics(){
            System.out.println (
                "\n"+
                //These are the lines that match the user input with the set robot servo connection outputs.
                motorDiagnostics("SKU_REV-41-1097_A")+"\n"+
                motorDiagnostics("SKU_REV-41-1097_B")+"\n"+
                motorDiagnostics("SKU_REV-41-1097_C")+"\n"+
                motorDiagnostics("SKU_REV-41-1097_D")+"\n"+
                "~\n"+
                batteryDiagnostics()+"\n"+
                "~\n"+
                controlHubDiagnostics(12, "SKU_REV-31-1595")+"\n"+
                "~\n"+
                driverDiagnostics("REV_USB_PS4_Compatible_Gamepad_1","REV_USB_PS4_Compatible_Gamepad_2", "SKU_REV-31-1596")
            );
        }



    }

    public static void main(String[]args){
        //In my opinion, to code our robot we should create it as an object in code with methods to constantly call and tweak our objects.
        //This line creates a robot called 'enzo' and the user get's to classify the specs it should be connected to. This step comes before the diagnostics.
        robot enzo = new robot("SKU_REV-41-1097_A", "SKU_REV-41-1097_B", "SKU_REV-41-1097_C", "SKU_REV-41-1097_D", 
                               "SKU_REV-31-1595", 0,0,
                               "SKU_REV-31-1596", "REV_USB_PS4_Compatible_Gamepad_1", "REV_USB_PS4_Compatible_Gamepad_2", 
                               12 );
        System.out.println(enzo);

        enzo.diagnostics();
    }

}
