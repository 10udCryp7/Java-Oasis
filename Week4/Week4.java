public class Week4 {
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    public static int minArray(int[] array) {
        int min;
        min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static String calculateBMI(double weight, double height) {
        double BMI = Math.round(weight / (height * height) * 10) / 10.0;
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI <= 22.9) {
            return "Bình thường";
        } else if (BMI <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
