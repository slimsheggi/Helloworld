public class Main {
    public static void main(String[] args) {
        // Task 1

        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний."); }
        else  {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно подождать.");
        }

        // Task 2

        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Task 3

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        // Task 4

        int humanAge = 8;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад.");
        }
        if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу.");
        }
        if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то его место в университете.");
        }
        if (humanAge > 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то он должен ходить на работу");
        }

        // Task 5

        int childAge = 15;
        if (childAge < 5) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему нельзя кататься на атракционе.");
        }
        if (childAge >= 5 && childAge <= 14) {
            System.out.println("Если возраст ребёнка равен " + childAge + ", то ему можно кататься на атракционе в сопровождении взрослых.");
        }
        if (childAge > 14) {
            System.out.println("Если возрат ребёнка равен " + childAge + ", то ему можно кататься на атракционе без сопровождения взрослых.");
        }

        // Task 6

        int people = 105;
        int totalPlaces = 102;
        int seating = 60;
        int standing = totalPlaces - seating;
        if (people < seating) {
            System.out.println("Если пассажиров " + people + " человек, то есть седячие места.");
        }
        else if (people > seating && people <= totalPlaces) {
            System.out.println("Если пассажиров " + people + " человек, то есть только стоячие места.");
        }
        else if (people > totalPlaces) {
            System.out.println("Если пассажиров " + people + " человек, то мест в вагоне больше нет");
        }

        // Task 7

        int one = 10;
        int two = 20;
        int three = 5;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше остальных");
        }
        else if (two > one && two > three) {
            System.out.println("Число " + two + " больше остальных");
        }
        else if (three > one && three > two) {
            System.out.println("Число " + three + " больше остальных");
        }
    }
}