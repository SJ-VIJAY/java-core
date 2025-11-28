package ExceptionHandling.CustomExp;
//Task 1: Age Validation
//Create a program that checks if a person is eligible to vote.
//If age is less than 18, throw a custom exception.
//Requirements:
//Custom Exception: AgeNotEligibleException
//Method: void checkAge(int age)
//If age < 18 → throw exception with message: "You must be 18+ to vote"

import java.util.Scanner;
class AgeNotEligibleException extends Exception{
    public AgeNotEligibleException(String msg){
        super(msg);
    }
}
class Age{

    int voteAge = 18;
    void checkAge(int age) throws AgeNotEligibleException{
        if(age >= voteAge){
            System.out.println("you eligible for voting...");
        }else{
            throw new AgeNotEligibleException("Not eligible for voting");
        }

    }
}
public class Cust1 {
    public static void main(String[] args) throws AgeNotEligibleException {

        Age ag = new Age();
        ag.checkAge(18);

    }

}
