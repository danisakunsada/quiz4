public class StaffMember {
    private int id;
    private String fullName;
    private double compensation;

    public StaffMember(int id, String fullName, double compensation) {
        if (compensation <= 0) {
            throw new IllegalArgumentException("Compensation must be positive");
        }
        this.id = id;
        this.fullName = fullName;
        this.compensation = compensation;
    }

    public double getSalary() {
        return compensation;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}

