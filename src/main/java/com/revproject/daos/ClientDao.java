package com.revproject.daos;

import com.revproject.models.Client;

public interface ClientDao {
	public Client getClientById(int id);
	
	public Client getAllClients();
}
