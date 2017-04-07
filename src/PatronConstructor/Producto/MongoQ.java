/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Producto;

/**
 *
 * @author Santiago
 */
public class MongoQ extends Query{
    
    String where;
    String from;
    
    
    @Override
    public void setWhere(String where) {
         this.where=where;
    }

    @Override
    public void setFrom(String from) {
        this.from=from;
    }

    @Override
    public void executer() {
        System.out.println("ejecutando consulta MongoDB");
        String consult=from+".find({"+where+"})";
        System.out.println(consult);
    }
    
}
