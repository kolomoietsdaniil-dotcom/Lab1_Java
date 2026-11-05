import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Task 1");
            System.out.println("Task 2 ");
            System.out.println("Task 3");
            System.out.println("Task 4");
            System.out.println("Exit");
            System.out.print("Choice action: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Input number");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    task1(scanner);
                    break;
                case 2:
                    task2(scanner);
                    break;
                case 3:
                    task3(scanner);
                    break;
                case 4:
                    task4(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    // --- ЗАВДАННЯ 1 ---
    public static void task1(Scanner scanner) {
        System.out.println("Input x1 and y1 which type is double:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        double first_half_double_values = (2 * Math.pow(x1, 2) + x1 * y1) / (Math.pow(x1 * y1, 2));
        double second_half_double_values = (3 * x1 * y1 - Math.pow(y1,3)) / (Math.pow(x1, 2) + 2 * Math.pow(y1, 2));
        double result_double_values = first_half_double_values + second_half_double_values;
        System.out.println("Result for double values and double result: " + result_double_values);

        System.out.println("Input x2 and y2 which type is int:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double first_half_int_values = (2 * Math.pow(x2, 2) + x2 * y2) / Math.pow(x2 * y2, 2);
        double second_half_int_values = (3 * x2 * y2 - Math.pow(y2, 3)) / (Math.pow(x2, 2) + 2 * Math.pow(y2, 2));
        double result_double_int_values = first_half_int_values + second_half_int_values;
        System.out.println("Result for int values and double result:" + result_double_int_values);

        System.out.println("Input x3 and y3 which type is double:");
        double x3 = scanner.nextInt();
        double y3 = scanner.nextInt();

        int first_half_int = (int) ((2 * Math.pow(x3, 2) + x3 * y3) / Math.pow(x3 * y3, 2));
        int second_half_int = (int) ((3 * x3 * y3 - Math.pow(y3, 3)) / (Math.pow(x3, 2) + 2 * Math.pow(y3, 2)));
        int result_int = first_half_int + second_half_int;
        System.out.println("Result for double values and int result:" + result_int);
    }

    // --- ЗАВДАННЯ 2 ---
    public static void task2(Scanner scanner) {
        System.out.println("Input size of array (n <= 200");
        int n = scanner.nextInt();
        while (n <= 0 || n > 200) {
            System.out.println("Input wrong n");
            System.out.println("Input size of array (n <= 200");
            n = scanner.nextInt();

        }

        double array[] = new double[n];

        System.out.println("Input values of array: ");
        for (int i = 0; i <= n; i++) {
            array[i] = scanner.nextDouble();
        }
        System.out.println("Input shift (k)");
        int k = scanner.nextInt();

        double extra_array[] = new double[n];
        for (int j = 0; j <= n - 1; j++) {
            extra_array[(j + k) % n] = array[j];
        }

        for (int l = 0; l < n; l++) {
            System.out.print(extra_array[l]);
        }
    }

    // --- ЗАВДАННЯ 3 ---
    public static void task3(Scanner scanner) {
        System.out.println("Input size of array (n <= 15");
        int n = scanner.nextInt();
        while (n <= 0 || n > 15) {
            System.out.println("Input size of array (n <= 15");
            n = scanner.nextInt();
        }

        double matrix[][] = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        if (n == 1) {
            System.out.println("Under the diagonal there are no elements to compare with.");
            return;
        }

        double max_below = matrix[1][0];
        System.out.println("Input matrix elements:");
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (max_below < matrix[i][j]) {
                    max_below = matrix[i][j];
                }

            }
        }

        double sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (matrix[i][j] > max_below) {
                    sum += matrix[i][j];
                    count++;
                }
            }
        }

        if (count == 0) System.out.println("Zero elements");
        else System.out.println("Sum of elements:" + sum);

    }

    // --- ЗАВДАННЯ 4 ---
    public static void task4(Scanner scanner) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = in.nextLine();
        String[] words = text.split("[\\s,.:;-?!]+");
        System.out.println(":");
        for (int i=0; i<words.length; i++){
            String word = words[i];
            if (!word.isEmpty() && word.length() % 2 == 0) {
                System.out.print(word + " ");
            }
        }
        in.close();
    }

    }
