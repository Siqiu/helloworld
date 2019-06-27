package week10.problem1;

public class AdminUser extends Employee {
//    Uses default and standard monthly pay calculation
//    Has holidays attribute that store number holidays an admin employee can have
    private int holidays;


    public AdminUser() {
    }

    public AdminUser(int holidays) {
        this.holidays = holidays;
    }

    public AdminUser(int ID, String name, int annualSalary,int holidays) {
        super(ID, name, annualSalary);
        this.holidays = holidays;
    }

    public int getHolidays() {
        return holidays;
    }

    public void setHolidays(int holidays) {
        this.holidays = holidays;
    }
}
