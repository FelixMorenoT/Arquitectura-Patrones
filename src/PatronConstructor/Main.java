/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor;

import PatronConstructor.Builder.MongoQBuilder;
import PatronConstructor.Producto.SqlQ;
import PatronConstructor.Builder.SqlBuilder;
import PatronConstructor.Producto.MongoQ;

/**
 *
 * @author Santiago
 */
public class Main {
    
    public static void main(String[] args) {
        Director direct= new Director();
        
        SqlBuilder sqB= new SqlBuilder();
        SqlQ sql= (SqlQ) direct.build("Albert", "clientes", sqB);
        sql.executer();
        
        System.out.println("------------------");
        
        MongoQBuilder mong= new MongoQBuilder();
        MongoQ mon= (MongoQ) direct.build("Albert","customers",mong);
        mon.executer();
        
        
        
    }
    
}
