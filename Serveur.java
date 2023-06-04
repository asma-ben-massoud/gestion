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
import java.rmi.registry.LocateRegistry; 
public class Serveur { 
public static void main(String[] args) { 
try {
    LocateRegistry.createRegistry(1099);
    ImpTache task = new ImpTache();
    Naming.rebind("rmi://localhost:1099/Tache", task);
    ImpEmployee employee = new ImpEmployee();
    Naming.rebind("rmi://localhost:1099/InterfaceEmployee", employee);
    System.out.println("Employee manager server is running...");
    System.out.println("Server is running...");
} catch (Exception e) {
    System.err.println("Exception: " + e.getMessage());
    e.printStackTrace();
}

    
}}
