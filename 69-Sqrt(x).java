//really not time efficient
class Solution {
    public int mySqrt(int x) {
        int number = 5;
        boolean over = false;
        if(x/number < number){
                over = true;
        }
        if(x == 0){
            return 0;
        }    
        while(true){
            if(x/number == number){
                return number;
            }
            else if(x/number > number){
                if(over == true){
                    return number;
                }
                over = false;
                number++; 
            }
            else if(x/number < number){
                if(over == false){
                    return number - 1;
                }
                over = true;
                number--; 
            }
        }
    }
}
