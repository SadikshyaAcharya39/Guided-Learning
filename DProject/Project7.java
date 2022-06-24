public class Project7 {
    private static int SECONDS_PER_HOUR = 3600;
	private static int SECONDS_PER_MINUTE = 60;

	public static void main(String[] args)
	{
		int totalSeconds;
		int remainingSeconds;
		int hours;
		int minutes;
		int seconds;

		totalSeconds = 50391;

		hours = totalSeconds / SECONDS_PER_HOUR;

		remainingSeconds = totalSeconds % SECONDS_PER_HOUR;

		minutes = remainingSeconds / SECONDS_PER_MINUTE;

		remainingSeconds = remainingSeconds % SECONDS_PER_MINUTE;

		seconds = remainingSeconds;

		System.out.println("There are " + hours + " hours, "
				+ minutes + " minutes, and " + seconds
				+ " seconds in " + totalSeconds + " seconds.");

		
		totalSeconds = 61502;

		hours = totalSeconds / SECONDS_PER_HOUR;

		remainingSeconds = totalSeconds % SECONDS_PER_HOUR;

		minutes = remainingSeconds / SECONDS_PER_MINUTE;

		remainingSeconds = remainingSeconds % SECONDS_PER_MINUTE;

		seconds = remainingSeconds;

        System.out.println("There are " + hours + " hours, "
        + minutes + " minutes, and " + seconds
        + " seconds in " + totalSeconds + " seconds.");
}
			

}
