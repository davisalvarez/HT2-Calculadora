package org.uvg.calculadora;

import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
public class Calculadora {
	
	public void lectorArchivo(){
		File datos;
		FileReader datosLeidos=null;
		BufferedReader br;
		try{
			datos = new File ("datos.txt");
			datosLeidos = new FileReader (datos);
			br = new BufferedReader(datosLeidos);
			
			String expresion = br.readLine(); 
			
			System.out.println("El archivo:");
			System.out.println(expresion);
		}catch(Exception e){
			//e.printStackTrace();
		}
		
		try{                    
            if( null != datosLeidos ){   
            	datosLeidos.close();     
            }                  
         }catch (Exception e){ 
           // e.printStackTrace();
         }
	}
	
	public int realizaOperacion(){
		return 0;
	}
}
