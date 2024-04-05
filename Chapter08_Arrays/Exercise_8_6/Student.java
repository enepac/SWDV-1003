public class Student {
    private int stuID;
    private CollegeCourse[] course; // Adjusted field name

    public int getStuID() {
        return stuID;
    }

    public void setStuID(int stuID) {
        this.stuID = stuID;
    }

    public CollegeCourse getCourse(int index) {
        return course[index]; // Adjusted field name
    }

    public void setCourse(CollegeCourse course, int index) {
        this.course[index] = course; // Adjusted field name
    }

    public Student() {
        course = new CollegeCourse[5]; // Adjusted field name
    }
}
