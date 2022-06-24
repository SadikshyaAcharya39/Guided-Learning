public class Project2 {
    public static final int COUPONS_PER_CANDYBAR = 10;
	public static final int COUPONS_PER_GUMBALL = 3;

	public static void main(String[] args)
	{
		int numbeOfCouponsWin = 37;

		int numberOfCandybars = numbeOfCouponsWin / COUPONS_PER_CANDYBAR;

		int remainingCoupons = numbeOfCouponsWin % COUPONS_PER_CANDYBAR;

		int numberOfGumballs = remainingCoupons / COUPONS_PER_GUMBALL;

		remainingCoupons = remainingCoupons % COUPONS_PER_GUMBALL;

		System.out.println("Number of coupons win:       " + numbeOfCouponsWin);
		System.out.println("Number of candy bars get:    " + numberOfCandybars);
		System.out.println("Number of gumballs get:      " + numberOfGumballs);
		System.out.println("Number of remaining coupons: " + remainingCoupons);
	}
}

