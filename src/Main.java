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
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000 ) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + " Итого " + total);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int  i = 0 ;
        while (i < 10) {
            i=i+1;
            System.out.print( i + " ");
        }
        System.out.println();
        for ( i =10; i>0; i= i-1){
            System.out.print( i + " " );
        }

    }
    public static void task3 () {
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int bornPerThousand = 17;
        int deathPerThousand = 8;
        int populationInYear = 0;
        int growth;
        for (int i = 0; i <= 10; i++) {
            population = population + populationInYear;
            growth = bornPerThousand-deathPerThousand;
            populationInYear = growth * population/1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        int percent=7;
        for (; total < 12_000_000; i++) {
            total = total + total/100*percent;
            total = total + contribution;

                System.out.println("Месяц " + i + " Итого " + total);

        }
        System.out.println(total);
    }
    public static void task5 (){
        System.out.println("Задача 5");
        int contribution = 15000;
        int total = 0;
        int percent=7;
        int i=0;
        for (; total < 12_000_000; i++ ) {
            total = total + total/100*percent;
            total = total + contribution;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }

        }
        System.out.println(total);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int contribution = 15000;
        int total = 0;
        int percent = 7;
        int i = 0;
        for (; i <= 108; i++) {
            total = total + total / 100 * percent;
            total = total + contribution;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }

        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int day=2;
        int i=0;
        for (; i<= 31; i++){
            day = day +7;
            i=i+7;
            System.out.println("Сегодня пятница, " + i + "е число. Необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int i=1817;
        int b = 79;
        for (; i<=2117;){
            i=i+b;
            System.out.println(i);
        }
    }

}