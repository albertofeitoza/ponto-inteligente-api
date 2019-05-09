//package com.alberto.pontointeligente.api.utils;
//
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//
//public class PasswordUtils {
//	
//	/**
//	​ ​*​ ​Gera​ ​um​ ​hash​ ​utilizando​ ​o​ ​BCrypt.
//	​ ​*
//	​ ​*​ ​@param​ ​senha
//	​ ​*​ ​@return​ ​String
//	​ ​*/
//
////	caso a senha seja Nulo
//	
//	public static String gerarBycript(String senha) {
//		
//		if(senha == null) {
//		 return senha;	
//		}
//		
//		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder ();
//		return bCryptEncoder.encode(senha);
//					
//	} 
//
////    Criptografando a senha 
//	
//	/**
//	​ ​*​ ​Verifica​ ​se​ ​a​ ​senha​ ​é​ ​válida.
//	​ ​*
//	​ ​*​ ​@param​ ​senha
//	​ ​*​ ​@param​ ​senhaEncoded
//	​ ​*​ ​@return​ ​boolean
//	​ ​*/
//
//
//	public static boolean senhaValida(String senha, String senhaEncode) {
//		
//		BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder ();
//		return bCryptEncoder.matches(senha, senhaEncode);
//	}
//		
//}
