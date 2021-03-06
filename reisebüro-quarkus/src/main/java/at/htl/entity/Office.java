package at.htl.entity;

import javax.persistence.*;

@Entity
@NamedQueries(
        @NamedQuery(
                name = "findAllOffices",
                query = "select o from Office o"
        )
)
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private int staffCount;
    private String managerName;

    public Office() {
    }

    public Office(int staffCount, String managerName) {
        this.staffCount = staffCount;
        this.managerName = managerName;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
}
