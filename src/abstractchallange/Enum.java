package abstractchallange;

import java.util.Scanner;

public class Enum {
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    }

    public void tellItLikeItIs(Day day) {
        switch (day) {
            case SUNDAY:
                System.out.println("Today is Sunday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Today is Thursday");
                break;
            case FRIDAY:
                System.out.println("Today is Friday");
                break;
            case SATURDAY:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Wrong entry");
                break;
        }
    }

    public static void main(String[] args) {
        Enum obj = new Enum();
        Scanner st = new Scanner(System.in);
        System.out.print("Enter a day of the week: ");
        String name = st.nextLine().toUpperCase();
        Day day = Day.valueOf(name);

        obj.tellItLikeItIs(day);
    }
}
