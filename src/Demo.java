import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueCreatingPolicy = true;
        Policy[] policies = new Policy[100]; // Create an array to store policies

        int policyCount = 0; // Track the number of policies created

        while (true) { // Keep looping until explicitly told to stop
            try {
                System.out.print("Please enter the Policy Number: ");
                String policyNumber = scanner.nextLine();

                System.out.print("Please enter the Provider Name: ");
                String providerName = scanner.nextLine();

                System.out.print("Please enter the Policyholder’s First Name: ");
                String policyholderFirstName = scanner.nextLine();

                System.out.print("Please enter the Policyholder’s Last Name: ");
                String policyholderLastName = scanner.nextLine();

                System.out.print("Please enter the Policyholder’s Age: ");
                int policyholderAge = Integer.parseInt(scanner.nextLine());

                System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
                String policyholderSmokingStatus = scanner.nextLine();

                System.out.print("Please enter the Policyholder’s Height (in inches): ");
                double policyholderHeight = Double.parseDouble(scanner.nextLine());

                System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
                double policyholderWeight = Double.parseDouble(scanner.nextLine());

                PolicyHolder policyHolder = new PolicyHolder(policyholderFirstName, policyholderLastName,
                        policyholderAge, policyholderSmokingStatus, policyholderHeight, policyholderWeight);

                Policy policy = new Policy(policyNumber, providerName, policyHolder, policyholderHeight, policyholderWeight);

                policies[policyCount] = policy; // Store the policy in the array
                policyCount++;

                System.out.println(policy.toString());

                System.out.print("Do you want to create another policy? (yes/no): ");
                String userResponse = scanner.nextLine();
                if (!userResponse.equalsIgnoreCase("yes")) {
                    break; // Exit the loop if the user doesn't want to create another policy
                }
            } catch (Exception e) {
                System.out.println("Input error. Please enter valid data.");
            }
        }

        scanner.close();

        System.out.println("\nThere were " + policyCount + " Policy objects created.");

        int smokerCount = 0;
        int nonSmokerCount = 0;

        for (int i = 0; i < policyCount; i++) {
            if (policies[i].getPolicyHolder().getPolicyholderSmokingStatus().equalsIgnoreCase("smoker")) {
                smokerCount++;
            } else {
                nonSmokerCount++;
            }
        }

        System.out.println("The number of Policyholders that are smokers: " + smokerCount);
        System.out.println("The number of Policyholders that are non-smokers: " + nonSmokerCount);
    }
}
