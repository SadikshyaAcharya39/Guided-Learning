public class Project5 {
    public static final String STRING_TO_BE_CHANGED = "I hate you.";
	
	public static void main(String[] args)
	{
		String replacedString = STRING_TO_BE_CHANGED.replaceFirst("hate", "love");
		
		System.out.println("The line of text to be changed is:");
		System.out.println(STRING_TO_BE_CHANGED);		
		
		System.out.println("I have rephrased that line to read:");
		System.out.println(replacedString);
	}
}

