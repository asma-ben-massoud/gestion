/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package projet_rmi;

/**
 *
 * @author user
 */
import java.rmi.Remote; 
import java.rmi.RemoteException; 
import java.util.List;
public interface InterfaceEmployee extends Remote 
{ 
    public void addEmployee(Employee employee) throws RemoteException;

    public List<Employee> getAllEmployees() throws RemoteException;

    public Employee getEmployeeById(String id) throws RemoteException;
}

