public class HomeworkIf {
    public static void main(String[] args) {
        String nameOfMonth = "June";
        if (nameOfMonth.equals("February") || nameOfMonth.equals("December") || nameOfMonth.equals("January")) {
            System.out.println("It is Winter");
        } else if (nameOfMonth.equals("March") || nameOfMonth.equals("April") || nameOfMonth.equals("May")) {
            System.out.println("It is Spring");
        } else if (nameOfMonth.equals("June") || nameOfMonth.equals("July") || nameOfMonth.equals("August")) {
            System.out.println("It is Summer");
        } else if (nameOfMonth.equals("September") || nameOfMonth.equals("October") || nameOfMonth.equals("November")) {
            System.out.println("It is Autumn");
        } else {
            System.out.println("Time of year does not exist");
        }
    }
}
