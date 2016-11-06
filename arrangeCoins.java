// arrang coids in triangle shape, and return the num of row
public List<Integer> arrangeCoins (long[] coins) {
	List<Integer> res = new ArrayList<>();
	if (coins == null || coins.length == 0){
        return res;
	}
	for(int i = 0; i < coins.length; i++) {
	   int n = (int) (Math.sqrt(1 + 8 * coins[i]) - 1) / 2;
       res.add(n);
	}
	return res;
}
