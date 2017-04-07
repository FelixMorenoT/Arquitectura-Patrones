/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronConstructor.Builder;

import PatronConstructor.Producto.Query;

/**
 *
 * @author Yo
 */
public interface QBuilder {
    public void build();
    public void setWhere(String where);
    public void setFrom(String from);
    public Query getQuery();
}
