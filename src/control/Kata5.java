package control;

import model.DataBase;
import model.People;
import view.BDview;

public class Kata5 {

    public static void main(String[] args) {
        String URL = "jdbc:sqlite:D:\\universidad\\Ingenieria del software 2\\kata5\\kata5\\DBsqlitle\\kata5.db";
        DataBase database = new DataBase(URL);
        BDview bdview = new BDview();
        bdview.setVisible(true);
        database.open();
        
        
        database.select_PERSONAS();
        
        People people = new People("Ferb  ", "Flint", "brother");
        database.insert_PERSONAS(people);
        
        database.delete_PERSONAS(people);
        
        database.select_PERSONAS();
        
        database.close();
    }
    
}
