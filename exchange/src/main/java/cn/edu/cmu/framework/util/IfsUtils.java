package cn.edu.cmu.framework.util;

import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/**
 *
 * @author qiubo
 * @version 1.0
 * @since 1.0
 */
public class IfsUtils {
	public static final String byte2hex(byte[] bytes) {
		StringBuffer buf = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			if (((int) bytes[i] & 0xff) < 0x10) {
				buf.append("0");
			}
			buf.append(Long.toString((int) bytes[i] & 0xff, 16));
		}
		return buf.toString();
	}

	public static void main(String[] args) throws NoSuchAlgorithmException{

		// 加密时: U4UwyX30n0E=
		// 解密后: 123456
		// U4UwyX30n0E=
//		String pwd = "bjfunic";
//		MessageDigest md5 = MessageDigest.getInstance("MD5");
//		// 密钥KEY
//		String pkey = "NHLc9yDk";
//		String str1 = pwd+"201305200141"+pkey;
//		String encodePwd = byte2hex(md5.digest(str1.getBytes()));
//		System.out.println("AAAAA===="+encodePwd);

		String strencode;
		String sendUser = "";
		String receiveUser = "20171009";
		String title = "国际交流管理信息系统通知";
		String description = "请查收国际交流系统通知";
		String content = "请登录国际交流系统查看复核情况";
		String str = "module=remind&function=sendWxMessage&sendUser="+sendUser+"&receiveUser="+receiveUser+"&title="+title+"&description="+description+"&content="+content+"&unit=信息管理处";
		String key = "lbhunpuwgwaoanmbtsszqgrv";

		String postUrl = "http://i.cmu.edu.cn/dcp/ifs?sysid=1000044&param=";
		try {
			strencode = desEncode(str,key);
			System.out.println("加密时: " + strencode);

            postUrl += strencode;

            System.out.println("postUrl:\r\n"+postUrl);

            //String strdecode = desDecode(strencode,key);
            //System.out.println("解密后: " + strdecode);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}

	//3DES加密工具类

	// 向量
	private final static String iv = "01234567";
	// 加解密统一使用的编码方式
	private final static String encoding = "utf-8";

	/**
	 * 3DES加密
	 *
	 * @param plainText 普通文本
	 * @return
	 * @throws Exception
	 */
	public static String desEncode(String plainText,String pk) throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(pk.getBytes());
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
		deskey = keyfactory.generateSecret(spec);

		Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
		IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, deskey, ips);
		byte[] encryptData = cipher.doFinal(plainText.getBytes(encoding));
		return Bytes2HexString(encryptData);
	}

	/**
	 * 3DES解密
	 *
	 * @param encryptText 加密文本
	 * @return
	 * @throws Exception
	 */
	public static String desDecode(String encryptText, String pk) throws Exception {
		Key deskey = null;
		DESedeKeySpec spec = new DESedeKeySpec(pk.getBytes());
		SecretKeyFactory keyfactory = SecretKeyFactory.getInstance("desede");
		deskey = keyfactory.generateSecret(spec);
		Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
		IvParameterSpec ips = new IvParameterSpec(iv.getBytes());
		cipher.init(Cipher.DECRYPT_MODE, deskey, ips);
//		BASE64Decoder mi = new BASE64Decoder();
		System.out.println(encryptText);
		byte[] decryptData = cipher.doFinal(hexStringToBytes(encryptText));

		return new String(decryptData, encoding);
	}

//	private static final char[] legalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789=/"  
//			.toCharArray();  
//
//	public static String encode(byte[] data) {  
//		int start = 0;  
//		int len = data.length;  
//		StringBuffer buf = new StringBuffer(data.length * 3 / 2);  
//
//		int end = len - 3;  
//		int i = start;  
//		int n = 0;  
//
//		while (i <= end) {  
//			int d = ((((int) data[i]) & 0x0ff) << 16)  
//					| ((((int) data[i + 1]) & 0x0ff) << 8)  
//					| (((int) data[i + 2]) & 0x0ff);  
//
//			buf.append(legalChars[(d >> 18) & 63]);  
//			buf.append(legalChars[(d >> 12) & 63]);  
//			buf.append(legalChars[(d >> 6) & 63]);  
//			buf.append(legalChars[d & 63]);  
//
//			i += 3;  
//
//			if (n++ >= 14) {  
//				n = 0;  
//				buf.append(" ");  
//			}  
//		}  
//
//		if (i == start + len - 2) {  
//			int d = ((((int) data[i]) & 0x0ff) << 16)  
//					| ((((int) data[i + 1]) & 255) << 8);  
//
//			buf.append(legalChars[(d >> 18) & 63]);  
//			buf.append(legalChars[(d >> 12) & 63]);  
//			buf.append(legalChars[(d >> 6) & 63]);  
//			buf.append("=");  
//		} else if (i == start + len - 1) {  
//			int d = (((int) data[i]) & 0x0ff) << 16;  
//
//			buf.append(legalChars[(d >> 18) & 63]);  
//			buf.append(legalChars[(d >> 12) & 63]);  
//			buf.append("==");  
//		}  
//
//		return buf.toString();  
//	}  
//
//	private static int decode(char c) {  
//		if (c >= 'A' && c <= 'Z')  
//			return ((int) c) - 65;  
//		else if (c >= 'a' && c <= 'z')  
//			return ((int) c) - 97 + 26;  
//		else if (c >= '0' && c <= '9')  
//			return ((int) c) - 48 + 26 + 26;  
//		else  
//			switch (c) {  
//			case '+':  
//				return 62;  
//			case '/':  
//				return 63;  
//			case '=':  
//				return 0;  
//			default:  
//				throw new RuntimeException("unexpected code: " + c);  
//			}  
//	}  
//
//	public static byte[] decode(String s) {  
//
//		ByteArrayOutputStream bos = new ByteArrayOutputStream();  
//		try {  
//			decode(s, bos);  
//		} catch (IOException e) {  
//			throw new RuntimeException();  
//		}  
//		byte[] decodedBytes = bos.toByteArray();  
//		try {  
//			bos.close();  
//			bos = null;  
//		} catch (IOException ex) {  
//			System.err.println("Error while decoding BASE64: " + ex.toString());  
//		}  
//		return decodedBytes;  
//	}  
//
//	private static void decode(String s, OutputStream os) throws IOException {  
//		int i = 0;  
//
//		int len = s.length();  
//
//		while (true) {  
//			while (i < len && s.charAt(i) <= ' ')  
//				i++;  
//
//			if (i == len)  
//				break;  
//
//			int tri = (decode(s.charAt(i)) << 18)  
//					+ (decode(s.charAt(i + 1)) << 12)  
//					+ (decode(s.charAt(i + 2)) << 6)  
//					+ (decode(s.charAt(i + 3)));  
//
//			os.write((tri >> 16) & 255);  
//			if (s.charAt(i + 2) == '=')  
//				break;  
//			os.write((tri >> 8) & 255);  
//			if (s.charAt(i + 3) == '=')  
//				break;  
//			os.write(tri & 255);  
//
//			i += 4; 
//			
//		}  
//	}  

	public static String Bytes2HexString(byte[] b) {
		String ret = "";
		for (int i = 0; i < b.length; i++) {
			String hex = Integer.toHexString(b[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			ret += hex.toUpperCase();
		}
		return ret;
	}

	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null || hexString.equals("")) {
			return null;
		}
		hexString = hexString.toUpperCase();
		int length = hexString.length() / 2;
		char[] hexChars = hexString.toCharArray();
		byte[] d = new byte[length];
		for (int i = 0; i < length; i++) {
			int pos = i * 2;
			d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
		}
		return d;
	}

	private static byte charToByte(char c) {
		return (byte) "0123456789ABCDEF".indexOf(c);
	}
}
