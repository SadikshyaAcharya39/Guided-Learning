public class Project6 {
    public static double PI = 3.14;
	public static void main(String[] args)
	{
       double gearSizeInInches = 100.0;
	   double cadenceInRPM = 90.0;
       double speedInMPH = gearSizeInInches * PI * (1.0 / 12.0)* (1.0 / 5280.0) * cadenceInRPM * (60.0 / 1.0);

		System.out.println("Gear size in inches   : " + gearSizeInInches);
		System.out.println("Cadence in RPM        : " + cadenceInRPM);
		System.out.println("Bicyclist speed in MPH: " + speedInMPH);
	}
}

