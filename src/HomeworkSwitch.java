public class HomeworkSwitch {
    public static void main(String[] args) {
        String nameOfMonth = "Decembe";
        switch (nameOfMonth) {
            case "December", "January","February":
                System.out.println("It is Winter");
                break;
            case "March", "April", "May":
                System.out.println("It is Spring");
                break;
            case "June", "July", "August":
                System.out.println("It is Summer");
                break;
            case "September", "October", "November":
                System.out.println("It is Autumn");
                break;
            default:
                System.out.println("Time of year does not exist");
        }
    }
}
