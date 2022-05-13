import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SomeTasksTests {

    /* TASK # 1.
    Test Data:
    -345 →  “Odd”
    0 →  “Even”
    222222 →  “Even”
    2147483647 + 1 →  “Undefined”
     */

    private SomeTasks cco;

    @BeforeEach
    public void createClassObject() {
        cco = new SomeTasks();
    }

    @Test
    public void testOddEvenHappyPathOdd() {
        int num = 345;

        Assertions.assertEquals("Odd", cco.oddEven(num));
    }

    @Test
    public void testOddEvenHappyPathEven() {
        int num = 0;

        Assertions.assertEquals("Even", cco.oddEven(num));
    }

    @Test
    public void testOddEvenHappyPathEvenSecond() {
        int num = 222222;

        Assertions.assertEquals("Even", cco.oddEven(num));
    }

    @Test
    public void testOddEvenHappyPathUndefined() {
        long num = 2147483647L + 1;

        Assertions.assertEquals("Undefined", cco.oddEven(num));
    }

    @Test
    public void testOddEvenMaxInteger() {
        int num = 2147483647;

        Assertions.assertEquals("Odd", cco.oddEven(num));
    }

    @Test
    public void testOddEvenMinInteger() {
        int num = -2147483648;

        Assertions.assertEquals("Even", cco.oddEven(num));
    }

    @Test
    public void testOddEvenMaxIntegerMinesOne() {
        int num = 2147483647 - 1;

        Assertions.assertEquals("Even", cco.oddEven(num));
    }

    @Test
    public void testOddEvenMinIntegerPlusOne() {
        int num = -2147483648 + 1;

        Assertions.assertEquals("Odd", cco.oddEven(num));
    }

    /* TASK # 2.
    Test Data:
    Input = {-45, 590, 234, 985, 12, 68}
    Expected Result =  {590, 985, 68}
     */

    @Test
    public void testOddIndicesHappyPass() {
        int[] array = {-45, 590, 234, 985, 12, 68};

        Assertions.assertArrayEquals(new int[]{590, 985, 68}, cco.OddIndices(array));
    }

    @Test
    public void testOddIndicesHappyPassSecond() {
        int[] array = {17, -7, 95, 32, -14, 40};

        Assertions.assertArrayEquals(new int[]{-7, 32, 40}, cco.OddIndices(array));
    }

    @Test
    public void testOddIndicesEmpty() {
        int[] array = {};

        Assertions.assertArrayEquals(new int[]{}, cco.OddIndices(array));
    }

    @Test
    public void testOddIndicesElement() {
        int[] array = {10};

        Assertions.assertArrayEquals(new int[]{}, cco.OddIndices(array));
    }

    @Test
    public void testOddIndicesOneIndex() {
        int[] array = {10, -5, 17};

        Assertions.assertArrayEquals(new int[]{-5}, cco.OddIndices(array));
    }

     /* TASK # 3.
    Test Data:
    {0, 1, 2, 3, 4, 5} → 15
    {-7, -3} → -10
     */

    @Test
    public void testSumArrayHappyPass() {
        int[] array = {0, 1, 2, 3, 4, 5};

        Assertions.assertEquals(15, cco.SumArray(array));
    }

    @Test
    public void testSumArrayHappyPassSecond() {
        int[] array = {-7, -3};

        Assertions.assertEquals(-10, cco.SumArray(array));
    }

    @Test
    public void testSumArrayEmpty() {
        int[] array = {};

        Assertions.assertEquals(0, cco.SumArray(array));
    }

    @Test
    public void testSumArrayOneElement() {
        int[] array = {10};

        Assertions.assertEquals(10, cco.SumArray(array));
    }

    @Test
    public void testSumArrayZero() {
        int[] array = {0};

        Assertions.assertEquals(0, cco.SumArray(array));
    }

    @Test
    public void testSumArrayNegativeAndPositiveNumbersInArray() {
        int[] array = {-1, 1, -2, 2, 10, -10};

        Assertions.assertEquals(0, cco.SumArray(array));
    }

     /* TASK # 4.
	Test Data:
    ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesHappyPass() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 6;

        Assertions.assertArrayEquals(new int[]{3, 7, 5}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesEmptyArray() {

        int[] array = new int[0];
        int index1 = 0;
        int index2 = 0;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesFirstIndexISNegative() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = -2;
        int index2 = 6;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesSecondIndexIsNegative() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = -6;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesFirstIndexIsBiggerThanSecond() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 2;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesFirstIndexBiggerThanArrayLength() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 15;
        int index2 = 16;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesSecondIndexBiggerThanArrayLength() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 16;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesFirstIndexEqualsSecondIndex() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 2;
        int index2 = 2;

        Assertions.assertArrayEquals(new int[]{3, 3, 3}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesOneElementInArray() {

        int[] array = new int[]{0};
        int index1 = 0;
        int index2 = 0;

        Assertions.assertArrayEquals(new int[]{0, 0, 0}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesBoundaryArrayLength() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 7;
        int index2 = 7;

        Assertions.assertArrayEquals(new int[]{8, 8, 8}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesBoundaryBiggerArrayLength() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 8;
        int index2 = 8;

        Assertions.assertArrayEquals(new int[]{}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    @Test
    public void testGetArrayMinMaxAveBetweenTwoIndexesBoundarySmallerArrayLength() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int index1 = 6;
        int index2 = 6;

        Assertions.assertArrayEquals(new int[]{7, 7, 7}, cco.getArrayMinMaxAveBetweenTwoIndexes(array, index1, index2));
    }

    /* TASK # 5.
    Test Data:
    {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
    {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
    {1, 2, 4, 5, 89}, {8, 9, 45} → {}
    //{1, 1, 2, 5, 7, 5, 7}, {8, 6, 5, 5, 1} → {1, 5}
     */

    @Test
    public void testIntersectionHappyPass() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};

        Assertions.assertArrayEquals(new int[]{2, 4}, cco.intersection(array1, array2));
    }

    @Test
    public void testIntersectionHappyPassSecond() {
        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};

        Assertions.assertArrayEquals(new int[]{8, 9}, cco.intersection(array1, array2));
    }

    @Test
    public void testIntersectionHappyPassEmpty() {
        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};

        Assertions.assertArrayEquals(new int[]{}, cco.intersection(array1, array2));
    }

    @Test
    public void testIntersectionHappyPassUniqueNumbers() {
        int[] array1 = {1, 1, 2, 5, 7, 5, 7};
        int[] array2 = {8, 6, 5, 5, 1};

        Assertions.assertArrayEquals(new int[]{1, 5}, cco.intersection(array1, array2));
    }

}
