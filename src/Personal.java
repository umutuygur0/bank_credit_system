public class Personal {
    private double Rate = 0.3995;

    double calculateInterest(int capital, Person person){
         double result=(capital + creditRiskFee(person.getAge(),capital)*(1+Rate));
         return result;
    }


    double creditRiskFee(int age, double capital){
        if(age>55){
            double result=(age - 55) * 0.02 * capital * (Rate / 12);
            return result;
        }
        else{
            double result=0;
            return result;
        }
    }


    void printCreditResult(Boolean b, int capital, Person person, double installment, int month,
                           String loanType){} // Prints all results

    void applyForLoan(Person p, int capital, int month, String loanType) {


    }// Decision module for the loan applications




}
