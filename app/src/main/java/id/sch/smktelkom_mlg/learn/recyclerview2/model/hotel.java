package id.sch.smktelkom_mlg.learn.recyclerview2.model;

import android.graphics.drawable.Drawable;

/**
 * Created by TrischaNL on 11/6/2016.
 */

public class hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul  = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
