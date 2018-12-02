package com.sh.reverse.tricky;

public class RemoveIntegerFromString {

	public static void main(String[] args) {
		String[] strArray = { "Bikr234aM", "ASJAN231" };
		String str1 = "agjfdgg45jan23";
		char[] charArray = str1.toCharArray();
		boolean flag = false;
		StringBuffer strBuffer = new StringBuffer();
		
		for (char c : charArray) {
			String str2 = Character.toString(c);
			try {
				Integer.parseInt(str2);
				flag = true;
			} catch (NumberFormatException nfe) {
				flag = false;
			}
			if(flag == false){
				strBuffer.append(str2);
			}
		}
		System.out.println(strBuffer.toString());
	}

}
