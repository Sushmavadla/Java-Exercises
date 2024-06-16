package functions;
import java.util.*;
public class ConsParaEx {
	int birthYear;
	int age;
	 // Constructor to initialize the birth year
	public ConsParaEx(int yearOfBirth) {
        birthYear = yearOfBirth;
        age = calculateAge(yearOfBirth);
    }

    // Method to calculate the age based on the birth year
    private int calculateAge(int yearOfBirth) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - yearOfBirth;
    }

    // Method to check if the person is eligible to vote
    public boolean isEligibleToVote() {
        return age >= 18;
    }

    // Main method to get user input and display the results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get birth year from user
        System.out.print("Enter your birth year: ");
        int userBirthYear = scanner.nextInt();

        // Create an instance of VoterEligibility
        ConsParaEx voter = new ConsParaEx(userBirthYear);

        // Display the age and voting eligibility
        System.out.println("You are " + voter.age + " years old.");
        if (voter.isEligibleToVote()) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
}
}
