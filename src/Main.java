import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] first = new int[]{1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        double[] third = new double[]{1.29, 25.89, 0.9865, 1.11, 235.9, 98.99};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] first = new int[]{1, 2, 3};
        double[] second ={1.57, 7.654, 9.986};
        double[] third = new double[]{1.29, 25.89, 0.9865, 1.11, 235.9, 98.99};
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i]);
            if (i < first.length - 1) {
                System.out.print(", ");
            } else break;
        }
        System.out.println();

        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i]);
            if (i < second.length - 1) {
                System.out.print(", ");
            } else break;
        }

        System.out.println();

        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i]);
            if (i < third.length - 1) {
                System.out.print(", ");
            } else break;
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] first = new int[]{1, 2, 3};
        double[] second = {1.57, 7.654, 9.986};
        double[] third = new double[]{1.29, 25.89, 0.9865, 1.11, 235.9, 98.99};
        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i]);
            if (i > 0) {
                System.out.print(", ");
            } else break;
        }
        System.out.println();

        for (int i = second.length - 1; i >= 0; i--) {
            System.out.print(second[i]);
            if (i > 0) {
                System.out.print(", ");
            } else break;
        }
        System.out.println();

        for (int i = third.length - 1; i >= 0; i--) {
            System.out.print(third[i]);
            if (i > 0) {
                System.out.print(", ");
            } else break;
        }
        System.out.println();


    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] first = new int[]{1, 2, 3};
        for(int i = 0; i < first.length; i++){
            if(first[i] % 2 != 0){
                first[i]++;
            }
        }
        System.out.println(Arrays.toString(first));
    }
}