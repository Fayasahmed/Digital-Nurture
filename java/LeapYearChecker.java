public class LeapYearChecker {
    public static void main(String[] args) {
        int year = 2024;
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (leap ? " is a leap year." : " is not a leap year."));
    }
}