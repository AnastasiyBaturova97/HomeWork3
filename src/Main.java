public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte B = 125;
        System.out.println("Значение переменной byte с типом целочисленный равно " + B);
        short SH = 30000;
        System.out.println("Значение переменной short с типом целочисленный равно " + SH);
        int N = 400000000;
        System.out.println("Значение переменной int с типом целочисленный равно " + N);
        long L = 25554346654L;
        System.out.println("Значение переменной long с типом целочисленный равно " + L);
        float FT = 20.05f;
        System.out.println("Значение переменной float с типом с плавающей точкой равно " + FT);
        double DL = 604.1997;
        System.out.println("Значение переменной double с типом с плавающей точкой равно " + DL);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float one = 27.12f;
        System.out.println(one);
        long two = 987678965549L;
        System.out.println(two);
        double three = 2.786;
        System.out.println(three);
        int four = 569;
        System.out.println(four);
        short five = -159;
        System.out.println(five);
        int six = 27897;
        System.out.println(six);
        byte seven = 67;
        System.out.println(seven);
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int totalPaper = 480;
        System.out.println("Всего " + totalPaper + " листов бумаги");
        int totalStudents = LP + AS + EA;
        System.out.println("Общее количество " + totalStudents + " учеников");
        int toEach = (byte) (totalPaper / totalStudents);
        System.out.println("На каждого ученика рассчитано " + toEach + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int performance = 16;
        System.out.println( " Производительность машины за 2 минуты составляет " + performance + " бутылок");
        performance = performance / 2;
        System.out.println( " Производительность машины за 1 минуты составляет " + performance + " бутылок" );
        int TM = 20;
        int day = 1440;
        System.out.println( "В 24 часах " + day + " минут");
        int threeDays = 4320;
        System.out.println("В трёх днях " + threeDays + " минут");
        int month = 43200;
        System.out.println( "В месяце " + month + " минут");
        int performanceTM = TM * performance;
        System.out.println( "За 20 минут машина произвела " + performanceTM + " штук бутылок");
        int performanceDay = day * performance;
        System.out.println("За 24 часа машина произвела " + performanceDay + " штук бутылок");
        int performanceThreeDays = threeDays * performance;
        System.out.println("За 3 дня машина произвела " + performanceThreeDays + " штук бутылок");
        int performanceMonth = month * performance;
        System.out.println("За 30 дней машина произвела " + performanceMonth + " штук бутылок");


    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte paintsForOneCheckout = ((byte) (whitePaint + brownPaint));
        System.out.println( "Всего каски на 1 класс " + paintsForOneCheckout + " шт");
        byte classesAtSchool = (byte) (totalPaint / paintsForOneCheckout);
        System.out.println( "Всего " + classesAtSchool + " классов");
        whitePaint =((byte) (whitePaint * classesAtSchool));
        brownPaint =((byte) (brownPaint * classesAtSchool));
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски!" );

    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananas = 5 * 80;
        System.out.println( bananas + " грамм в 5 бананах ");
         short milk = 2 * 105;
         System.out.println( milk + " грамм в двухсот милилитрах молока");
         short iceCream = 100 * 2;
         System.out.println( iceCream + " грамм в 2 брикетах");
        short rawEggs = 4 * 70;
        System.out.println( rawEggs + " грамм в 4 яйцах");
        short cocktail = (short) (bananas + milk + iceCream + rawEggs);
        System.out.println( "Весит коктель " + cocktail + " грамм");
       float cocktailKG = cocktail / 1_000f;
        System.out.println( cocktailKG + " в килограммах " );
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int loseKG = 7 * 1_000;
        System.out.println( loseKG + " вес в граммах");
        int loseFO = loseKG / 250;
        int loseSO = loseKG / 500;
        System.out.println( "Если худеть на 250 гр.  каждый день, то " + loseFO + " дней, а при похудении 500 гр. каждый день, то " + loseSO + " дней");
        int loseSD = (loseFO + loseSO ) / 2;
        System.out.println("В среднем " + loseSD + " дней для результата");

    }
    public static void task8 () {
        System.out.println("Задача 8");

        long Masha = 67_780L;
        System.out.println( Masha);
        long Denis = 83_690L;
        System.out.println( Denis);
        long Kristina = 76_230L;
        System.out.println( Kristina);
        long MashaInYear = Masha * 12;
        System.out.println( MashaInYear + " получает Маша за год");
        long DenisInYear = Denis * 12;
        System.out.println( DenisInYear + " получает Денис за год");
        long KristinaInYear = Kristina * 12L;
        System.out.println( KristinaInYear + " получает Кристина за год");

        long MashaIndexing = (Masha * 10) / 100L;
        long DenisIndexing = (Denis * 10) / 100L;
        long KristinaIndexing = (Kristina * 10) / 100L;
        long MashaIndexingYear = ( Masha + MashaIndexing ) * 12L;
        long DenisIndexingYear = (Denis + DenisIndexing) * 12L;
        long KristinaIndexingYear = ( Kristina + KristinaIndexing) * 12L;

        long MashaRG = MashaIndexingYear - MashaInYear;
        System.out.println( " Маша теперь получает " + MashaIndexingYear + " рублей. Годовой доход вырос на " + MashaRG + " рублей");
        long DenisRG = DenisIndexingYear - DenisInYear;
        System.out.println( " Денис теперь получает " + DenisIndexingYear + " рублей. Годовой доход вырос на " + DenisRG + " рублей");
        long KristinaRG = KristinaIndexingYear - KristinaInYear;
        System.out.println(  " Денис теперь получает " + KristinaIndexingYear + " рублей. Годовой доход вырос на " + KristinaRG + " рублей");

    }
}