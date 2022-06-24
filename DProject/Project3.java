public class Project3 {
    public static void main(String[] args)
	{
		String first;
		String last;
		String pigLatinFirst;
		String pigLatinLast;
		String pigLatinName;

		first = "walt";
		last = "savitch";

		pigLatinFirst = first.substring(1) + first.charAt(0) + "ay";
		pigLatinLast = last.substring(1) + last.charAt(0) + "ay";

		pigLatinFirst = pigLatinFirst.substring(0, 1).toUpperCase() 
						+ pigLatinFirst.substring(1);

		pigLatinLast = pigLatinLast.substring(0, 1).toUpperCase()
						+ pigLatinLast.substring(1);

		pigLatinName = pigLatinFirst + " " + pigLatinLast;

		System.out.println("First Name:    " + first);
		System.out.println("Last Name:     " + last);
		System.out.println("PigLatin Name: " + pigLatinName);
	}
}

