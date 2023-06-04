/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_rmi;

/**
 *
 * @author user
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImpTache extends UnicastRemoteObject implements InterfaceTache {

    private static final long serialVersionUID = 1L;
    public static Map<String, List<Tache>> tasksByEmployee = new HashMap<>();

    public ImpTache() throws RemoteException {
        super();
    }

    @Override
    public void addTask(Tache task) throws RemoteException {
        List<Tache> tasks = tasksByEmployee.get(task.getEmployeeId());
        if (tasks == null) {
            tasks = new ArrayList<>();
            tasksByEmployee.put(task.getEmployeeId(), tasks);
        }
        tasks.add(task);
        System.out.println("Task added: " + task);
    }

   
    public List<Tache> getTasksByEmployee(String employeeId) throws RemoteException {
        List<Tache> tasks = tasksByEmployee.get(employeeId);
        if (tasks == null) {
            tasks = new ArrayList<>();
        }
        return tasks;
    }

    @Override
    public List<Tache> getAllTasks() throws RemoteException {
        List<Tache> allTasks = new ArrayList<>();
        for (List<Tache> tasks : tasksByEmployee.values()) {
            allTasks.addAll(tasks);
        }
        return allTasks;
    }

}
