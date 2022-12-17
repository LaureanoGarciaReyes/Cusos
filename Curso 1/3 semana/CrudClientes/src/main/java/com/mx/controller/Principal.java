package com.mx.controller;

import com.mx.dao.ImplementacionDao;
import com.mx.entity.Clientes;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImplementacionDao imp = new ImplementacionDao();
		
		// metodo listar 
		System.out.println("la lista contiene -> "+imp.listar());
      
		
	     // clientes
		Clientes clientes = new Clientes(2,"Francisco","torres","marco",222123447,"lorenzo@gmail.com",0);
		imp.guardar(clientes);
		System.out.println("la lista contiene -> "+imp.listar());
		
		//Buscar
		cliente = new Clientes(2);
		cliente =(Clientes) imp.buscar(clientes);
		System.out.println("Se encontro el cliente : + cliente");
		
		
	}

}
