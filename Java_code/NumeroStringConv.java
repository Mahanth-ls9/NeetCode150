/*  give Input is 3[s]2[tb]4[kp] then output should be ssstbtbkpkpkpkp
* 
 * 
 * 
 */




package Java_code;

import java.util.Stack;

public class NumeroStringConv {

    public static String decoder(String S){
     Stack<StringBuilder> textStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int i = 0;
       for(char c : S.toCharArray())
        {
            if(Character.isDigit(c)){
                i=i*10 + ( c -'0');
        }else if(c == '['){
            numStack.push(i);
            textStack.push(result);
            i=0;
            result = new StringBuilder();
           
        }else if (c==']'){
            int mult = numStack.pop();
            StringBuilder tempStr= textStack.pop();
            tempStr.append(result.toString().repeat(mult));
            result = tempStr;
        }else{
            result.append(c);
        }
    }
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(decoder("3[se2[tb]]1[a]"));
 
    }
}
