import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        long count = 0;
        for(char jewel : jewels.toCharArray()){
            count += stones.chars().filter(s -> s == jewel).count();
        }
        return (int) count;
    }
}