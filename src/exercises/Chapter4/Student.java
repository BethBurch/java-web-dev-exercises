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
    //** this was given from the textbook EVERYTHING Below is getters and setters

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



    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        // total score is gpa* number of credits
        double totalQualityScore = this.gpa * this.numberOfCredits;

        // The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.
        double newQualityScore = grade * courseCredits;
       //update the students course credits
        this.numberOfCredits += courseCredits;
        //gpa = (total quality score) / (total number of credits)
        this.gpa = totalQualityScore/this.numberOfCredits;
    }

    public String getGradeLevel(int numberOfCredits) {
        if (this.numberOfCredits <= 29){
            return "freshman";
        } else if (this.numberOfCredits <= 59){
            return "sophomore";
        } else if (this.numberOfCredits <= 89) {
            return "junior";
        } else {
            return "senior";
        }

    }

    public String toString() {
        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }
}
//
//