/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sausanbr
 */
public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Sausan");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try{
            m.getPersonDAO().savePerson(person);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}

    }
    
}
