package week10.problem1;

import java.util.ArrayList;

public class Application {
//        Round the monthly payments
//        two decimal place
    public static void main(String[] args) {
        // generate a employee array list
        ArrayList<Employee> employees = new ArrayList<>();

        // add employ
        // here we can change to ask user to input
        EmployeeInit(employees);

        ShowTable(employees);
    }


    private static void EmployeeInit(ArrayList<Employee> employees){

        int ID[] = {874522,3242563,8567421};
        String employeeName[] = {"Janice Dunbar", "John Smith", "Jamie James"};
        int annualSalary[] = {29000, 27000, 25000};
        String employeeType[] = {"Admin", "Support", "Sales"};

        for (int i=0; i<ID.length; i++) {
            switch (employeeType[i]) {
                case "Admin":
                    AdminUser adminUser = new AdminUser(ID[i], employeeName[i], annualSalary[i],20);
                    adminUser.setPayMonthly(adminUser.MonthlyPay(annualSalary[i]));
                    employees.add(adminUser);
                    break;
                case "Support":
                    SupportUser supportUser = new SupportUser(ID[i], employeeName[i], annualSalary[i], 10);
                    supportUser.setPayMonthly(supportUser.MonthlyPay(annualSalary[i]));
                    employees.add(supportUser);
                    break;
                case "Sales":
                    SalesUser salesUser = new SalesUser(ID[i], employeeName[i], annualSalary[i], 20000,0.04);
                    salesUser.setPayMonthly(salesUser.MonthlyPay(annualSalary[i]));
                    employees.add(salesUser);
                    break;
            }
        }
    }

    private static void ShowTable(ArrayList<Employee> employees) {

        String textFormat = "| %-10d | %-22s | %-22.2f |%n";
        String tableBorder = "+------------+------------------------+------------------------+";

        System.out.println(tableBorder);
        System.out.printf("| EMP ID     | employee name          | This month pay         |%n");
        System.out.println(tableBorder);

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.printf(textFormat,
                        employee.getID(),
                        employee.getName(),
                        employee.getPayMonthly());
                System.out.println(tableBorder);
            }
        }
    }
}
