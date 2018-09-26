package br.ufrpe.mpoo.encryption;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
	
	/*
	 * Método recebe como parâmetro uma senha e retorna uma String com a senha criptografada
	 */
	public static String encryptPassword(String inputPassword) throws NoSuchAlgorithmException {
		
		//Criptografa a senha e a coloca num array de bytes
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] messageDigested = md.digest(inputPassword.getBytes(StandardCharsets.UTF_8));
		
		//cria uma String com os hexadecimais do array de bytes criptografado
		StringBuilder hexString = new StringBuilder();
		for (byte b : messageDigested) {
			hexString.append(String.format("%02X", b));
		}
		
		String outputPassword = hexString.toString();
		
		return outputPassword;
	}
	
	
	/*Compara 2 Strings (essas Strings são as senhas já  
	 * criptografadas pelo método encryptPassword).
	 */
	public static boolean validatePassword(String password1, String password2) {
		
		return password1.equals(password2);
		
	}

}
