package com.chong.study;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;

import com.chong.study.application.Constans;
import com.chong.study.utils.CipherUtils;
 
 
public class TestCipherUtils {
    @Test
    public void testCipherFile() throws Exception{ 
        String encryptedFile = "C:\\Users\\31238\\OneDrive\\デスクトップ\\encrypted.txt";
        String decryptedFile = "C:\\Users\\31238\\OneDrive\\デスクトップ\\decrypted.txt"; 
        SecretKey secretKey = CipherUtils.generateAESKey();
        try {
            // 加密
            CipherUtils.encrypt(Constans.FILE_PATH, encryptedFile, secretKey);
            
            // 解密
            CipherUtils.decrypt(encryptedFile, decryptedFile, secretKey);
            
            System.out.println("Encryption and decryption completed successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCipherString() throws Exception {
                // 明文
        String plaintext = "Hello, World!";

        // 生成 AES 密钥
        SecretKey secretKey = CipherUtils.generateAESKey();

        // 加密
        String encryptedText = CipherUtils.encryptAES(plaintext, secretKey);
        System.out.println("加密后的密文: " + encryptedText);

        // 解密
        String decryptedText = CipherUtils.decryptAES(encryptedText, secretKey);
        System.out.println("解密后的明文: " + decryptedText);
    }
}
