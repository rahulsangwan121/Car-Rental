public class Bike extends Vehicle{
    @Override
    public double calculateRateDay(int day){
        return 700*day;
    }
    @Override
    public double calculateRateHours(int hours){
        return 150*hours;
    }

    Bike(String vehicleNumber, String modelName){
        super(vehicleNumber,modelName);
    }
}
