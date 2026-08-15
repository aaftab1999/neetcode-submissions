class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prev = null;

        for (int i = 1; i <= numRows; i++) {
            List<Integer> rows = new ArrayList();
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    rows.add(1);
                    continue;
                }
                rows.add(prev.get(j-2)+prev.get(j-1));
                
            }
            res.add(rows);
            prev = res.get(i - 1);
        }
        return res;
    }
}