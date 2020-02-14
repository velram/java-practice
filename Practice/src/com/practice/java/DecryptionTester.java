///**
// * 
// */
//package com.practice.java;
//
//import java.io.IOException;
//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;
//import java.security.InvalidKeyException;
//import java.security.KeyFactory;
//import java.security.NoSuchAlgorithmException;
//import java.security.PrivateKey;
//import java.security.PublicKey;
//import java.security.spec.InvalidKeySpecException;
//import java.security.spec.PKCS8EncodedKeySpec;
//import java.security.spec.X509EncodedKeySpec;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.crypto.BadPaddingException;
//import javax.crypto.IllegalBlockSizeException;
//import javax.crypto.NoSuchPaddingException;
//
//import org.apache.commons.codec.binary.Base64;
//
//import com.falabella.constant.IntegrationConstants;
//import com.falabella.security.crypto.EncryptorException;
//
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
//
//import javax.crypto.Cipher;
//
///**
// * @author Velmurugan
// *
// */
//public class DecryptionTester {
//	
//	public static final String CHAR_SET = "UTF8";
//	private transient Cipher mDecryptCipher = null;
//	
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//	
//		EncryptorTool encryptorTool = new EncryptorTool();
//		//String inputText = "Velmurugan";
//		//String encryptedText = encryptorTool.cipherInput(inputText);
//		String urlEncodedText = "L20BpDgAbau7PEMwK%2FPYkuHh4m4hRWxPrd%2FgjnxgbbdVViNhu30J3JbRD7JCAewIPekgZyfXRSe%2F%0D%0ANcOOySDPC86yp0%2Fv7dFQ09nKZXLfoXGSWRdNSytq%2BGTTRUJkpZB%2BFeekf%2F%2F5OW4yc2oi2B9t01Gw%0D%0A8nozIsxLHeMs%2F%2B%2FUETX0g9RhvKwkzgIZ%2BrM7WUHWSz5S5uO3lIY%2BV%2BXiixDnt%2FHfXKybEqQGTwdz%0D%0A3jWo511ES%2B%2F1UdQCCULZPs4TrztbRKH4LYoloZZg3229FG5XqCaTDkl8TvOFMOtVxIAOsKg1u7H5%0D%0AMN418rKt2x4dsOPIsj%2Fb0UW25MktA%2BGSqPdi4w%3D%3D";
//		String encryptedText;
//		try {
//			encryptedText = URLDecoder.decode(urlEncodedText, "UTF-8");
//			System.out.println("\n\n Encrypted Text : "+encryptedText);
//			
//			String decryptedText = encryptorTool.deCipherInput(encryptedText);
//			System.out.println("\n\n decrypted Text : "+decryptedText);
//		
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
//	   
//	}
//
//  
//
//}
//
//
//
//class EncryptorTool {
//	
//	  private final String PUBLIC_KEY =
//	  "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAyT8oNBNqOv9BzW7Fpk1F\r\n" +
//	  "IjgL1EMjEnc+5kEUicbcdzMDuenjUuM1wu6MsTmFRFcqORca6S+oBFDX0lK8TSq6\r\n" +
//	  "PCsBl8cieV3gS+HMu4L1Xxc/cU/g/s0TPXS4uGRC8vMYygoQjm2NM5h91jY75CFq\r\n" +
//	  "ltVCItKkM0R8dLYZWXtFU5Sdzad/MVhcSWYrur0GWQQSzvaUtKA0U5B0vW+moYd+\r\n" +
//	  "o6oBN0s3TUfdAS3GT0y0PiiVHu85Tq5P4Uhd7gW++yIuAmFrsZlFDY3CrKU6kBdT\r\n" +
//	  "cRTq1wRFeFyzySyK41ra3E9UZsQGSAsooi0BlIHWdVFS/uUpZD8mZtiJ/hDOeIMp\r\n" +
//	  "7QIDAQAB";
//	 
//	//private final String PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA9BC6ltLyrDRS5nDyBRkvjr1Sjr1TEZxAzv1u3dGYMveisf8ReLn7O6aPex1AOMbWw67jmOsev/YJ1qA1wlG0lFChKUyv3LtpfEUCp6VLrcMgMQTDqeU6UbYFDk479bSN8cWWLknoBjMPxVvF+FFZmCGe5emEQ0l3PZnOYL3SYFvXYRRksuNjgefoeHPk0aa+Gd470PmS7UAa0NeNECri/B2zE1xolRylhwOnQOS9CpgRiJ1fTxjSbF5KdFJF4C2RwQq/xy2QMKrj1fHgz8Sxbd39pCCJd2QFyLs/emLgFBGwofuMZIbF24/JeIKhrzjuN4wqTGOZMgx5sliBc5/0qwIDAQAB";
//
//	private final String PRIVATE_KEY = "MIIEowIBAAKCAQEAyT8oNBNqOv9BzW7Fpk1FIjgL1EMjEnc+5kEUicbcdzMDuenj\r\n" + 
//			"UuM1wu6MsTmFRFcqORca6S+oBFDX0lK8TSq6PCsBl8cieV3gS+HMu4L1Xxc/cU/g\r\n" + 
//			"/s0TPXS4uGRC8vMYygoQjm2NM5h91jY75CFqltVCItKkM0R8dLYZWXtFU5Sdzad/\r\n" + 
//			"MVhcSWYrur0GWQQSzvaUtKA0U5B0vW+moYd+o6oBN0s3TUfdAS3GT0y0PiiVHu85\r\n" + 
//			"Tq5P4Uhd7gW++yIuAmFrsZlFDY3CrKU6kBdTcRTq1wRFeFyzySyK41ra3E9UZsQG\r\n" + 
//			"SAsooi0BlIHWdVFS/uUpZD8mZtiJ/hDOeIMp7QIDAQABAoIBABq7EdsA7S5S82mX\r\n" + 
//			"GhfB0bn+2cti84ijYC5zXIgEawpGM2uBXpmG5oAy8Wsk6cevEEOvBvsMQnP4TQJ5\r\n" + 
//			"zNsvHreZOsfvQmv+hSlvH6OUfIUZ8GpbotYVZUXXeCW944qjsZo8hgB1GrlMuwI2\r\n" + 
//			"B/SAX8kTIIrBkd/ha+qQuYNCNW4pZa82FAXSFnIr+89G4c3i1ZXca1e6sGC1G3v+\r\n" + 
//			"pf2kYa0CHiMw/ZBxbT6hdJFBZwLEO7uKxhgUMonJeNTY/UYJqsKVz5FEVafZ1FHW\r\n" + 
//			"KrBjHK0erYWQU1d319TqvwEiCh3Yy86wD+4/BxKCEE27QYVSTjO7KIsKtiq4ziV6\r\n" + 
//			"OnDDJn0CgYEA/nlgWNk6I0lxXKKWEsJkVDWWUX8EM9YFaXM073sOQV9nRMibGG07\r\n" + 
//			"IDrt75Dj96KOG818c8Lh79Kuw0PlkNTMtJoTWdNDswQbCuHjqEucRc3GJCGKeiW6\r\n" + 
//			"sYZvZdykhCCFdDObjUkQjenO2D/mZv3M83LqKEtgtwjykwVbvirZtOsCgYEAynQT\r\n" + 
//			"S8Ew456hnPmMDh8ec47RepS+nMjI8W/eQYIZY1bLRmDGJ5jDm6ElEkZdb6Qf6hsd\r\n" + 
//			"u7pfZiUgZN4B4tWFeYSFLTdMKXwRV31Ht4qCBW0Y/7H7C/914y7fBoD9tKNLQOFg\r\n" + 
//			"kM7HoVnJVMXQILk/+7vRPH8GsGBAdU03SVOVxocCgYA1vkqj2RTXOP6REuFhCt8H\r\n" + 
//			"jd22Tn4DuJKiB6vJXBLRqaV0uG1RBlizYN65dr8+oH0k0AwVorX24Wb5ZFCKevbU\r\n" + 
//			"uamWkfC9UQOpE7Xx6C4T6/aJ0O+fBnLcZUkHmUbBhODKfs++Ug0F+7gsoao2XCm5\r\n" + 
//			"zK45XloJrgEVHc+XZRNfiwKBgCcYo2FNvZM3Xx5hUpqnh8npGqsBbo34eFWntNQR\r\n" + 
//			"u7VjXX4J0jpzVdMIG5Cb5g9ZMpCTC/rk0ud24/qWpOaZNV1yKgXBWAPq4a5zkxXu\r\n" + 
//			"uY0ytFEsnb6DZtCojIlE/7mSj0XIQE22oPaX0Dl+ueKX47NJYe682R3WeJwufS67\r\n" + 
//			"5YChAoGBAIemUymK07raWOy/BzUWwLPD2k+Ogodiz3GO8A8xYkMTYGgALcVlhTNH\r\n" + 
//			"WrqC2df+fP87Uj/8hUNStUzG0tTCAUoa4fP5wULMyU+akdGBacdJOBREnN/N3YNl\r\n" + 
//			"D8fjQ8qsFpiYh6HG3iS5mccxzo0rmPeqBSGokotmiblq6Yi6z5xd";
//	public static final String CIPHER_RSA = "RSA";
//	public static final String CIPHER_RSA_ECB_PKCS1 = "RSA/ECB/PKCS1Padding";
//	
//	 public String cipherInput(String pPropertyValue) {
//	        System.out.println("CMRGateway.cipherInput(): START : Input pPropertyValue :" + pPropertyValue);
//	        String cipherOutput = null;
//	        try {
//	            PublicKey publicKey = KeyFactory.getInstance(CIPHER_RSA)
//	                    .generatePublic(new X509EncodedKeySpec(new BASE64Decoder().decodeBuffer(PUBLIC_KEY)));
//	            //final javax.crypto.Cipher encryptCipher = javax.crypto.Cipher.getInstance(CIPHER_RSA);
//	            System.out.println("Public key : "+publicKey);
//	            final javax.crypto.Cipher encryptCipher = javax.crypto.Cipher.getInstance(CIPHER_RSA_ECB_PKCS1);
//	            encryptCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, publicKey);
//	            cipherOutput = new BASE64Encoder().encode(encryptCipher.doFinal(pPropertyValue.getBytes("UTF-8")));
//	        } catch (Exception e) {
//	        	System.out.println("CMRGateway.cipherInput() : Unable to encrypt the propertyValue. Exception occured." + e.getMessage());
//	        }
//	        System.out.println("CMRGateway.cipherInput(): END : cipherOutput: {0}" + cipherOutput);
//	        return cipherOutput;
//	    }
//	 
//	    public String deCipherInput(String encryptedText) {
//	    	System.out.println("\n\nCMRGateway.deCipherInput(): START : Input pPropertyValue :{0}"+ encryptedText);
//	        String cipherOutput = null;
//	        String decryptedText = null;
//	        try {
//	        	java.security.Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
//	        	KeyFactory factory = KeyFactory.getInstance(CIPHER_RSA);
//	        	PrivateKey priv = factory.generatePrivate(new PKCS8EncodedKeySpec(new BASE64Decoder().decodeBuffer(PRIVATE_KEY)));
//	        	Cipher cipher = Cipher.getInstance(CIPHER_RSA_ECB_PKCS1);
//	        	cipher.init(Cipher.DECRYPT_MODE, priv);
//	            decryptedText = new String(cipher.doFinal(new sun.misc.BASE64Decoder().decodeBuffer(encryptedText)));
//	        } catch (BadPaddingException e) {
//	        	System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//		        e.printStackTrace();	
//	        } catch (NoSuchAlgorithmException e) {
//	        	System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//				e.printStackTrace();
//			} catch (InvalidKeySpecException e) {
//				System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//				e.printStackTrace();
//			} catch (IOException e) {
//				System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//				e.printStackTrace();
//			} catch (NoSuchPaddingException e) {
//				System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//				e.printStackTrace();
//			} catch (InvalidKeyException e) {
//				System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//				e.printStackTrace();
//			} catch (IllegalBlockSizeException e) {
//				System.out.println("CMRGateway.deCipherInput() : Unable to decrypt the propertyValue. Exception occured " + e.getMessage() + "Exception obj : "+ e);
//				e.printStackTrace();
//			}
//	        System.out.println("Decrypted text is : "+decryptedText);
//	        System.out.println("CMRGateway.deCipherInput(): END : cipherOutput token id is : {0}" + cipherOutput);
//	        return decryptedText;
//	    }
//}	 
