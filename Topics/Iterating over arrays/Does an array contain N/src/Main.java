import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int[] ArrayOfInts = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            ArrayOfInts[i] = scanner.nextInt();
        }

        int number = scanner.nextInt();

        boolean isEqual = false;

        for (int i = 0; i < arraySize; i++) {
            if (number == ArrayOfInts[i]) {
                isEqual = true;
            }
        }

        System.out.println(isEqual);

    }
}