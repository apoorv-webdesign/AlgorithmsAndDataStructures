package leetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {
	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap <String,List<String>> map = new HashMap<String,List<String>>();
		Arrays.sort(strs);
		for(String s: strs){
			char[] p = s.toCharArray();
			Arrays.sort(p);
			String strKey = String.valueOf(p);
			if(!map.containsKey(strKey)){
				map.put(strKey, new ArrayList<String>());
			}
			map.get(strKey).add(s);
		}
		for (int i = 0; i < strs.length; i++) {
			
		}
		return new ArrayList<List<String>>(map.values());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram ana = new Anagram();
		List<List<String>> str = new ArrayList<List<String>>();		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		str=ana.groupAnagrams(strs);
		System.out.println(str);
	}

}
