public class Project4 {
    
    //Program starts the main argument function
    public static void main(String []args)
    {
   
       //Defined four constant items
       double killMouse =0.0000013;
       double weightMouse = 0.020; 
       double dieterStart = 120.0;
       double desiredWeight =90.0;
       //Variable declaration
       double safetySoda;
       final double PERCENTAGE_OF_ArtificialSweetener = 0.001;

       // Calculate the proportionate fatal amount of 
       // soda for safety
       safetySoda = (killMouse / weightMouse)
               * desiredWeight / PERCENTAGE_OF_ArtificialSweetener;
        //Print result on screen
       System.out.printf("The dieter can safely have up" 
               + " to "+safetySoda 
               + " drink.."); 

    }
}
