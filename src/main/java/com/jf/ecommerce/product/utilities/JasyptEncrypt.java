package com.jf.ecommerce.product.utilities;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * Enviroment Variable: -Djasypt.encryptor.password=seed or JASYPT_ENCRYPTOR_PASSWORD=seed
 * Properties: db.password=ENC(nVYwZ7lO8nY1xRzYwqPuzw==)
 */

public class JasyptEncrypt {

  public static void main(String[] args) {
    var seed = "";
    var password = "";
    // Create
    BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
    textEncryptor.setPassword(seed);
    // Encrypt
    var encryptedPassword = textEncryptor.encrypt(password);
    System.out.println("Encrypted Password: " + encryptedPassword);
    // Decrypt
//    String decryptedPassowrd = textEncryptor.decrypt(encryptedPassword);
//    System.out.println("Decrypt Password: " + decryptedPassowrd);

  }


}
