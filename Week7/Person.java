public class Person {
    private String name;
    private String address;

    /**
     * Constructor.
     * 
     * @param name    name.
     * @param address address.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * name getter.
     * 
     * @return name;
     */
    public String getName() {
        return name;
    }

    /**
     * setter name.
     * 
     * @param name name of person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter address.
     * 
     * @return address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * setter address.
     * 
     * @param address address of person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * toString function.
     * 
     * @return string.
     */
    @Override
    public String toString() {
        return "Person["
                + "name=" + name
                + ",address=" + address
                + ']';
    }
}
