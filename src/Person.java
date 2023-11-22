public class Person {
  private final String firstname;
  private final String lastname;
  private final int birthYear;
  public Person(String firstname, String lastname, int birthYear) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthYear = birthYear;
  }
  public String getFirstname() {
    return firstname;
  }
  public String getLastname() {
    return lastname;
  }
  public int getBirthYear() {
    return birthYear;
  }
}
