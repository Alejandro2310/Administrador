package com.administrador.administrador.aseguradora.repository.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.stereotype.Repository;

import com.administrador.administrador.aseguradora.repository.InsuranceCarrierRepository;
import com.google.gson.Gson;

@Repository
public class InsuranceCarrierRepositoryImpl implements InsuranceCarrierRepository {
	
	public InsuranceCarrierRepositoryImpl() {
		
		Gson gson = new Gson();
		
		String fichero = "";
		 
		try (BufferedReader br = new BufferedReader(new FileReader("datos.json"))) {
		    String linea;
		    while ((linea = br.readLine()) != null) {
		        fichero += linea;
		    }
		 
		} catch (FileNotFoundException ex) {
		    System.out.println(ex.getMessage());
		} catch (IOException ex) {
		    System.out.println(ex.getMessage());
		}

		Properties properties = gson.fromJson(fichero, Properties.class);
	}

}
