package ait.employee_company.dao;


import ait.employee_company.model.Employee;

public interface Company {

    //only abstract methods for Employee and children
    //===============================================

/*
 C - create
 R - read
 U - update
 D - delete
 */
    // нанимать - create
    boolean addEmployee(Employee employee); // boolean - отвечает за то что
    //Employee addEmployee(Employee employee);

    //искать в списке
    Employee findEmployee(int id);

    //обновлять данные
    Employee updateEmployee(Employee employee);

    //уволить (удалить)
    Employee removeEmployee(int id);

    //напечатать
    void printEmployee();

    // кол-во сотрудников
    int quantity();

    // считать зарплату
    double totalSalary();

    //оборот, продажи
    double totalSales();

    //сотрудники с переработкой
    Employee[] findEmployeeGrateHoursThan(double hours);


}
