import java.util.Scanner;

public class Main {
    public final static int SIZE_ARRAY = 50;
    public static void main(String[] args) {

        int[] arrayOfNumbers = fillArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szukaną wartość");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i <SIZE_ARRAY; i++)
        System.out.println(arrayOfNumbers[i] + ", ");
        int result = searchNumber(searchNumber, arrayOfNumbers);
        if (result == -1) System.out.printf("Liczby %d nie ma w tablicy\n", searchNumber);
        else System.out.printf("Szukana liczba %d jest w tablicy pod indexem %d",
                searchNumber, result);

        System.out.println(result);


    }

    public static int[] fillArray() {
        int[] arrayOfNumber = new int[SIZE_ARRAY];
            for (int i = 0; i < SIZE_ARRAY; i++){
                arrayOfNumber[i] = (int)(Math.random() * 100 + 1);

            }
            return arrayOfNumber;
    }

    public static int searchNumber(int searchNumber, int[] arrayOfNumbers ) {
        int[] arraySentryOfNumber = new int[SIZE_ARRAY + 1];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            arraySentryOfNumber[i] = arrayOfNumbers[i];
        }
        arraySentryOfNumber[SIZE_ARRAY] = searchNumber;

        int index = 0;
        for (int i = 0; i <= SIZE_ARRAY; i++) {
            if (arraySentryOfNumber[i] == searchNumber) {
                index = i;
                break;
            }
        }
        if (index == SIZE_ARRAY) index = -1;
        return index;

    }
}