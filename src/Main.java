public class Main {
    //ВЫЗОВ МЕТОДОВ

    public static void main(String[] args) {

        //#Task1
        Main.printThreeWords();

        //#Task2
        Main check = new Main();
        int result = check.checkSumSign(-10, 20);
        if (result == 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }

        //#Task3
        Main checkk = new Main();
        int resultt = checkk.printColour();
        if (resultt <= 0) {
            System.out.println("Красный");
        } else if (resultt > 0 && result <= 100) {
            System.out.println("Желтый");
        } else if (resultt > 100) {
            System.out.println("Зеленый");
        }

        //#Task4
        Main obj = new Main();
        obj.compareNumbers();

        //#Task5
        Main compNumbers = new Main();
        System.out.println(compNumbers.compNumbers(10, 8)); // по условию задачи нужно только вернуть, но не выводить

        //#Task6
        Main checkkk = new Main();
        System.out.println(checkkk.checkSign(0));

        //#Task7
        Main checkq = new Main();
        System.out.println(checkq.checkSignb(0));

        //#Task8
        Main checkww = new Main();
        System.out.println(printN("d", 50));

        //#Task9
        Main main = new Main();
        System.out.println(main.leapYear(145));

        //#Task10
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }

            System.out.print(array[i]);

        }

        //#Task11
        int n = 100;
        int[] arrayq = new int[n];

        for (int i = 0; i < arrayq.length; i++) {
            arrayq[i] = i + 1;

            System.out.print(arrayq[i]);

        }

        //#Task12
        int[] arraye = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arraye.length; i++) {
            if (arraye[i] < 6) {
                arraye[i] = arraye[i] * 2;
            }

            System.out.print(arraye[i]);

        }

        //#Task13
        int nq = 100;
        int i = n;
        int j = nq;
        int[][] arraya = new int[i][j];
        for (i = 0; i < arraya.length; i++) {
            for (j = 0; j < arraya[i].length; j++) {
                if ((i == j) || (j + 1 == nq - i)) {
                    arraya[i][j] = 1;
                }
                System.out.print(arraya[i][j]);
            }
            System.out.println();
        }

        //#Task14
        int[] arrayt = getArray(30, 7);


    }


    //РЕАЛИЗАЦИЯ МЕТОДОВ

    //#Task1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    //#Task2
    public int checkSumSign(int a, int b) {
        if (a + b >= 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //#Task3
    public int printColour() {
        int value;
        value = 200;
        return value;
    }

    //#Task4
    public void compareNumbers() {
        int a = 1000;
        int b = 100;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
            ;
        }

    }

    //#Task5
    public boolean compNumbers(int a, int b) {

        boolean equals;
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    //#Task6
    public String checkSign(int a) {

        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }

    }

    //#Task7
    public boolean checkSignb(int q) {

        if (q >= 0) {
            return false;
        } else {
            return true;
        }
    }


    //#Task8
    public static String printN(String input, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(input);
        }
        return input;
    }

    //#Task9
    public boolean leapYear(int year) {
        int n = 10000;
        boolean[] leapYears = new boolean[n];
        for (int i = 100; i < n; i = i + 4) {
            if (i % 100 == 0 && i % 400 != 0) {
                leapYears[i] = false;
                continue;
            }
            leapYears[i] = true;
        }
        return leapYears[year];
    }

    //#Task10

    //#Task11

    //#Task12

    //#Task13

    //#Task14
    public static int[] getArray(int len, int initialValue) {
        int a = 1;
        int[] array = new int[len];
        for (int i = 0; i < len - 1; i++) {
            array[i] = initialValue;
            System.out.print(array[i]);
        }

        return array;

    }


}