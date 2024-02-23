import java.util.ArrayList;
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> stack =  new ArrayList<Character>();
        for(int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '(':
                    stack.add('(');
                break;
                case '{':
                    stack.add('{');
                break;
                case '[':
                    stack.add('[');
                break;
                default:
                    if(stack.size() != 0){
                    switch (stack.get(stack.size()-1)){
                        case'{':
                            if('}' == s.charAt(i)){
                                stack.remove(stack.size()-1);
                            }
                            else{
                                return false;
                            }
                        break;
                        case'(':
                            if(')' == s.charAt(i)){
                                stack.remove(stack.size()-1);
                            }
                            else{
                                return false;
                            }
                        break;
                        case'[':
                            if(']' == s.charAt(i)){
                                stack.remove(stack.size()-1);
                            }
                            else{
                                return false;
                            }
                        break;
                    }
                    }
                    else{
                        return false;
                    }
                        
                break;
            }
        }
        if(stack.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
