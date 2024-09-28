package com.generation;

import java.util.Scanner;
/*Se tiene un programa el cual simula un juego de piedra papel o tijeras por medio de una condicion y un switch  para
 *trabajar los distintos resultados
 * */ 
//import de Scanner

public class Codigo4 {
	//agregar main
	public static void main(String[] args) {
		//agregar argumentos de scanner
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    //cambiar texto Jugador 1 a Jugador 2
	    //println  para que de un salto de linea
	    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //agregar parametros a newScanner s2 y la valiable j2 = s2.nextLine();
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    //quitar parentesis de más
	    
	    //validar para que solo admita esos textos con equals
	    if ((j1.equals("piedra") || j1.equals("tijeras") || j1.equals("papel")) && (j2.equals("piedra") || j2.equals("tijeras")  || j2.equals("papel"))) {
	    	//cambiar todas las compraciones con equals
	    	if (j1.equals(j2)) {
	  	      System.out.println("Empate");
	  	    } else {
	  	      int g = 2;
	  	      switch(j1) {
	  	        case "piedra":
	  	          if (j2.equals("tijeras")) {
	  	            g = 1;
	  	          }

	  	        case "papel":
	  	          if (j2.equals("piedra")) {
	  	            g = 1;
	  	          }//cerrar corchete
	  	        case "tijera":
	  	 
	  	          if (j2.equals("papel")) {
	  	            g = 1;
	  	          }
	  	          break;
	  	        default:
	  	      }
	  	      System.out.println("Gana el jugador " + g);
	  	    }
			
		}else {
			 System.out.println("Por favor ingresa solo piedra papel o tijeras ");
		}
	    
	}
	  
	}
	
		
	
