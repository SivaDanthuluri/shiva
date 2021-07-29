package employee_ids;

public class AdaarNo {

	public static void main(String[] args) {
		System.out.println(isAadarNo("459863214758"));

	}
	public static boolean isAadarNo(String s) {
		boolean a;
		return a= s.matches("[0-9]{12}");
		}
}
