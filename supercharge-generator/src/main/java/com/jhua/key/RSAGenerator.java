package com.jhua.key;

import org.apache.commons.codec.binary.Base64;
//import org.apache.commons.io.FileUtils;
//import com.kid.util.RSA;
import java.io.File;
import java.util.Map;

public class RSAGenerator {

//    public void exportKeys() throws Exception {
//        Map<String, Object> keyMap = RSA.genKeyPair();
//        //公钥
//        String publicKey = RSA.getPublicKey(keyMap);
//        //私钥
//        String privateKey = RSA.getPrivateKey(keyMap);
//        System.out.println("公钥：/n" + publicKey);
//        System.out.println("私钥：/n" + privateKey);
//    }
//
//    public void testDecryptEncrypt() throws Exception {
//        // 公钥 可以放指定位置
//        String publicKeyStr = FileUtils.readFileToString(new File("/data3/pem/publickey.pem"),"UTF-8");
//        String privateKeyStr = FileUtils.readFileToString(new File("/data3/pem/privatekey.pem"),"UTF-8");
//        String sign = "abcccccc";
//        byte[] encryptSign = RSA.encryptByPublicKey(sign.getBytes(),publicKeyStr);
//        String base64Sign = Base64.encodeBase64String(encryptSign);
//        System.out.println("加密后的sign: "+base64Sign);
//        //私钥解密
//        byte[] decryptStr = RSA.decryptByPrivateKey(Base64.decodeBase64(base64Sign),privateKeyStr);
//        System.out.println("解密后的sign: "+new String(decryptStr));
//    }
}
