
public class Person {

    private String name;
    private String surname;
    private int age;
    private double salary;

    public Person(String Name, String Surname, int Age, int Salary) {
        this.name=Name;
        this.surname = Surname;
        this.age = Age;
        this.salary = Salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getAge() {return age;}

    public void setAge(int age) {
        this.age = age;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Person person1 = new Person("Ali", "Irmak", 36, 5000);
        Person person2 = new Person("Veli", "Kaya", 61, 3500);
        person1.applyForLoan(person1, 100000, 6, "Mortgage");
        person1.applyForLoan(person1, 10000, 6, "Mortgage");
        person2.applyForLoan(person2, 50000, 12, "Vehicle");
        person2.applyForLoan(person2, 50000, 24, "Vehicle");
        person1.applyForLoan(person2, 50000, 12, "Personal");
        person1.applyForLoan(person2, 50000, 24, "Personal");
    }

    void printCreditResult(Boolean b, int capital, Person person, double installment, int month, String loanType) {
        if (b) {
            System.out.println("Congratulations " + person.getName() + " " + person.getSurname() + "!");
        } else {
            System.out.println("We are sorry " + person.getName() + " " + person.getSurname() + "!");
        }
        System.out.println("Your " + loanType + " credit application: " + capital + " has been " + (b ? "accepted!" : "rejected because your salary is lower than the installments!"));
        if (b) {
            System.out.println("Your monthly payment will be: " + installment + " x " + month);
            System.out.println("Repayment costs = " + (installment * month));
        } else {
            System.out.println("Your salary: " + person.getSalary() + " < " + installment);
        }
    }



    void applyForLoan(Person p, int capital, int month, String loanType) {

        double interest = 0;
        double installment = 0;
        double repaymentCosts = 0;

        switch (loanType) {
            case "Personal":
                Personal per = new Personal();
                interest = per.calculateInterest(capital, p);
                installment = interest / month;
                repaymentCosts = installment * month;

                break;
            case "Vehicle":
                Vehicle veh = new Vehicle();
                interest = veh.calculateInterest(capital, p);
                installment = interest / month;
                repaymentCosts = installment * month;

                break;
            case "Mortgage":
                Mortgage mor = new Mortgage();
                interest = mor.calculateInterest(capital, p);
                installment = interest / month;
                repaymentCosts = installment * month;


                break;
        }
        if(p.getSalary() < installment) {
            printCreditResult(false, capital, p, installment, month, loanType);
        } else {
            printCreditResult(true, capital, p, installment, month, loanType);
        }

    }

}
