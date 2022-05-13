import java.util.Arrays;

public class SomeTasks {

    /* TASK # 1.
    Создать алгоритм OddEven, который принимает на вход целое число,
    возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
    Во всех остальных случаях результат будет “Undefined”.
     */

    public String oddEven(long num) {

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {

            return "Undefined";
        }
        if (num % 2 == 0) {

            return "Even";
        } else {

            return "Odd";
        }
    }

    /* TASK # 2.
     Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
     */

    public int[] OddIndices(int[] array) {

        int[] newArray = new int[array.length / 2];

        int index = 0;
        for (int i = 1; i < array.length; i += 2) {
            newArray[index] = array[i];
            index++;
        }

        return newArray;
    }

    /* TASK # 3.
    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    Test Data:
    {0, 1, 2, 3, 4, 5} → 15
    {-7, -3} → -10
     */

    public int SumArray(int[] array) {

        int sum = 0;

        for (int j : array) {
            sum += j;
        }

        return sum;
    }

     /* TASK # 8.
    Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
    и среднее среди всех значений между 2-мя индексами.
	Test Data:
    ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] getArrayMinMaxAveBetweenTwoIndexes(int[] array, int index1, int index2) {

        if (Arrays.equals(array, new int[0]) || index1 > index2 || index1 < 0 || index1 >= array.length
                || index2 >= array.length) {

            return new int[0];
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;

        for (int i = index1; i <= index2; i++) {

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }

            sum += array[i];
            count++;
        }

        return new int[]{min, max, sum / count};
    }

    /* TASK # 9.
    9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел
    и возвращает массив общих элементов. //(unique numbers) (loop for)
    Test Data:
    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    {1, 2, 4, 5, 89}, {8, 9, 45} → {}
    //{1, 1, 2, 5, 7, 5, 7}, {8, 6, 5, 5, 1} → {1, 5}
     */

    public int[] intersection(int[] array1, int[] array2) {

        for (int i = array1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int tmp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = tmp;
                }
            }
        }

        int countArrayIndex1 = 1;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] != array1[i + 1]) {
                countArrayIndex1++;
            }
        }

        int[] arrayTmp = new int[countArrayIndex1];
        int index1 = 0;
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] != array1[i + 1]) {
                arrayTmp[index1] = array1[i];
                index1++;
            }
            if (index1 == countArrayIndex1 - 1) {
                arrayTmp[index1] = array1[i + 1];
            }
        }

        int countArraysIndex2 = 0;
        for (int k : arrayTmp) {
            for (int i : array2) {
                if (k == i) {
                    countArraysIndex2++;
                    break;
                }
            }
        }

        int index2 = 0;
        int[] arrayResult = new int[countArraysIndex2];
        for (int k : arrayTmp) {
            for (int i : array2) {
                if (k == i) {
                    arrayResult[index2] = k;
                    index2++;
                    break;
                }
            }
        }

        return arrayResult;
    }

}
