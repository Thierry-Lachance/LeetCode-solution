class Solution {
    public int smallestEvenMultiple(int n) {
        int multiple = 1;
        while(true){
            double number = (n * multiple);
            if(number%2 == 0){
                return((int)number);
            }
            else{
                multiple++;
            }
        }
    }
}
