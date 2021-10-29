/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Franco
 */
import java.util.ArrayList;
import java.util.List;


public class ClienteDaoImpl implements IClienteDao {
    
    //lista de los clientes
    List<Cliente> clientes;
    
    //iniciar los objetos cliente y añadirlos a la lista
    public ClienteDaoImpl(){
    clientes = new ArrayList<>();
    Cliente cliente1 = new Cliente(0,"juan","franco");
    Cliente cliente2 = new Cliente(1, "luis", "lopez");
    clientes.add(cliente1);
    clientes.add(cliente2);
    
    }
    
    //obtener todos los clientes
    
    public List<Cliente> obtenerClientes(){
        return clientes;
    
    }
    
    //obtener cliente por id
    public Cliente obtenerCliente(int id){
        return clientes.get(id);
    }
    
    //actualizar un cliente
    public void actualizarCliente(Cliente cliente){
        clientes.get(cliente.getId()).setNombre(cliente.getNombre());
        clientes.get(cliente.getId()).setApellido(cliente.getApellido());
        
            System.out.println("cliente id"+cliente.getId()+"actualizado");
    
     
    }
    
    //eliminar un cliente por id
    public void eliminarCliente(Cliente cliente){
    
    clientes.remove(cliente.getId());
    System.out.println("cliente con id"+cliente.getId()+"eliminado");
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
