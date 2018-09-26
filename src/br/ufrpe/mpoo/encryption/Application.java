package br.ufrpe.mpoo.encryption;

import java.security.NoSuchAlgorithmException;

public class Application {
	
	public static void main (String[] args) throws NoSuchAlgorithmException{
		
		String senha1 = "Andre@1862";
		String senha2 = "85851220";
		
		String senhaSaida1 = Encryption.encryptPassword(senha1);
		String senhaSaida2 = Encryption.encryptPassword(senha2);
		
		System.out.println(senhaSaida1);
		System.out.println(senhaSaida2);
		
	}
	
}