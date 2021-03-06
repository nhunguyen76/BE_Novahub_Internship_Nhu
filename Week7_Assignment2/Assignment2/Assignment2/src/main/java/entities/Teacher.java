package entities;

public class Teacher {
  private int teacherId;
  private String name;
  private int birthYear;
  private String country;
  private String faculty;
  private String degree;
  private int classHours;
  private int allowance;
  private float coefficientSalary;
  
  public int getTeacherId() {
    return teacherId;
  }
  public void setTeacherId(int teacherId) {
    this.teacherId = teacherId;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getBirthYear() {
    return birthYear;
  }
  public void setBirthYear(int birthYear) {
    this.birthYear = birthYear;
  }
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
  public String getFaculty() {
    return faculty;
  }
  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }
  public String getDegree() {
    return degree;
  }
  public void setDegree(String degree) {
    this.degree = degree;
  }
  public int getClassHours() {
    return classHours;
  }
  public void setClassHours(int classHours) {
    this.classHours = classHours;
  }
  public int getAllowance() {
    return allowance;
  }
  public void setAllowance(int allowance) {
    this.allowance = allowance;
  }
  public float getCoefficientSalary() {
    return coefficientSalary;
  }
  public void setCoefficientSalary(float coefficientSalary) {
    this.coefficientSalary = coefficientSalary;
  }
  
  
}
