/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Canciones;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author MEDAC
 */
public class ControladorCanciones {

    //Atributo
    private final ConexionMySQL conexion;

    //Constructor
    public ControladorCanciones(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    //Métodos
    //Obtengo todos los artículos de la lista
    public ArrayList<Canciones> ObtenerTodosCanciones() throws SQLException {
        ArrayList<Canciones> lista = new ArrayList<>();
        String consulta = "SELECT * FROM canciones";
        ResultSet rset = conexion.ejercutarSelect(consulta);
        while (rset.next()) {
            String Titulo = rset.getString("Titulo");
            String Album = rset.getString("Album");
            String Artista = rset.getString("Artista");
            String Duracion = rset.getString("Duracion");
            Canciones art = new Canciones(Titulo, Album, Artista,Duracion);
            lista.add(art);
        }
        return lista;
    }
}
