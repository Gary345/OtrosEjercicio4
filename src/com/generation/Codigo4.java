package com.generation;

import java.util.Scanner;

//import de Scanner

public class Codigo4 {
	//agregar main
	public static void main(String[] args) {
		//agregar argumentos de scanner
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    //agregar parametros a newScanner s2 y la valiable j2 = s2.nextLine();
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s2.nextLine();
	    //quitar parentesis de más
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	          }

	        case "papel":
	          if (j2 == "piedra") {
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
	}
	  
	}
	
		
	
