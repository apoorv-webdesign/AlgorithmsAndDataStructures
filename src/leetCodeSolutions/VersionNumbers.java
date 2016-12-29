package leetCodeSolutions;

public class VersionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1 = "1.1.1.1";
		String version2 = "2.2";
		
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		
		Integer l1=0,l2=0;
		
		int length = Math.max(v1.length, v2.length);
		
		for(int i=0;i<length;i++){
			l1= i< v1.length ? Integer.parseInt(v1[i]):0;
			l2= i< v2.length ? Integer.parseInt(v2[i]):0;
			
			int compare = l1.compareTo(l2);
			if(compare!=0){
				System.out.println(compare);
			}
		}
		
		System.out.println(0);
		
		/*int dot1 = 0;
		int dot2 = 0;
		int pos1 = 0;
		int pos2 = 0;
		int count1 = s1.length() - s1.replace(".", "").length();
		int count2 = s2.length() - s2.replace(".", "").length();

		while (count1 != 0 && count2 != 0) {
			dot1 = s1.indexOf(".");
			dot2 = s2.indexOf(".");

			//Integer.parseInt(s1.substring(pos1, dot1));
			//Integer.parseInt(s2.substring(pos2, dot2));
			System.out.println("1--"+s1.substring(pos1, dot1));

			if (Integer.parseInt(s1.substring(pos1, dot1)) > Integer.parseInt(s2.substring(pos2, dot2)))
				System.out.println(1);
			if (Integer.parseInt(s1.substring(pos1, dot1)) < Integer.parseInt(s2.substring(pos2, dot2)))
				System.out.println(-1);

			pos1 = dot1;
			pos2 = dot2;
			s1 = s1.replaceFirst(".", "");		
			s2 = s2.replaceFirst(".", "");
			
			count1--;
			count2--;
		}
		System.out.println(0);
		/*
		 * System.out.println(Integer.parseInt(s1.replace(".", "")));
		 * System.out.println(count1); int point1=s1.indexOf("."); int
		 * point2=s2.indexOf("."); s1.substring(0, point1);
		 * System.out.println(s2.substring(0, point2))
		 */
        /*String v1 = version1.replace(".","");
        String v2 = version2.replace(".","");
        
        int v_1=Integer.parseInt(v1);
        int v_2=Integer.parseInt(v2);
        
        if(v_1>v_2) return 1;
        if(v_1<v_2) return -1;
        return 0;*/		 
	}

}
