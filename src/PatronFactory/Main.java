/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactory;

import PatronFactory.Fabrica.ProductType;
import PatronFactory.Fabrica.VideoGameFactory;
import PatronFactory.Productos.PlayStation;
import PatronFactory.Productos.Xbox;

/**
 *
 * @author felixmoreno
 */
public class Main {
    public static void main(String[] args) {
        VideoGameFactory VGF = new VideoGameFactory() {};
        
        PlayStation p= (PlayStation) VGF.Create(ProductType.PlayStation);
        Xbox x= (Xbox) VGF.Create(ProductType.Xbox);
        
        p.TurnOn();
        x.TurnOn();
        p.Play();
        
    }
   
}
