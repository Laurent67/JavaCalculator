package calculator;

import java.io.*;

public class calculator 
{
	public static void main(String[] args) throws IOException 
	{
		
		//variabeln
		byte speicheradresse_zahl1[] = new byte[5];
		byte speicheradresse_operator1[] = new byte[5];
		byte speicheradresse_zahl2[] = new byte[5];

		byte zahl1 = 0;
		byte zahl2 = 0;
		boolean wollenSieAusrechnen = false;
		
		// Input First Number
		System.out.println("geben sie die erste zahl ein");
		System.in.read(speicheradresse_zahl1, 0, 5);
		System.out.write(speicheradresse_zahl1);
		
		// Input Operator
		System.out.println("geben sie den operator ein ein");
		System.in.read(speicheradresse_operator1, 0, 5);
		System.out.write(speicheradresse_operator1);

		// Input Second Number
		System.out.println("geben sie die zweite zahl ein");
		System.in.read(speicheradresse_zahl2, 0, 5);
		System.out.write(speicheradresse_zahl2);

		// for(int i = 0; i < speicheradresse_zahl1.length; i++) {   
		//    System.out.print(speicheradresse_zahl1[i]);
		// }  
		// zahl1 = speicheradresse_zahl1.get(1);
		// System.out.println(zahl1);
		// while(wollenSieAusrechnen=false) {};
		
		
		System.out.println("ENDE");
	};
}

