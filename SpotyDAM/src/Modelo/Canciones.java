/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MEDAC
 */
public class Canciones {
    //Atributos
    private String titulo, album, artista, duración;
    
    //Constructores
    public Canciones(String titulo, String album, String artista, String duración) {
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.duración = duración;
    }
    
    //Métodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    @Override
    public String toString() {
        return "Canciones{" + "titulo=" + titulo + ", album=" + album + ", artista=" + artista + ", duraci\u00f3n=" + duración + '}';
    }
    
    
    
}
