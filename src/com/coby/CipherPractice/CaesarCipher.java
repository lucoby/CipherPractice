package com.coby.CipherPractice;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String code = "A z Hello World!";
		int key = 26;
		
		System.out.print(encryptCaesarCipher(code, key) + " ");
		System.out.println(keyDecryptCaesarCipher(
				encryptCaesarCipher(code, key), key));
		for (int i = -25; i <= 25; i += 5) {
			key = i;
			System.out.print(encryptCaesarCipher(code, key) + " ");
			System.out.println(keyDecryptCaesarCipher(
					encryptCaesarCipher(code, key), key));
		}
	}

	public static String encryptCaesarCipher(String str, int key) {
		String ret = "";
		key = (key + 26) % 26;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) ((c - 'a' + key) % 26 + 'a');
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) ((c - 'A' + key) % 26 + 'A');
			}
			ret = ret + c;
		}
		return ret;
	}

	public static String keyDecryptCaesarCipher(String str, int key) {
		String ret = "";
		key = (key + 26) % 26;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) ((c - 'a' - key + 26) % 26 + 'a');
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) ((c - 'A' - key + 26) % 26 + 'A');
			}
			ret = ret + c;
		}

		return ret;
	}
	
	public static String decryptCaearCipher(String str) {
		String ret = "";
		
		return ret;
	}
	

}
