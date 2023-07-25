    class SpecialToday {
    private static String desert = "Chocolate Cake";

    public static String getDesert() {
        return desert;
    }
}
class MainMenu 
{
	public static void main(String[] args) 
		{
		System.out.println("Today's Specials: " + getSpecials());
		}
	public static String getSpecials() 
		{
			return SpecialToday.getDesert();
		}
}
