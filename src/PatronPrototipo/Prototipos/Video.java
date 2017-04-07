/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronPrototipo.Prototipos;

import PatronPrototipo.AbstractPrototype;
import java.util.ArrayList;

/**
 *
 * @author felixmoreno
 */
public class Video extends AbstractPrototype {

    String NombreVideo;
    String DuracionVideo;
    String FormatoVideo;
    ArrayList<Imagen> ColeccionImg = new ArrayList<>();

    @Override
    public AbstractPrototype Clone() {
        Video video = new Video();
        video.setNombreVideo(this.getNombreVideo());
        video.setDuracionVideo(this.getDuracionVideo());
        video.setFormatoVideo(this.getFormatoVideo());
        video.setColeccionImg(this.getColeccionImg());

        return video;
    }

    public String getNombreVideo() {
        return NombreVideo;
    }

    public void setNombreVideo(String NombreVideo) {
        this.NombreVideo = NombreVideo;
    }

    public String getDuracionVideo() {
        return DuracionVideo;
    }

    public void setDuracionVideo(String DuracionVideo) {
        this.DuracionVideo = DuracionVideo;
    }

    public String getFormatoVideo() {
        return FormatoVideo;
    }

    public void setFormatoVideo(String FormatoVideo) {
        this.FormatoVideo = FormatoVideo;
    }

    public ArrayList<Imagen> getColeccionImg() {
        return ColeccionImg;
    }

    public void setColeccionImg(ArrayList<Imagen> ColeccionImg) {
        this.ColeccionImg = ColeccionImg;
    }

}
