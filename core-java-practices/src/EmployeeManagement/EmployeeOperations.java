package EmployeeManagement;
interface EmployeeOperations{
    public void addEmployee();
    default void msg(){
        System.out.print("hi from interface");
    }


}
