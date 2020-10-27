// LANGUAGE: Java 
// ENV: Java 8 
// AUTHOR: Noopur Agarwal
// GITHUB: https://github.com/noopurAg

import java.util.*;
class LongestSubstring{
    public int lengthOfLongestSubstring(String s) {
    int max = 0;
    if(s==null || s.length()==0 ) return max;
    int i=0; int j=0;
    
    Set<Character> set = new HashSet<>();
    while(i< s.length()){
        if(set.contains(s.charAt(i))){
          set.remove(s.charAt(j));
            j++;
        } 
        else {
        set.add(s.charAt(i)); 
        if(max<i-j+1)max=i-j+1;
           
        //max = Math.max(max, i-j+1);
        i++;  
        }
    }
  
 
    return max;
}
public static void main(String [] args){
   LongestSubstring ls = new LongestSubstring();
   String s = "aaabbbcbbc";
   int length = ls.lengthOfLongestSubstring(s);

   System.out.println("Longest length of substring w/o repeating chars "+ length);
}

}