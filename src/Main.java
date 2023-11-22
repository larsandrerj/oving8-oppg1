import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("ØVING 8 OPPGAVE 1");

    ArrayList<Employee> employees = new ArrayList<>();

    menu(1);
    boolean startProgram = true;

    int userInput = new Scanner(System.in).nextInt();

    if (userInput > 1) {
      startProgram = false;
    }

    while (startProgram) {
      menu(2);
      userInput = new Scanner(System.in).nextInt();
      switch (userInput) {
        case (1):
          velgAnsatt(employees);
          break;
        case (2):
          visAnsatte(employees);
          break;
        case (3):
          employees.add(leggTilAnsatt(employees));
          break;
        default:
          startProgram = false;
          break;
      }

      System.out.println("Jeg har hemoroider");
    }


  }
  public static void velgAnsatt(ArrayList<Employee> employees) {
    visAnsatte(employees);
    System.out.println("Velg ansatt basert på nr");
    int employeeNumber = new Scanner(System.in).nextInt();

    while (true) {
      menu(3);
      int userInput = new Scanner(System.in).nextInt();
      switch (userInput) {
        case (1):
          System.out.println("Skattetrekk pr måned: " + employees.get(employeeNumber).getSalary() * employees.get(employeeNumber).getTaxDeduction() + "\n");
          break;
        case (2):
          System.out.println("Bruttolønn pr år: " + employees.get(employeeNumber).getSalary() * 12 + "\n");
          break;
        case (3):
          System.out.println("Skattetrekk pr år: " + employees.get(employeeNumber).getSalary() * employees.get(employeeNumber).getTaxDeduction() * 10.5 + "\n");
          break;
        case (4):
          System.out.println("Navn på ansatt: " + employees.get(employeeNumber).getPersonalia().getFirstname() + " " + employees.get(employeeNumber).getPersonalia().getLastname() + "\n");
          break;
        case (5):
          System.out.println("Alder på ansatt: " + (2023 - employees.get(employeeNumber).getPersonalia().getBirthYear()) + "\n");
          break;
        case (6):
          System.out.println("Antall år som ansatt: " + (2023 - employees.get(employeeNumber).getEmploymentYear()) +
              "\n");
          break;
        case (7):
          System.out.println("Har arbeidstaker vært ansatt lengre enn x antall år?");
          int years = new Scanner(System.in).nextInt();
          if (years < (2023 - employees.get(employeeNumber).getEmploymentYear())) {
            System.out.println("Ja" + "\n");
          } else {
            System.out.println("Nei" + "\n");
          }
          break;
        default:
          break;
      }
      if (userInput >= 8) {
        break;
      }
    }
  }
  public static void visAnsatte(ArrayList<Employee> employees) {
    System.out.println("Ansatte:");
    for (Employee e : employees) {
      System.out.println(e.getEmployeeNumber() + ": " + e.getPersonalia().getLastname() + ", " + e.getPersonalia().getFirstname());
    }
    System.out.println("");
  }
  public static Employee leggTilAnsatt(ArrayList<Employee> employees) {
    System.out.println("Legg til ansatt");
    System.out.println("Fornavn:");
    String firstname = new Scanner(System.in).nextLine();
    System.out.println("Etternavn:");
    String lastname = new Scanner(System.in).nextLine();
    System.out.println("Fødselsår:");
    int birthYear = new Scanner(System.in).nextInt();
    int employeeNumber = employees.size();
    System.out.println("Ansettelsesår:");
    int employmentYear = new Scanner(System.in).nextInt();
    System.out.println("Lønn:");
    int salary = new Scanner(System.in).nextInt();
    System.out.println("Skattetrekk i prosent:");
    double taxDeduction = (double) new Scanner(System.in).nextInt() / 100;

    return new Employee(firstname, lastname, birthYear, employeeNumber, employmentYear, salary, taxDeduction);
  }

  public static void menu(int menuType) {
    switch (menuType) {
      case (1):
        System.out.println("1. Start program");
        System.out.println("2. Avslutt program");
        break;
      case (2):
        System.out.println("1. Velg ansatt");
        System.out.println("2. Vis ansatte");
        System.out.println("3. Legg til ansatt");
        System.out.println("4. Avslutt program");
        break;
      case (3):
        System.out.println("1. Skattetrekk pr måned");
        System.out.println("2. Bruttolønn pr år");
        System.out.println("3. Skattetrekk pr år");
        System.out.println("4. Navn på ansatt");
        System.out.println("5. Alder på ansatt");
        System.out.println("6. Antall år som ansatt");
        System.out.println("7. Har arbeidstaker vært ansatt lengre enn x antall år");
        System.out.println("8. Tilbake til hovedmeny");
        break;
    }
  }
}