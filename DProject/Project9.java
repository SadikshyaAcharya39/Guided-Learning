public class Project9 {
    public static void main(String[] args) {
         final int  WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS = 110;
         final int MINIMUM_ALLOW_HEIGHT_IN_FEET = 5;
         final int WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS = 5;
         final int INCHES_PER_FEET = 12;
    
            int personHeightInFeet = 6; // should not be less than 5
            int personHeightInInches = 3;
    
            double idealBodyWeightInPounds = WEIGHT_FOR_MINIMUM_HEIGHT_IN_POUNDS
                    + ((personHeightInFeet - MINIMUM_ALLOW_HEIGHT_IN_FEET)
                            * INCHES_PER_FEET + personHeightInInches)
                    * WEIGHT_PER_ADDITIONAL_INCH_IN_POUNDS;
    
            System.out.println("Person height in feet: "
                            + personHeightInFeet + "."
                            + personHeightInInches);
            
            System.out.println("Ideal Body Weight in pounds: "
                    + idealBodyWeightInPounds);
        }
    }
    
