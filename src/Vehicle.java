public class Vehicle {
    private double Rate = 0.4495;
    double calculateInterest(int capital, Person person){
        double result=(capital + creditRiskFee(person.getAge(),capital)*(1+Rate));
        return result;
    }

    double creditRiskFee(int age, double capital){
        if(age>34&&age<61){
            double result=0;
            return result;
        }
        else{
            double result=0.11 * capital * (Rate / 12);
            return result;
        }
    }


    void printCreditResult(Boolean b, int capital, Person person, double installment, int month,
                           String loanType) {}// Prints all results


    void applyForLoan(Person p, int capital, int month, String loanType){} // Decision module for the loan applications
}


