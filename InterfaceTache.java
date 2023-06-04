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
public interface InterfaceTache extends Remote 
{ 
    public void addTask(Tache task) throws RemoteException;

    public List<Tache> getTasksByEmployee(String employeeId) throws RemoteException;

    public List<Tache> getAllTasks() throws RemoteException;
    
}



