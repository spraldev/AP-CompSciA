/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		//Cipher cipher = new Cipher();
		
		String de = Cipher.keyedEncode("549q94u8 q3t sxys0u3 q7u 2e vqb47y9u bq7yqr1u 3q2u8", 7);
		
		System.out.println(de);
		
		// //"hard" 2
		
		// String str2 = "amlb mfhp7fcj jlgq fo tap s9a bjlslql aflipa lb hlg9b 210z t9ct";
		
		// for(int i = 0; i < 36; i++) {
		// 	System.out.println(i + " " + Cipher.keyedEncode(str2, i));
		// }
		
		// //"hard" 1
		
		// String str1 = "u4y i1e i5 i6ita5c 314c1i66e1 i5f by6i5 hea5c zbi58 u4y";
		
		// for(int i = 0; i < str1.length(); i++) {
		// 	System.out.println(i + " " + Cipher.keyedEncode(str1, i));
		// }
		
		
		// couldn't do number 7 so decided to use my "algorithm" on it
		
		String str3 = "lvpo5 rp775rr4pyyl 7vxuy5q56 q25 41srq r57q1vw";
		
		for(int i = 0; i < 36; i++) {
			System.out.println(i + " " + Cipher.keyedEncode(str3, i));
		}
		
		
		

	}
	



}
