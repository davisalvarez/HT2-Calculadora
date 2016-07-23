package org.uvg.calculadora;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.util.ArrayList;
public class Calculadora {
	
	private ArrayList<String[]> expresiones;
	
	public Calculadora(){
		expresiones = new ArrayList<String[]>();
	}
	
	public void lectorArchivo(){
		File datos;
		FileReader datosLeidos=null;
		BufferedReader br;
		try{
			datos = new File ("./datos.txt");
			datosLeidos = new FileReader (datos);
			br = new BufferedReader(datosLeidos);
			
			//String expresion = br.readLine(); 
			String linea;
			while((linea=br.readLine())!=null){
            		String [] expresionDividida = linea.split(" ");
	            	expresiones.add(expresionDividida);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{                    
            if( null != datosLeidos ){   
            	datosLeidos.close();     
            }                  
         }catch (Exception e){ 
            e.printStackTrace();
         }
	}
	
	public int realizaOperacion(){
		return 0;
	}
}
