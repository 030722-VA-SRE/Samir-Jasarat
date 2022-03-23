package com.revproject.services;

import com.revproject.daos.ClientDao;
import com.revproject.daos.ClientPostgres;
import com.revproject.exceptions.ClientNotFoundException;
import com.revproject.models.Client;

public class ClientService {

	private ClientDao iDao;
	
	public ClientService() {
		iDao = new ClientPostgres();
	} 
	
	public Client getById(int id) throws ClientNotFoundException {
		Client client = iDao.getClientById(id);
		
		if(client == null) {
			throw new ClientNotFoundException();
		}
		return client;
	}

	public Client getAllClients() {
		Client clients = iDao.getAllClients();
		return clients;
	}
}
