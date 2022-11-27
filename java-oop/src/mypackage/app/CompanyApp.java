package mypackage.app;

import mypackage.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Bomasagawusu");

        Company.Employee employee = company.new Employee();
        employee.setName("Rafiq");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
