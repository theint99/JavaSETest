package with_ide;

public class SwitchCaseStringCase {
    public static void main(String[] args) {
        String day = "Sunday";
        switch (day){
            case "Monday":
                System.out.println(day + " is first day");
                break;
            case "Tuesday":
                System.out.println(day + " is second  day");
                break;
            case "Wednesday":
                System.out.println(day + " is third  day");
                break;
            case "Thursday":
                System.out.println(day + " is fourth  day");
                break;
            case "Friday":
                System.out.println(day + " is fifth  day");
                break;
            case "Saturday":
                System.out.println(day + " is weekend day");
                break;
            case "Sunday":
                System.out.println(day + " is also weekend day");
                break;
            default:
                System.out.println("something wrong");
        }
    }
}
