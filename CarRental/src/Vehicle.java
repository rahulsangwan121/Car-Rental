import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class  Vehicle {
    Scanner scanner = new Scanner(System.in);
    protected abstract double calculateRateDay(int day);
    protected abstract double calculateRateHours(int hours);
    private final String vehicleNumber;
    private final String modelName;
    private boolean isAvailable;
    private double bill;
    private void displayDetails(){
        System.out.println("----------------------------------------\n"+"Model : "+modelName+"\nVehicle Number : "+vehicleNumber+"\nTotal bill : "+bill+"\n----------------------------------------");
    }

    Vehicle(String vehicleNumber, String modelName){
        isAvailable=true;
        this.vehicleNumber=vehicleNumber;
        this.modelName=modelName;
    }
    public void rent(){

       try {
           if(!isAvailable){
               System.out.println("This vehicle is not available!\n");
           } else{
               System.out.println("Option 1 : Rent Vehicle for Day\nOption 2 : Rent Vehicle for Hour");

               int option = scanner.nextInt();
               if(option ==1){
                   System.out.print("Enter number of Days : ");
                   int days = scanner.nextInt();
                   bill = calculateRateDay(days);
               } else if (option ==2) {
                   System.out.print("Enter number of hours : ");
                   int hours = scanner.nextInt();
                   if(hours>24){
                       throw new Exception("Hours can not be exceeds more than 24");
                   }
                   bill = calculateRateHours(hours);
               } else{
                   System.out.println("Invalid option");
                   return;
               }
               displayDetails();
               System.out.println("Thank you for renting this vehicle.\nDrive it carefully!\n");
               isAvailable=false;
           }
       } catch (InputMismatchException i){
           System.out.println("Please input valid values!");
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

}
