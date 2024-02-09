public class Person extends Week11 implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    Person() {

    }

    /**
     * sth.
     * 
     * @param name name.
     * @param age age.
     * @param address address.
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * compare.
     *
     * @param p the object to be compared.
     * @return compare.
     */
    public int compareTo(Person p) {
        if (this.name != p.name) {
            return this.name.compareTo(p.name);
        } else {
            return Integer.compare(this.age, p.age);
        }
    }
}
