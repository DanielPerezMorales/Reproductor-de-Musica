/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author MEDAC
 */
public class ControladorUsuarios {

    //Atributo
    private final ConexionMySQL conexion;

    //Constructor
    public ControladorUsuarios(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    //Métodos
    //Obtengo todos los artículos de la lista
    public ArrayList<Usuario> ObtenerTodosUsuarios() throws SQLException {
        ArrayList<Usuario> lista = new ArrayList<>();
        String consulta = "SELECT * FROM bdusuarios";
        ResultSet rset = conexion.ejercutarSelect(consulta);
        while (rset.next()) {
            String Usuario = rset.getString("Usuario");
            String Contraseña = rset.getString("Contraseña");
            String Respuesta = rset.getString("Respuesta");
            Usuario art = new Usuario(Usuario, Contraseña, Respuesta);
            lista.add(art);
        }
        return lista;
    }
}
