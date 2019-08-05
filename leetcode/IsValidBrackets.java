public class IsValidBrackets {
/*
思路：定义一个hashmap,把括号的后半部分存为key,前半部分存为value
定义一个辅助栈stack，装括号的前半部分
对str字节数组循环，如果是括号的前半部分则直接压入stack栈，如果是括号后半部分，则和判断hashmap里的对应的value是否等于对应stack的栈顶元素，不等就返回false
*/
	public boolean isValid(String s) {
		HashMap<Character, Character> hm=new HashMap<>();
		hm.put(')','(');
		hm.put(']', '[');
		hm.put('}', '{');
        char[] str=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length; i++) {
			if(hm.containsKey(str[i])){
				char chart=stack.empty()?'#':stack.pop();
				if(chart!=hm.get(str[i])){
					return false;
				}
			}else{
				stack.push(str[i]);
			}
		}
        return stack.isEmpty();
    }
}
