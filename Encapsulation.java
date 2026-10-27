// package _09_OOP._Encapsulation.Student;

/** Encapsulates a student's academic information. */
public class Encapsulation {
  String name;
  String course;
  String yearLevel;
  float prelimGrade;
  float midtermGrade;

  public void setName(String name) {
    this.name = name;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  public void setYearLevel(String yearLevel) {
    this.yearLevel = yearLevel;
  }

  public void setPrelimGrade(float prelimGrade) {
    this.prelimGrade = prelimGrade;
  }

  public void setMidtermGrade(float midtermGrade) {
    this.midtermGrade = midtermGrade;
  }

  public void setFinalGrade(float finalGrade) {
    this.finalGrade = finalGrade;
  }

  public String getName() {
    return name;
  }

  public String getCourse() {
    return course;
  }

  public String getYearLevel() {
    return yearLevel;
  }

  public float getPrelimGrade() {
    return prelimGrade;
  }

  public float getMidtermGrade() {
    return midtermGrade;
  }

  public float getFinalGrade() {
    return finalGrade;
  }

  float finalGrade;

}

// public class Main {
// public static void main(String[] args) {
// Student student1 = new Student();
// student1.name = "John Doe"
// }