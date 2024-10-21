public class Main {
    public static void main(String[] args) {
        //task 1

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

        //Task 2

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

        // Task 3

        byte teacherL = 23;
        byte teacherA = 27;
        byte teacherE = 30;
        int allStudents = teacherA + teacherL + teacherE;
        System.out.println(allStudents);
        short allPapers = 480;
        System.out.println(allPapers);
        int paperForStudents = allPapers / allStudents;
        System.out.println("На каждого ученика расчитано " + paperForStudents + " листов бумаги");

        // Task 4

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

        // Task 5

        byte allPaint = 120;
        byte whitePaintInOneClassRum = 2;
        byte brownPaintInOneClassRum = 4;
        int allPaintInOneClassRum = whitePaintInOneClassRum + brownPaintInOneClassRum;
        System.out.println("Всего краски на один кабинет " + allPaintInOneClassRum);
        int totalClassRum = allPaint / allPaintInOneClassRum;
        System.out.println("Всего классов " + totalClassRum);
        int totalWhitePaint = whitePaintInOneClassRum * totalClassRum;
        int totalBrownPaint = brownPaintInOneClassRum * totalClassRum;
        System.out.println("В школе где " + totalClassRum + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        //task 6

        byte totalBananas = 5;
        short totalMilk = 200;
        byte totalIceCream = 2;
        byte totalEggs = 4;
        System.out.println("Всего на завтрак " + totalBananas + " бананов, " + totalMilk + " миллилитров молока, " + totalIceCream + " мороженного и " + totalEggs + " яйца.");

        byte weightOneBananas = 80;
        short weightOneMilk = 105;
        byte weightOneIceCream = 100;
        byte weightOneEggs = 70;
        System.out.println("Вес одного банана " + weightOneBananas + " грамм, вес ста миллилитров молока " + weightOneMilk + " грамм, вес одного мороженного " + weightOneIceCream + " грамм и вес одного яйца " + weightOneEggs + " грамм.");

        int weightAllBananas = totalBananas * weightOneBananas;
        int weightAllMilk = weightOneMilk + weightOneMilk;
        int weightAllIceCream = totalIceCream * weightOneIceCream;
        int weightAllEggs = totalEggs * weightOneEggs;
        System.out.println("Общий вес бананов " + weightAllBananas + " грамм, молока " + weightAllMilk + " грамм, мороженного " + weightAllIceCream + " грамм, яиц " + weightAllEggs + " грамм.");

        double totalBreakfastWeight = weightAllBananas + weightAllMilk + weightAllIceCream + weightAllEggs;
        System.out.println("Общий вес завтрака " + totalBreakfastWeight + " грамм.");

        double weightInKilograms = totalBreakfastWeight / 1000;
        System.out.println("Общий вес завтрака " + weightInKilograms + " киллограмм.");

        // task 7

        short needToLoseAKilo = 7*1000;
        short losesPerDay = 250;
        short losesPerDay2 = 500;
        int daysToLoseWeight = needToLoseAKilo / losesPerDay;
        int daysToLoseWeight2 = needToLoseAKilo / losesPerDay2;
        int onAverageDays = (daysToLoseWeight + daysToLoseWeight2) / 2;
        System.out.println("Если спортсмен будет терять по " + losesPerDay + " грамм в день, ему понадобиться " + daysToLoseWeight + " дней а если по " + losesPerDay2 + " грамм в день то " + daysToLoseWeight2 + " дней. В среднем для похудения понадобится " + onAverageDays + " днь.");

        // task 8

        double annualIncrease = 0.1;

        int salaryMari = 67760;
        int salaryMariInYear = salaryMari * 12;
        double salaryMariAfterPromotion = (salaryMari * annualIncrease) + salaryMari;
        double salaryMariInYearsAfterPromotion = salaryMariAfterPromotion * 12;
        double salaryMariDifferenceInYear = salaryMariInYearsAfterPromotion - salaryMariInYear;
        System.out.println("Маша теперь получает " + salaryMariAfterPromotion + " рублей. Годовой доход вырос на " + salaryMariDifferenceInYear);

        int salaryDen = 83690;
        int salaryDenInYear = salaryDen * 12;
        double salaryDenAfterPromotion = (salaryDen * annualIncrease) + salaryDen;
        double salaryDenInYearsAfterPromotion = salaryDenAfterPromotion * 12;
        double salaryDenDifferenceInYear = salaryDenInYearsAfterPromotion - salaryDenInYear;
        System.out.println("Денис теперь получает " + salaryDenAfterPromotion + " рублей. Годовой доход вырос на " + salaryDenDifferenceInYear);

        int salaryKris = 76230;
        int salaryKrisInYear = salaryKris * 12;
        double salaryKrisAfterPromotion = (salaryKris * annualIncrease) + salaryKris;
        double salaryKrisInYearsAfterPromotion = salaryKrisAfterPromotion * 12;
        double salaryKrisDifferenceInYear = salaryKrisInYearsAfterPromotion - salaryKrisInYear;
        System.out.println("Кристина теперь получает " + salaryKrisAfterPromotion + " рублей. Годовой доход вырос на " + salaryKrisDifferenceInYear);
    }
}