/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactory.Fabrica;

import static PatronFactory.Fabrica.ProductType.Xbox;
import PatronFactory.Productos.Consola;
import PatronFactory.Productos.*;
/**
 *
 * @author felixmoreno
 */
public abstract class VideoGameFactory {
    
    public Consola Create(ProductType producto){
        Consola c= null;
        switch(producto){
            case PlayStation: c= new PlayStation(); break; 
            case Xbox :c = new Xbox(); break;
        }
        return c;
    }
    
}
