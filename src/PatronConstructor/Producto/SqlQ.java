/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Producto;

/**
 *
 * @author Labing
 */
public class SqlQ extends Query{
    
    String where;
    String from;
    String cons="Select *";
    
    @Override
    public void setWhere(String where) {
        this.where="nombre: '"+where+"'";
    }

    @Override
    public void setFrom(String from) {
        this.from=from;
    }

    @Override
    public void executer() {
        System.out.println("Ejecutando consulta en SQL....");
        cons="Select * from "+from+" where "+where;
        System.out.println(cons);
    }
    
}
