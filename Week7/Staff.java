public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     * 
     * @param name    name.
     * @param address address.
     * @param school  school.
     * @param pay     pay.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * getter school.
     * 
     * @return school.
     */
    public String getSchool() {
        return school;
    }

    /**
     * setter school.
     * @param school school.
     */ 
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * getter pay.
     * 
     * @return pay.
     */
    public double getPay() {
        return pay;
    }

    /**
     * setter pay.
     * 
     * @param pay pay.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * to string.
     * 
     * @return string.
     */
    @Override
    public String toString() {
        return "Staff["
                + super.toString()
                + ",school=" + school
                + ",pay=" + pay
                + ']';
    }
}
