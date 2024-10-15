public class Main {
    public static void main(String[] args) {

        byte a = 10;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 20;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 30;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 40;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 5.0f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 6.0;
        System.out.println("Значение переменной f с типом double равно " + f);

        double one = 27.12;
        System.out.println(one);
        float two = 2.786f;
        System.out.println(two);
        short three = 569;
        System.out.println(three);
        short four = -159;
        System.out.println(four);
        short five = 27897;
        System.out.println(five);
        byte six = 67;
        System.out.println(six);
        long seven = 987678965549L;
        System.out.println(seven);

        byte teacherL = 23;
        byte teacherA = 27;
        byte teacherE = 30;
        int allStudents = teacherA + teacherL + teacherE;
        System.out.println(allStudents);
        short allPapers = 480;
        System.out.println(allPapers);
        int paperForStudents = allPapers / allStudents;
        System.out.println("На каждого ученика расчитано " + paperForStudents + " листов бумаги");

        byte bottlesProduces = 16;
        byte workingMinutes = 2;
        byte requiredOperatingTime = 20;
        int createdBottles20 = (bottlesProduces / workingMinutes) * 20;
        System.out.println("За " + requiredOperatingTime + " минут машина произвела " + createdBottles20 + " штук бутылок");

        byte hoursInADay = 24;
        byte minutesInAnHour = 60;
        int requiredOperatingTime2 = hoursInADay * minutesInAnHour;
        System.out.println(requiredOperatingTime2);
        int createdBottlesDey = (bottlesProduces / workingMinutes) * requiredOperatingTime2;
        System.out.println("За сутки машина произвела " + createdBottlesDey + " штук бутылок");

        byte workingDey = 3;
        int requiredOperatingTime3 = hoursInADay * workingDey * minutesInAnHour;
        System.out.println(requiredOperatingTime3);
        int createdBottles3Dey = (bottlesProduces / workingMinutes) * requiredOperatingTime3;
        System.out.println("За 3 дня машина произвела " + createdBottles3Dey + " штук бутылок");

        byte workingMonth = 30;
        int requiredOperatingTime4 = workingMonth * hoursInADay * minutesInAnHour;
        System.out.println(requiredOperatingTime4);
        int createdBottlesMonth = (bottlesProduces / workingMinutes) * requiredOperatingTime4;
        System.out.println("За месяц машина произвела " + createdBottlesMonth + " штук бутылок");

        byte allPaint = 120;
        byte whitePaintInOneClassRum = 2;
        byte brownPaintInOneClassRum = 4;
        int allPaintInOneClassRum = whitePaintInOneClassRum + brownPaintInOneClassRum;
        System.out.println("Всего краски на один кабинет " + allPaintInOneClassRum);
        int totalClassRum = allPaint / allPaintInOneClassRum;
        System.out.println("Всего классов " + totalClassRum);
        int totalWhitePaint = whitePaintInOneClassRum * totalClassRum;
        int totalBrownPaint = brownPaintInOneClassRum * totalClassRum;
        System.out.println("В школе где " + totalClassRum + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }
}