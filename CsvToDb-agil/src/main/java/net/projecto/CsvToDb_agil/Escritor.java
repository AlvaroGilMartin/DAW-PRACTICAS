package net.projecto.CsvToDb_agil;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class Escritor {
public void insertar(ArrayList<String> alum) {
	try {
		Connection conexion= DriverManager.getConnection("","","");
		Statement s = conexion.createStatement();
		for(int i =0; i<alum.size();i++) {
			String [] a;
			a = alum.get(i).split(",");
			String mod = a[0];
			String numl = a[1];
			String id =  a[2];
			s.executeUpdate("INSERT INTO a (numl,mod,mac,ip,id1) values ("+numl+","+mod+",null,null,"+id+")");
					}
		s.close();
		conexion.close();
	}catch(Exception e) {
		System.err.println("ERROR: " + e.getMessage());
	}
}
}
