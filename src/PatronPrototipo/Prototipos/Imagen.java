/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronPrototipo.Prototipos;

import PatronPrototipo.AbstractPrototype;

/**
 *
 * @author felixmoreno
 */
public class Imagen extends AbstractPrototype {

    String NombreImg;
    String TamanoImg;
    String FormatoImg;

    public Imagen(){}
    @Override
    public AbstractPrototype Clone() {
        Imagen Img = new Imagen();
        Img.setNombreImg(this.getNombreImg());
        Img.setTamanoImg(this.getTamanoImg());
        Img.setFormatoImg(this.getFormatoImg());

        return Img;
    }

    public String getNombreImg() {
        return NombreImg;
    }

    public void setNombreImg(String NombreImg) {
        this.NombreImg = NombreImg;
    }

    public String getTamanoImg() {
        return TamanoImg;
    }

    public void setTamanoImg(String TamanoImg) {
        this.TamanoImg = TamanoImg;
    }

    public String getFormatoImg() {
        return FormatoImg;
    }

    public void setFormatoImg(String FormatoImg) {
        this.FormatoImg = FormatoImg;
    }

}
