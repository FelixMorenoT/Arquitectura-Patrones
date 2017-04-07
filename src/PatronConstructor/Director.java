/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor;

import PatronConstructor.Builder.QBuilder;
import PatronConstructor.Producto.Query;

/**
 *
 * @author Labing
 */
public class Director {
    

    public Query build(String where, String from,QBuilder builder){
       builder.setFrom(from);
       builder.setWhere(where);
      
       builder.build();
       return builder.getQuery();
    }
    
}
