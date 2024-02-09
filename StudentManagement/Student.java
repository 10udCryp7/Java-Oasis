public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;

    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return this.group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Student() {
        // TODO:
        this.name = "Student";
        this.id = "000";
        this.group = "K62CB";
        this.email = "uet@vnu.edu.vn";
    }

    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    /**
     * this function will return the name, id, group and email of student.
     *
     * @return the string about the info of a student.
     */
    public String getInfo() {
        // TODO:
        return this.getName() + " - " + this.getId() + " - "
                + this.getGroup() + " - " + this.getEmail();
    }
}