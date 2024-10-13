import java.util.ArrayList;

public class Student {
    private int rating;
    private String name;
    private static ArrayList<Student> students = new ArrayList<>();
    // TODO implement Student class according to the instructions provided in the README.md file

    public Student(String name) {
        //TODO initialize name
        this.name = name;
        students.add(this);
    }

    public static double getAllRatings() {
        double allRatings = 0;
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            allRatings += student.getRating();
        }
        return allRatings;
    }

    public static double getAvgRating() {
        // TODO return average rating of all students
        if (students.isEmpty()) {
            return 0;
        }
        return getAllRatings() / students.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO set student's name
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        // TODO initialize rating;
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        // TODO return the result of comparing this.student's rating with the student's rating
        if (this.rating > student.getRating()) {
            return true;
        }
        return false;
    }

    public void changeRating(int rating) {
        // TODO change this student's rating and average rating of all students
        this.rating = rating;
        Student.getAvgRating();
    }

    public static void removeStudent(Student student) {
        // TODO remove student
        students.remove(student);
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return name + " with rating: " + rating;
    }

    public static void main(String[] args) {

        Student student1 = new Student("Ivan");
        Student student2 = new Student("Dmytro");
        Student student3 = new Student("Hanna");

        System.out.println("Average rating of all students: " + Student.getAvgRating());

        student2.changeRating(56);

        System.out.println("New average rating of all students: " + Student.getAvgRating());
    }
}