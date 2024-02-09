public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * Constructor.
     * 
     * @param name    name of student.
     * @param address address of student.
     * @param program program of student.
     * @param year    school year of student.
     * @param fee     fee of student.
     */
    public Student(String name, String address,
            String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /*
     * Getter program.
     * 
     */
    public String getProgram() {
        return program;
    }

    /**
     * Setter program.
     * 
     * @param program the program.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Getter year.
     * 
     * @return school year.
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter year.
     * 
     * @param year school year.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter of fee.
     * 
     * @return fee.
     */
    public double getFee() {
        return fee;
    }

    /**
     * setter of fee.
     * 
     * @param fee fee.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * toString.
     * 
     * @return string.
     */
    @Override
    public String toString() {
        return "Student["
                + super.toString()
                + ",program=" + program
                + ",year=" + year
                + ",fee=" + fee
                + ']';
    }
}
