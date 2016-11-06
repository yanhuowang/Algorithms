// return the subsequence of a string, without empty string
public List<String> subsequence(String s) {
	List<String> res = new ArrayList<String> ();
    StringBuilder item = new StringBuilder ();
    char[] sArray = s.toCharArray();
    Arrays.sort(sArray);
    for (int i = 1; i <= sArray.length; i++) {
        backTrack(res, item, sArray, i, 0);
    }
    Collections.sort(res);
    return res;
}

void backTrack(List<String> res, StringBuilder item, char[] sArray, int size, int start) {
    if (item.length() == size) {
        res.add(item.toString());
    }
    for (int i = start; i < sArray.length; i++) {
        item.append(sArray[i]);
        backTrack(res, item, sArray, size, i + 1);
        item.deleteCharAt(item.length() - 1);
    }
}
