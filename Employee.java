
package projet_rmi;

/**
 *
 * @author user
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String prenom;
    private String adresse;
    private String num_compte;
    private String grade;
    private String sup_hierarchique;
    //List<Tache> task = new ArrayList<>();


    public Employee(String id, String name, String prenom, String adresse, String num_compte, String grade, String sup_hierarchique) {
        this.id = id;
        this.name = name;
        this.adresse=adresse;
        this.grade=grade;
        this.prenom=prenom;
        this.num_compte=num_compte;
        this.sup_hierarchique=sup_hierarchique;
    }
   // public List<Tache> getHobbys() {
    //    return task;
    //}
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getAdresse(){
        return adresse;
    }
    public String getGrade(){
        return grade;
    }
    public String getNum_compte(){
        return num_compte;
    }
    public String getSup_hierarchique(){
        return sup_hierarchique;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name +", prenom=" + prenom +", grade=" + grade + ", adresse=" + adresse + ", num_compte=" + num_compte +", sup_hierarchique=" + sup_hierarchique +  "]";
    }
}
    

