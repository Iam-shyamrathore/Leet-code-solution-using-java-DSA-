import java.lang.Math;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0 )return false;
        return (Math.ceil((Math.log10(n)/Math.log10(2))))==(Math.floor((Math.log10(n)/Math.log10(2))));
                    
    }
}
