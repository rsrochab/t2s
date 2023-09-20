package br.com.t2bContainer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import br.com.t2bContainer.bean.Container;

public class containerDAO {
	
	public static Connection getConnecion() throws ClassNotFoundException, SQLException {
		Connection con = null;
			
			Class.forName("com.mysql.jdbc.Drive");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crudcontainer", "root", "");
			
		return con;
	}

	public static List<Container> getAllContainers(){
		
		List<Container> list = new ArrayList<Container>();
		
		try {
		Connection con = getConnecion();
		PreparedStatement ps = (PreparedStatement) con.prepareStatement("select * from container");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			Container container = new Container();
			container.setId(rs.getInt("id"));
			container.setCliente(rs.getString("cliente"));
			container.setNroContainer(rs.getString("nroContainer"));
			container.setTipo(rs.getInt("tipo"));
			container.setStatus(rs.getString("status"));
			container.setCategoria(rs.getString("categoria"));
			list.add(container);
			} 
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
