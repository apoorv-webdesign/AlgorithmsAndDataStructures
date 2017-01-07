package leetCodeSolutions;

public class StrStr {

	public static void main(String[] args) {
		//"mississippi"
		//"issip"
		String needle = "or", hay = "Apoorv";
		//boolean flag = false;
		int hay_pos = 0;//, needle_pos = 0;
		
		if(hay.length()<needle.length())
		    System.out.println(-1);

		if(needle.length()==0)
		    System.out.println(0);
		
		while (hay_pos < hay.length()-needle.length()) {
			System.out.println(hay_pos+" "+ (hay_pos+needle.length())+ hay.substring(hay_pos, hay_pos+needle.length()));
			if(hay.substring(hay_pos, hay_pos+needle.length()).equals(needle)){
				System.out.println(hay_pos);
				break;
			}
			else{
				hay_pos++;
			}
		}
		//System.out.println(flag == true ? (hay_pos - needle.length()) : -1);
	}

}
/*			if (hay.charAt(hay_pos) == needle.charAt(needle_pos)) {
hay_pos++;
needle_pos++;				
if (needle_pos > needle.length() - 1) {
	flag=true;
	break;
}
} else {			
hay_pos = needle_pos!=0 ? hay_pos-1 : hay_pos+1;
flag = false;
needle_pos = 0;
}*/