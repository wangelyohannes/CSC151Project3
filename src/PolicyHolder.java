public class PolicyHolder {
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    public PolicyHolder(String policyholderFirstName, String policyholderLastName, int policyholderAge,
                        String policyholderSmokingStatus, double policyholderHeight, double policyholderWeight) {
        this.policyholderFirstName = policyholderFirstName;
        this.policyholderLastName = policyholderLastName;
        this.policyholderAge = policyholderAge;
        this.policyholderSmokingStatus = policyholderSmokingStatus;
        this.policyholderHeight = policyholderHeight;
        this.policyholderWeight = policyholderWeight;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    @Override
    public String toString() {
        return "Policyholder's First Name: " + policyholderFirstName +
                "\nPolicyholder's Last Name: " + policyholderLastName +
                "\nPolicyholder's Age: " + policyholderAge +
                "\nPolicyholder's Smoking Status (Y/N): " + policyholderSmokingStatus +
                "\nPolicyholder's Height: " + policyholderHeight + " inches" +
                "\nPolicyholder's Weight: " + policyholderWeight + " pounds";
    }
}
