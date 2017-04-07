/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Builder;

import PatronConstructor.Producto.MongoQ;
import PatronConstructor.Producto.Query;

/**
 *
 * @author Santiago
 */
public class MongoQBuilder implements QBuilder{

    public String from;
    public String where;
    public MongoQ q= new MongoQ();
    
    @Override
    public void build() {
        q.setFrom(from);
        q.setWhere(where);
    }

    @Override
    public void setWhere(String where) {
        this.where="name: '"+where+"'";
    }

    @Override
    public void setFrom(String from) {
        this.from="db."+from;
    }

    @Override
    public Query getQuery() {
        return q;
    }
    
}
