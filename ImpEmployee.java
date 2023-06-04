/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_rmi;

/**
 *
 * @author user
 */
import java.rmi.*; 
import java.rmi.server.*; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ImpEmployee extends UnicastRemoteObject implements InterfaceEmployee 
{
    Scanner sc = new Scanner(System.in);
    public ImpEmployee() throws RemoteException
    { 
       super(); 
    } 
    private static final long serialVersionUID = 1L;
    private Map<String, Employee> employeesById = new HashMap<>();


    public void addEmployee(Employee employee) throws RemoteException {
        employeesById.put(employee.getId(), employee);
        System.out.println("Employee added: " + employee);
    }


    public List<Employee> getAllEmployees() throws RemoteException {
        List<Employee> allEmployees = new ArrayList<>(employeesById.values());
        return allEmployees;
    }

    public Employee getEmployeeById(String id) throws RemoteException {
        Employee employee = employeesById.get(id);
        return employee;
    }
  


} 

