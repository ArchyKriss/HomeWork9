public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSalary += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sumSalary + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxNumber + " рублей");
        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minNumber) {
                minNumber = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minNumber + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double average = (double) total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0 ; i--) {
            System.out.print(reverseFullName[i-1]);

        }
    }
}



