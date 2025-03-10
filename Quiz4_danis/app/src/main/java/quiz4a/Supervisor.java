public class Supervisor extends StaffMember {
    private String team;
    private double incentive;

    public Supervisor(int id, String fullName, double compensation, String team) {
        super(id, fullName, compensation);
        this.team = team;
        // Calculating the incentive as 20% of the compensation
        this.incentive = compensation * 0.20;
    }

    public double getIncentive() {
        return incentive;
    }
}