/*Project 1
One way to measure the amount of energy that is expended during exercise is to use meta-bolic equivalents (MET).  
Here are some METS for various activities:

Running 6 MPH: 10 METS
Basketball: 8 METS
Sleeping: 1 MET

The number of calories burned per minute may be estimated using the following formula:

CaloriesjMinute = 0.0175 * MET * Weight in kilograms 

Write a program that calculates and outputs the total number of calories burned for a 150-pound person who runs 6 MPH for 30 minutes, plays basketball for 30 minutes, and then sleeps for 6 hours.  One kilogram is equal to 2.2 pounds.

 */



public class Project1 {
    public static void main(String[] args) {
        int running = 10;
        int basketball= 8;
        int sleeping = 1;
        float weight =  150 / 2.2f;
        float calorieRunning = (float) (0.0175 * running * weight * 30);
        float caloriesBasketball =(float) (0.0175 * basketball *weight *30);
        float caloriesSleeping =(float) (0.0175 * sleeping*weight *6*60);
        float totalCalories = calorieRunning + caloriesBasketball + caloriesSleeping;
        System.out.println("The total calories burned for a person is: " + totalCalories);



    }
    
}
