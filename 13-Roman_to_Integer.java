class Solution {
    public int romanToInt(String s) {
        int length = s.length();
        int solution = 0;
        for(int i = 0; i < length; i++){
            switch (s.charAt(i)){
                case 'M':
                    solution = solution + 1000;
                break;
                case 'D':
                    solution = solution + 500;
                break;
                case 'C':
                if((i + 2) <= length){
                    if(s.charAt(i + 1) == 'D'){
                        solution = solution + 400;
                        i++;
                    }
                    else{
                        if(s.charAt(i + 1) == 'M'){
                            solution = solution + 900;
                            i++;
                        }
                        else{
                            solution = solution + 100;
                        }
                    }
                }
                 else{
                        solution = solution + 100;
                    } 
                break;
                case 'L':
                    solution = solution + 50;
                break;
                case 'X':
                if((i + 2) <= length){
                    if(s.charAt(i + 1) == 'L'){
                            solution = solution + 40;
                            i++;
                        }
                        else{
                            if(s.charAt(i + 1) == 'C'){
                                solution = solution + 90;
                                i++;
                            }
                            else{
                                solution = solution + 10;
                            }
                        }
                }
                else{
                    solution = solution + 10;
                }
                break;
                case 'V':
                    solution = solution + 5;
                break;
                case 'I':
                if((i + 2) <= length){
                    if(s.charAt(i + 1) == 'V'){
                        solution = solution + 4;
                        i = i + 1;
                    }
                    else{
                        if(s.charAt(i + 1) == 'X'){
                            solution = solution + 9;
                            i = i + 1;
                        }
                        else{
                            solution = solution + 1;
                        }
                    }
                   
                }
                else{
                    solution = solution + 1;
                }
                break;

            }
        }
        return solution;
    }
}