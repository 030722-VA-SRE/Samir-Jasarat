package com.revproject.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revproject.models.Client;
import com.revproject.util.ConnectionUtil;

public class ClientPostgres implements ClientDao{

	@Override
	public Client getClientById(int id) {
		String sql = "select * from clients where id = ?;";
		Client client = null;
		//retrieving a Connection to the db from the Connectionutil class
		try(Connection c =  ConnectionUtil.getConnection()) {
			// creating a prepared statement using that connection
			PreparedStatement ps = c.prepareStatement(sql);
			//parameterizing the SQL statement with the id that we are looking for
			ps.setInt(1, id);
			//Executes the query from the ps, and assigns the db's query results to the result set 
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				client = new Client();
				client.setId(rs.getInt("id"));
				client.setName(rs.getString("name"));
				client.setNumber(rs.getString("number"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if a client of that is found, returns that client. Otherwise returns null
		return client;
	}

	@Override
	public Client getAllClients() {
		String sql = "select * from clients;";
		Client client = null;
		try(Connection c =  ConnectionUtil.getConnection()) {
			// creating a prepared statement using that connection
			Statement s = c.createStatement();
			//parameterizing the SQL statement with the id that we are looking for
			
			//Executes the query from the ps, and assigns the db's query results to the result set 
			ResultSet rs = s.executeQuery(sql);
			
			if(rs.next()) {
			    client = new Client();
				client.setId(rs.getInt("id"));
				client.setName(rs.getString("name"));
				client.setNumber(rs.getString("number"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return client;
	}

}
