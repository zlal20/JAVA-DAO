/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Franco
 */
public class DaoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //objeto para manipular el dao
        IClienteDao clienteDao = new ClienteDaoImpl();
        
        //imprimir los clientes
        clienteDao.obtenerClientes().forEach(System.out::println);
        
        //obtener un cliente
        Cliente cliente = clienteDao.obtenerCliente(0);
        cliente.setApellido("morales");
        
        //actualizar un cliente
        clienteDao.actualizarCliente(cliente);
        
        //imprimir cliente
        System.out.println("**");
        clienteDao.obtenerClientes().forEach(System.out::println);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    }
    
}
