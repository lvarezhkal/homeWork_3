public class Main {
    public static void main(String[] args) {
     //1
     byte hotDog = 17;
     short pupok = -295;
     int horse = 123456789;
     long tree = 2L;
     float quantityOfKittens = 12.67f;
     double freeTime = 0.256;
        System.out.println("Значение переменной hotDog с типом byte равно " + hotDog);
        System.out.println("Значение переменной pupok с типом short равно " + pupok);
        System.out.println("Значение переменной horse с типом int равно " + horse);
        System.out.println("Значение переменной tree с типом long равно " + tree);
        System.out.println("Значение переменной quantityOfKittens с типом float равно " + quantityOfKittens);
        System.out.println("Значение переменной freeTime с типом double равно " + freeTime);
        //2
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
        //3
        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeyevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        int allStudents = studentsEkaterinaAndreevna + studentsAnnaSergeyevna + studentsLyudmilaPavlovna;
        int sheets = 480;
        int sheetsForEachStudent = sheets / allStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsForEachStudent + " листов бумаги");
        //4
        byte machineProduction = 16;
        int machineProductionPerMinute = machineProduction / 2;
        int productIn20Minutes = machineProductionPerMinute * 20;
        short minutesInDay = 24 * 60;
        int productPerDay = machineProductionPerMinute * minutesInDay;
        short minuterPer3Day = 3 * 24 * 60;
        int productPer3Day = machineProductionPerMinute * minuterPer3Day;
        double minutePerMonth = (((double) 366 / 12) * 24) * 60;
        double productionPerMonth = machineProductionPerMinute * minutePerMonth;
        System.out.println("За 20 минут машина произвела " + productIn20Minutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + productPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productPer3Day + " штук бутылок");
        System.out.println("За за месяц машина произвела " + productionPerMonth + " штук бутылок");
       //5
       byte totalPaint = 120;
       byte whitePaint = 2;
       byte brownPaint = 4;
       int totalClasses = totalPaint / (whitePaint + brownPaint);
       int totalWhitePaint = totalClasses * whitePaint;
       int totalBrownPaint = totalClasses * brownPaint;
       System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
       //6
       short bananaWeight = 5 * 80;
       short milkWeight = 2 * 105;
       short iceCreamWeight = 2 * 100;
       short eggWeight = 4 * 70;
       int allWeight = bananaWeight + milkWeight + iceCreamWeight + eggWeight;
       float allWeightKg = allWeight / 1000f;
        System.out.println("Вес спортзавтрака " + allWeight + "г");
        System.out.println("Вес спортзавтрака " + allWeightKg + "кг");
        //7
        short loseWeight = 7 * 1000;
        short lazyDay = 250;
        short hardDay = 500;
        int timeForLazy = loseWeight / lazyDay;
        int timeForHard = loseWeight / hardDay;
        int timeAverage = (timeForLazy + timeForHard) / 2;
        System.out.println("Вес который надо сбросить в граммах " + loseWeight);
        System.out.println(timeForLazy + " дней потребуется при потере в весе " + lazyDay + "г в сутки");
        System.out.println(timeForHard + " дней потребуется при потере в весе " + hardDay + "г в сутки");
        System.out.println(timeAverage + " день при потере от " + lazyDay + "г до " + hardDay + "г в сутки" );
        //8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int christinaSalary = 76230;
        int mashaSalaryNew = mashaSalary + (mashaSalary / 10);
        int denisSalaryNew = denisSalary + (denisSalary / 10);
        int christinaSalaryNew = christinaSalary + (christinaSalary / 10);
        int mashaSalaryForTheYear = mashaSalary * 12;
        int denisSalaryForTheYear = denisSalary * 12;
        int christinaSalaryForTheYear = christinaSalary * 12;
        int mashaSalaryForTheYearNew = mashaSalaryNew * 12;
        int denisSalaryForTheYearNew = denisSalaryNew * 12;
        int christinaSalaryForTheYearNew = christinaSalaryNew * 12;
        int mashaSalaryDifference = mashaSalaryForTheYearNew - mashaSalaryForTheYear;
        int denisSalaryDifference = denisSalaryForTheYearNew - denisSalaryForTheYear;
        int christinaSalaryDifference = christinaSalaryForTheYearNew - christinaSalaryForTheYear;
        System.out.println("Маша теперь получает " + mashaSalaryNew +" рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryNew +" рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей");
        System.out.println("Кристина теперь получает " + christinaSalaryNew +" рублей. Годовой доход вырос на " + christinaSalaryDifference + " рублей");

    }
}