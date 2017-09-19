/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s12ejercicio01;

/**
 *
 * @author Godoy
 */
public class S12ejercicio01 {

    /**
     * @param args the command line arguments
     */  
	public static void main(String[] args) {
		// Create constant value: number of kilometers per mile
		final double KILOMETROS_POR_MILLA = 1.609;

		// Display table header
		System.out.println(
			"Millas         Kilometros   |   Kilometros     Millas     ");

		// Create and display tables
		for (int m = 1, k = 20; m <= 20 && k <= 130; m++, k += 5) {
			System.out.printf(
				"%-15d%-10.3f", m, (m * KILOMETROS_POR_MILLA));
			System.out.print("   |   ");
			System.out.printf(
				"%-15d%-6.3f\n", k, (k / KILOMETROS_POR_MILLA));
                        
		}
	}
}