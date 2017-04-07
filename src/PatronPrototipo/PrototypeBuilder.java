/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronPrototipo;

/**
 *
 * @author felixmoreno
 */
public class PrototypeBuilder {

    public AbstractPrototype AP;

    public void setPrototype(AbstractPrototype AbstractP) {
        this.AP = AbstractP;
    }

    public AbstractPrototype getNewInstance(){
        return this.AP.Clone();
    }
    
}
