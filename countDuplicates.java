// return the number of duplicates
void countDuplicates (int[] nums) {
	Map<Integer, Integer> hMap = new HashMap<Integer, Integer> ();
    // hMap.put(num, hMap.getOrDefault(num, 0)); for Java 8
	for(int num : nums) {
		Integer count = hMap.get(num);
		hMap.put(num, (count == null)? 1 : count + 1);
	}
		
	int res = 0;
	for (int k : hMap.keySet()) {
		if (hMap.get(k) > 1) {
			res++;
		}
	}
	System.out.println(res);
}

