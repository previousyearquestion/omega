//length of longest substring without repeating characters within any string
public int lengthOfLongestSubstring(String s) {
		String chk="";
		int max=0,i,j;
		if(s.length()==0||s.length()==1)
			return s.length();
		for(i=0;i<s.length();i++) {
			for(j=0;j<chk.length();j++) {
				if((int)chk.charAt(j)==(int)s.charAt(i)){
					if(chk.length()>max)
						max=chk.length();
					chk="";
				}
			}
			chk=chk+s.charAt(i);
		}
		return max;
	}