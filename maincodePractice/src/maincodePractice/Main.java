package maincodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str = {"eat","tea","tan","ate","nat","bat"};
		
		List<List<String>> ans = groupAnagrams(str);
		
		for(List<String> l : ans) {
			System.out.println(l);
		}
		
		System.out.println(isSubsequence("abc","ahbgdc"));

	}
	
	 public static boolean isSubsequence(String s, String t) {
         int i=0,j=0;
      
       while(i<s.length()){
           
           if(s.charAt(i) == t.charAt(i)){
               i++;
           }
          if(j==t.length()) return false; 
           
           j++;
       } 
        
        return true;
    }
	
    public static List<List<String>> groupAnagrams(String[] strs) {
    	
    	
//    	HashMap<String, ArrayList<String>> map = new HashMap<>();
//        for(String str: strs) {
//            char[] c = str.toCharArray();
//            Arrays.sort(c);
//            String sortedStr = String.copyValueOf(c);
//
//            if(map.getOrDefault(sortedStr, null) == null) {
//                map.put(sortedStr, new ArrayList<String>());
//            }
//            map.get(sortedStr).add(str);
//        }
//        return new ArrayList<List<String>>(map.values());
        
        Map<String,ArrayList<String>>map = new HashMap<>();
       for(int i=0;i<strs.length;i++){
           String str=strs[i];
           char[] temp = str.toCharArray();
           Arrays.sort(temp);
           str = new String(temp);
           if(!map.containsKey(str)){
               //str not found
               ArrayList<String>anagrams = new ArrayList<String>();
               anagrams.add(strs[i]);
               map.put(str,anagrams);
           }else{
               ArrayList<String> temp1 = map.get(str);
               temp1.add(strs[i]);
               map.put(str,temp1);
           }
       }
//       vector<vector<string>>ans;
       
       ArrayList<List<String>> ans = new ArrayList<List<String>>(); 
    //   unordered_map<string,vector<string>>::iterator it;
       
       for(String s : map.keySet()){
            ans.add(map.get(s));
       }
       
       
//        for(it=map.begin();it!=map.end();it++){
      
//            ans.push_back(it->second);
//        }
       return ans;
       
   }

}
