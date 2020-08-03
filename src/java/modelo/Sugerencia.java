/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yesenia
 */
public class Sugerencia {

    private int idsugerencia;
    private String nombre_cliente;
    private String dni;
    private String telefono;
    private String descripcion;

   
       public Sugerencia(){
        
    }
    
    public Sugerencia(int idsugerencia,String nombre_cliente, String dni, String telefono, String descripcion){
       this.idsugerencia=idsugerencia;
        this.nombre_cliente = nombre_cliente;
        this.dni = dni;
        this.telefono = telefono;
        this.descripcion = descripcion;
    
    }
    public int getIdsugerencia() {
        return idsugerencia;
    }

    /**
     * @param idsugerencia the idsugerencia to set
     */
    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    /**
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
       
}
