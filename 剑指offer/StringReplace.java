package offer;

import java.util.LinkedList;

public class StringReplace {
	public static void main(String[] args) {
		System.out.println(stringReplace(new StringBuffer(" skl lj lj 12sdgfgff sdf ")));
	}
	public static String stringReplace(StringBuffer str){
//		return demo1(str);
//		return demo2(str);
		String st=str.toString();
		StringBuilder sb=new StringBuilder();
		char[] st2=st.toCharArray();
		for (int i = 0; i < st2.length; i++) {
			if (st2[i]==' ') {
				sb.append("%20");
			}else{
				sb.append(st2[i]);
			}
		}
		return sb.toString();
	}
	public static String demo2(StringBuffer str) {
		String st=str.toString();
		System.out.println(st);
		return st.replace(" ", "%20");
	}
	public static String demo1(StringBuffer str) {
		String string=str.toString();
		String[] newStr=string.split(" ");//
		String res = "";
        for (int i = 0; i < newStr.length; i++) {
        	if (i==newStr.length-1) {
        		res+=newStr[i];
        		break;
			}
        	res+=newStr[i]+"%20";
		}
        return res;
	}
}
