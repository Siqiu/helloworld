package week10.problem1;

public class Employee {
    protected static final double TAX_ALLOWANCE = 10600;
    private String name;
    private int ID;
    private int annualSalary;
    private double payMonthly;

    public Employee(){}

    public Employee(int ID, String name, int annualSalary) {
        this.name = name;
        this.ID = ID;
        this.annualSalary = annualSalary;
    }

    //– For simplicity, we are omitting any other salary deductions like NI contribution
    //–Round the monthly payments
    //–Use two decimal places when displaying monetary values
    public double MonthlyPay (int annualSalary) {

        // – Minimum annual salary is £ 25,000
        int MinSalary = 25000;

        // check Is the annual Salary less than Min Salary?
        if (annualSalary < MinSalary) {
            return 0;
        }


        double payMonthly;
        // – Annual tax allowance is £10,000 (this amount of income is tax free)
        double AnnualTaxAllowance = TAX_ALLOWANCE;


        if (annualSalary>AnnualTaxAllowance) {
            // –Tax rate is 20 %
            double taxRate = 0.2;
            // monthly pay = (the salary u already pay tax) + (the salary u do not need to pay tax)
            // ((year) - (tax allowance) / 12) * (the salary I should have )
            double monthlyBasePay = (annualSalary + - TAX_ALLOWANCE) / 12;
            payMonthly = monthlyBasePay * (1-taxRate) + TAX_ALLOWANCE / 12;

            return payMonthly;

        }else{
            return annualSalary/12;
        }
        // Is income greater than AnnualTaxAllowance
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(int annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getPayMonthly() {
        return payMonthly;
    }

    public void setPayMonthly(double payMonthly) {
        this.payMonthly = payMonthly;
    }
}
