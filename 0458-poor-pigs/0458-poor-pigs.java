class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int rounds = minutesToTest / minutesToDie;
        int pigs = 0;
        int states = rounds + 1;
        while (Math.pow(states, pigs) < buckets) {
            pigs++;
        }
        return pigs;
    }
}