/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Franco
 */
public class Cliente {
    
    //atributos de la clase
    private int id;
    private String nombre;
    private String apellido;
    
    //constructor por defecto
    public Cliente(){
        super();
    }
    
    //metodo inicial
    public Cliente(int id, String nombre, String apellido){
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    //metodos de acceso y update
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
        
    }
    
    public String getNombre(){
        return nombre;
    
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    
    public String getApellido(){
        return apellido;
    
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    
@Override
public String toString(){
    return this.getNombre()+""+this.getApellido();

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
}







































