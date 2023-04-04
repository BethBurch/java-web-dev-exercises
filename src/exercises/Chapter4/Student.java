package exercises.Chapter4;

public class Student {
    public static void main(String[] args) {
        Student me = new Student("Elizabeth", 42, 1, 4.0); //instance of class with my parameters
    }
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
//fields are given from the instance methods part of the ebook
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }
    //** this was given from the the textbook EVERYTHING Below is getters and setters

    public String getName() {
        return this.name; }
    //getters are to access class variables name, student id, numberofcredits, and gpa
    public void setName(String name) {
        this.name = name; }
    //setters are to modify those class variables

    public int getStudentId() {
        return this.studentId; }
    private void setStudentId(int studentId) {
        this.studentId = studentId; }

    public int getNumberOfCredits() {
        return this.numberOfCredits; }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits; }

    public double getGpa() {
        return this.gpa; }
    public void setGpa(double gpa) {
        this.gpa = gpa; }

}

