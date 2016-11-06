// return the word in s, but not in t
public List<String> missingWords (String s, String t) {
	List<String> res = new ArrayList<String> ();
    String[] str1 = s.split(" ");
    String[] str2 = t.split(" ");
    int pt1 = 0;
    int pt2 = 0;
    while (pt1 < str1.length) {
    	if (pt2 < str2.length && str1[pt1].equals(str2[pt2])) {
    		pt1++;
    		pt2++;
    	}
    	else {
    		res.add(str1[pt1]);
    		pt1++;
    	}
    }
    return res;
}
