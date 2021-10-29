/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eduardo Franco
 */


import java.util.List;
public interface IClienteDao {
    
//metodos para acceder
public List<Cliente>    obtenerClientes();
public Cliente obtenerCliente(int id);
public void actualizarCliente(Cliente cliente);
public void eliminarCliente(Cliente cliente);

}









































