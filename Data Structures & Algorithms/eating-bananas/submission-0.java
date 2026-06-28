class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = Arrays.stream(piles).max().getAsInt();
        int res = maxSpeed;

        while(minSpeed <= maxSpeed){
            int r = (minSpeed + maxSpeed) / 2;

            long totalTime = 0;
            for(int pile: piles){
                totalTime += Math.ceil((double) pile / r);
            }
            if(totalTime <= h){
                res = r;
                maxSpeed = r - 1;
            }else{
                minSpeed = r + 1;
            }
        }

        return res;
    }
}
