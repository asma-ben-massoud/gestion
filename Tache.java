/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projet_rmi;

import java.io.Serializable;

public class Tache implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String description;
    private String employeeId;

    public Tache(String id, String description, String employeeId) {
        this.id = id;
        this.description = description;
        this.employeeId = employeeId;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String toString() {
        return "Tache [id=" + id + ", description=" + description + ", employeeId=" + employeeId + "]";
    }
}
