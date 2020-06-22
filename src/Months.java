public class Months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String result = "";
        for (String i: months) {
            result += i;
            if (i != "December") {
                result += ", ";
            } else {
                result += ".";
            }
        }
        System.out.println(result);
    }
}
