import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        return new BigInteger(b, 2).add(new BigInteger(a, 2)).toString(2);
    }
}
