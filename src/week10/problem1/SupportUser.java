package week10.problem1;

public class SupportUser extends Employee {
//    Has an attribute to hold the number of night shifts a support employee has in a month
//    For monthly pay calculation for a support employee the number of night shifts must be taken into account.
//    The daily pay rate for support night shifts is 50% more than standard daily pay rate
    private int nightWorkNumber;

    // 50% higher that norma;
    private double dailySalary;

    public SupportUser() {
    }

    public SupportUser(int nightWorkNumber, double dailySalary) {
        this.nightWorkNumber = nightWorkNumber;
        this.dailySalary = dailySalary;
    }

    public SupportUser(int ID, String name, int annualSalary, int nightWorkNumber) {
        super(ID, name, annualSalary);
        this.nightWorkNumber = nightWorkNumber;
    }

    @Override
    public double MonthlyPay(int annualSalary) {
        // – Minimum annual salary is £ 25,000
        int MinSalary = 25000;

        // check Is the annual Salary less than Min Salary?
        if (annualSalary < MinSalary) {
            return 0;
        }


        double payMonthly;
        // – Annual tax allowance is £10,000 (this amount of income is tax free)
        int AnnualTaxAllowance = 10000;


        if (annualSalary>AnnualTaxAllowance) {
            // –Tax rate is 20 %
            double taxRate = 0.2;
            payMonthly = annualSalary * taxRate;
            // shift 50%
            dailySalary = annualSalary/12/30;
            dailySalary = dailySalary+dailySalary*0.5;

            return (payMonthly/12)+(nightWorkNumber*dailySalary);

        }else{
            return annualSalary/12;
        }
        // Is income greater than AnnualTaxAllowance
    }

    public int getNightWorkNumber() {
        return nightWorkNumber;
    }

    public void setNightWorkNumber(int nightWorkNumber) {
        this.nightWorkNumber = nightWorkNumber;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }
}
