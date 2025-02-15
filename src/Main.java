public class Main {
    static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDateException extends Exception {
        public MyArrayDateException(String message) {
            super(message);
        }
    }

    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDateException {
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Строка " + i + " имеет не верную длинну");
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDateException("Неверные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] array = {
                {"13", "25", "37", "4"},
                {"5", "61", "77", "8"},
                {"91", "14", "41", "22"},
                {"2", "7", "1", "61"}
        };
        try {
            int result = processArray(array);
            System.out.println("Сумма всех элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (MyArrayDateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


    }
}