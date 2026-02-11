// Base Class

public class UniversityMember {

    protected String memberId;
    protected String department;
    public UniversityMember (String memberId, String department) {
        this.memberId = memberId;
        this.department = department;
    }

    public void displayBaseInfo() {
        System.out.println("ID: " + memberId + " | Dept: " + department);
    }
}


