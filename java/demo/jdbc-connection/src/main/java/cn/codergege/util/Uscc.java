package cn.codergege.util;

import java.util.HashMap;
import java.util.Map;

public class Uscc {
	// 1 位
	private static final String ADMIN_CODE = "9";//9
	// 2 位
	/*
	// 企业
//	private static final String T1 = "1";//1
//	// 个体工商户
//	private static final String T2 = "2";//1
//	// 农民专业合作社
//	private static final String T3 = "3";
	 */
	// 3-8 位
	private static final String DIVISION = "330782";// 330782
	// 9-17 位
	// 18 位 verification code
	// private String vc;
	// 1-17 位的字符编码值
	public static int[] cArray = new int[17]; 
	// 权重数组
	private static int[] wArray = {1, 3, 9, 27, 19, 26, 16, 17,20, 29, 25, 13, 8, 24, 10, 30, 28};;
	// 字符编码 map, 用于生成 cArray.
	public static Map<Character, Integer> charMap;
	public static Map<Integer, Character> viceCharMap;
	// 最终结果 18 位 uscc 值
	private String code;
	
	static {
		charMap = new HashMap<Character, Integer>();
		viceCharMap = new HashMap<Integer, Character>();
		charMap.put('0', 0);
		charMap.put('1', 1);
		charMap.put('2', 2);
		charMap.put('3', 3);
		charMap.put('4', 4);
		charMap.put('5', 5);
		charMap.put('6', 6);
		charMap.put('7', 7);
		charMap.put('8', 8);
		charMap.put('9', 9);
		charMap.put('A', 10);
		charMap.put('B', 11);
		charMap.put('C', 12);
		charMap.put('D', 13);
		charMap.put('E', 14);
		charMap.put('F', 15);
		charMap.put('G', 16);
		charMap.put('H', 17);
		charMap.put('J', 18);
		charMap.put('K', 19);
		charMap.put('L', 20);
		charMap.put('M', 21);
		charMap.put('N', 22);
		charMap.put('P', 23);
		charMap.put('Q', 24);
		charMap.put('R', 25);
		charMap.put('T', 26);
		charMap.put('U', 27);
		charMap.put('W', 28);
		charMap.put('X', 29);
		charMap.put('Y', 30);
		
		viceCharMap.put(0 , '0');
		viceCharMap.put(1 , '1');
		viceCharMap.put(2 , '2');
		viceCharMap.put(3 , '3');
		viceCharMap.put(4 , '4');
		viceCharMap.put(5 , '5');
		viceCharMap.put(6 , '6');
		viceCharMap.put(7 , '7');
		viceCharMap.put(8 , '8');
		viceCharMap.put(9 , '9');
		viceCharMap.put(10, 'A');
		viceCharMap.put(11, 'B');
		viceCharMap.put(12, 'C');
		viceCharMap.put(13, 'D');
		viceCharMap.put(14, 'E');
		viceCharMap.put(15, 'F');
		viceCharMap.put(16, 'G');
		viceCharMap.put(17, 'H');
		viceCharMap.put(18, 'J');
		viceCharMap.put(19, 'K');
		viceCharMap.put(20, 'L');
		viceCharMap.put(21, 'M');
		viceCharMap.put(22, 'N');
		viceCharMap.put(23, 'P');
		viceCharMap.put(24, 'Q');
		viceCharMap.put(25, 'R');
		viceCharMap.put(26, 'T');
		viceCharMap.put(27, 'U');
		viceCharMap.put(28, 'W');
		viceCharMap.put(29, 'X');
		viceCharMap.put(30, 'Y');
	}

	private static void generateCArray(String type, String jgdm) {
		String str17 = ADMIN_CODE + type + DIVISION + jgdm;
		char[] charArray = str17.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			try{
			cArray[i] = charMap.get(charArray[i]);
			} catch(Exception e) {
				System.out.println("i = " + i);
				System.out.println("str17 = " + str17);
				System.out.println("charArray[i] = " + charArray[i]);
			}
		}
	}
	
	// 生成校验码
	public static String generateVc() {
		int[] cw = new int[17];
		int cwSum = 0;
		int tmpVc = 0;
		for (int i = 0; i < cArray.length; i++) {
			cw[i] = cArray[i] * wArray[i];
			cwSum += cw[i];
		}
		int modCwSum = cwSum % 31;
		tmpVc = 31 - modCwSum;
		if(tmpVc == 30) {
			return "Y";
		} else if (tmpVc == 31) {
			return "0";
		} else {
			return viceCharMap.get(tmpVc) + "";
		}
		
	}
	
	public static String generateCode(String type, String jgdm) {
		generateCArray(type, jgdm);
		return ADMIN_CODE + type + DIVISION + jgdm + generateVc();
		
	}
	
	public static void main(String[] args) {
		/*	554019889	933307825540198891
		 * 	560979114	93330782560979114H
		 * 	575339187	93330782575339187L
			583582291	93330782583582291P
			586266913	93330782586266913M
			MA28ECJ91	93330782MA28ECJ91L
		 */
		String type = "3";
		String jgdm = "MA28ECJ91";
		//Uscc u = new Uscc();
		String code = Uscc.generateCode(type, jgdm);
		System.out.println(code.equals("93330782MA28ECJ91L"));
	}
}
