import java.util.LinkedHashSet;
import java.util.Set;

public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop
    // Student (max. 100)
    private Student[] students = new Student[100];
    private int count = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     * this function will help add a new student to an array of students.
     *
     * @param newStudent student that is going to be added to array named students.
     */
    public void addStudent(Student newStudent) {
        // TODO:
        if (newStudent != null) {
            students[count] = newStudent;
            count++;
        }
    }

    /**
     * this function give us a list.
     *
     * @return the list of student filtered by group (class).
     */
    public String studentsByGroup() {
        // TODO:
        String list = "";
        Set<String> setOfGroup = new LinkedHashSet<>();
        for (int i = 0; i < count; i++) {
            setOfGroup.add(students[i].getGroup());
        }
        for (String group : setOfGroup) {
            list += group + "\n";
            for (int i = 0; i < count; i++) {
                if (students[i].getGroup().equals(group)) {
                    list += students[i].getInfo() + "\n";
                }
            }
        }
        return list;
    }

    /**
     * this function help us remove the student with id in param.
     *
     * @param id the id of student that is going to be removed.
     */
    public void removeStudent(String id) {
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                if (students[i].getId().equals(id)) {
                    for (int j = i; j < count - 1; j++) {
                        students[j] = students[j + 1];
                    }
                    students[count] = null;
                    count--;
                    break;
                }
            }
            if (students[count - 1].getId().equals(id)) {
                students[count - 1] = null;
                count--;
            }
        }
    }
}