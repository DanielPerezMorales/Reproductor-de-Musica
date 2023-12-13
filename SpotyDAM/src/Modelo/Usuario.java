/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Medac
 */
public class Usuario {
    private String Usuario, Contraseña, Respuesta;

    public Usuario(String Usuario, String Contraseña, String Respuesta) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Respuesta = Respuesta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Respuesta=" + Respuesta + '}';
    }
    
    
}
