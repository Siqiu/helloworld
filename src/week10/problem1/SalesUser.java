package week10.problem1;

public class SalesUser extends Employee {
//    Has two attributes of worth of sale in month and the commission rate (e.g. 0.04)
//    For monthly pay calculation for a sales employee,
//    their commission of the worth of sale they made in a month must be added to their base monthly salary.
    private double worthSaleMonthly;
    private double commissionRate;


    public SalesUser() {
    }

    public SalesUser(double worthSaleMonthly, double commissionRate) {
        this.worthSaleMonthly = worthSaleMonthly;
        this.commissionRate = commissionRate;
    }

    public SalesUser(int ID, String name, int annualSalary, double worthSaleMonthly, double commissionRate) {
        super(ID, name, annualSalary);
        this.worthSaleMonthly = worthSaleMonthly;
        this.commissionRate = commissionRate;
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
        double AnnualTaxAllowance = TAX_ALLOWANCE;


        if (annualSalary>AnnualTaxAllowance) {
            // –Tax rate is 20 %
            double taxRate = 0.2;
            // monthly pay = (the salary u already pay tax) + (the salary u do not need to pay tax)
            // ((year) - (tax allowance) / 12) * (the salary I should have )
            double monthlyBasePay = (annualSalary + - TAX_ALLOWANCE) / 12;
            payMonthly = (monthlyBasePay + (commissionRate*worthSaleMonthly))  * (1-taxRate) + TAX_ALLOWANCE / 12;

            return payMonthly;

        }else{
            return annualSalary/12;
        }
        // Is income greater than AnnualTaxAllowance
    }

    public double getWorthSaleMonthly() {
        return worthSaleMonthly;
    }

    public void setWorthSaleMonthly(double worthSaleMonthly) {
        this.worthSaleMonthly = worthSaleMonthly;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
}
