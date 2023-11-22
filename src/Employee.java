public class Employee {
  private final Person personalia;
  private final int employeeNumber;
  private final int employmentYear;
  private final int salary;
  private final double taxDeduction;

  public Employee(String firstname, String lastname, int birthYear, int employeeNumber, int employmentYear,
                  int salary, double taxDeduction) {
    this.personalia = new Person(firstname, lastname, birthYear);
    this.employeeNumber = employeeNumber;
    this.employmentYear = employmentYear;
    this.salary = salary;
    this.taxDeduction = taxDeduction;
  }
  public Person getPersonalia() {
    return personalia;
  }

  public int getEmployeeNumber() {
    return employeeNumber;
  }

  public int getEmploymentYear() {
    return employmentYear;
  }

  public int getSalary() {
    return salary;
  }

  public double getTaxDeduction() {
    return taxDeduction;
  }
}
