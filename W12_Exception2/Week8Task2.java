import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public void nullPointerEx() throws NullPointerException {
        int[] arr = null;
        System.out.println(arr[6]);
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        String[] s = new String[100];
        s[102] = "hehe";
    }

    public void arithmeticEx() throws ArithmeticException {
        int x = 2 / 0;
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
    }

    public void ioEx() throws IOException {
        FileReader fileRead = new FileReader("hello");
    }

    /**
     * test null pointer.
     * 
     * @return null pointer.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * index out of bound.
     * 
     * @return index out of bound.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * arithmetic.
     * 
     * @return arithmetic.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * arithmetic.
     * 
     * @return arithmetic.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * io.
     * 
     * @return io.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}