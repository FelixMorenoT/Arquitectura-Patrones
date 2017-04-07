/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Builder;

import PatronConstructor.Producto.Query;
import PatronConstructor.Producto.SqlQ;

/**
 *
 * @author Labing
 */
public class SqlBuilder implements QBuilder{

    public String from;
    public String where;
    public SqlQ q= new SqlQ();
    
    
    @Override
    public void build() {
        q.setFrom(this.from);
        q.setWhere(this.where);
    }

    @Override
    public void setWhere(String where) {
        this.where=where;
    }

    @Override
    public void setFrom(String from) {
        this.from=from;
    }

    @Override
    public Query getQuery() {
        return q;
    }
    
}
