import java.lang.reflect.Array;

public class Week4Test {

    @Test
    public void testMax2Int1() {
        TestCase.assertEquals(Week4.max2Int(1, 2), 2);
    }

    @Test
    public void testMax2Int2() {
        TestCase.assertEquals(Week4.max2Int(2, 2), 2);
    }

    @Test
    public void testMax2Int3() {
        TestCase.assertEquals(Week4.max2Int(3, 1), 3);
    }

    @Test
    public void testMax2Int4() {
        TestCase.assertEquals(Week4.max2Int(4, 5), 5);
    }

    @Test
    public void testMax2Int5() {
        TestCase.assertEquals(Week4.max2Int(1, 0), 1);
    }

    @Test
    public void testMinArray1() {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.print(Week4.minArray(arr));
        TestCase.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray2() {
        int[] arr = { 1, 2, 3, 4, 5 };
        TestCase.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray3() {
        int[] arr = { 8, 2, 4, 2, 1 };
        TestCase.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray4() {
        int[] arr = { 7, 5, 3, 2, 9 };
        TestCase.assertEquals(Week4.minArray(arr), 2);
    }

    @Test
    public void testMinArray5() {
        int[] arr = { 101, 50, 209, 78, 220 };
        TestCase.assertEquals(Week4.minArray(arr), 50);
    }

    @Test
    public void testCalculateBMI1() {
        TestCase.assertEquals(Week4.calculateBMI(160, 1.7), "Béo phì");
    }

    @Test
    public void testCalculateBMI2() {
        TestCase.assertEquals(Week4.calculateBMI(60, 1.68), "Bình thường");
    }

    @Test
    public void testCalculateBMI3() {
        TestCase.assertEquals(Week4.calculateBMI(80, 1.9), "Bình thường");
    }

    @Test
    public void testCalculateBMI4() {
        TestCase.assertEquals(Week4.calculateBMI(35, 1.65), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI5() {
        TestCase.assertEquals(Week4.calculateBMI(70, 1.7), "Thừa cân");
    }
}