public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private double policyholderHeight;
    private double policyholderWeight;
    private static int policyCount = 0;

    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder,
                  double policyholderHeight, double policyholderWeight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
        policyCount++;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    public static int getPolicyCount() {
        return policyCount;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber +
                "\nProvider Name: " + providerName +
                "\n" + policyHolder.toString() +
                "\nPolicyholder's BMI: " + calculateBMI() +
                "\nPolicy Price: $" + calculatePolicyPrice();
    }

    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    public double calculatePolicyPrice() {
        double baseFee = 600.0;
        double additionalFee = 0.0;

        if (policyHolder.getPolicyholderAge() > 50) {
            additionalFee += 75.0;
        }

        if (policyHolder.getPolicyholderSmokingStatus().equalsIgnoreCase("smoker")) {
            additionalFee += 100.0;
        }

        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        return baseFee + additionalFee;
    }
}
