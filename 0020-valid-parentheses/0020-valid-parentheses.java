class Solution {
    public boolean isValid(String s) {
        Stack<Character> stos = new Stack<>();
        if(s.length()%2 == 0){
            stos.push(s.charAt(0));
            for(int i=1; i<s.length(); i++){
                switch(s.charAt(i)){
                    case ')':
                        if(!stos.empty() && (int)stos.peek() == (int)s.charAt(i) - 1){
                            stos.pop();
                            break;
                        }
                        else{
                            stos.push(s.charAt(i));
                            break;
                        }
                    case ']':
                        if(!stos.empty() && (int)stos.peek() == (int)s.charAt(i) - 2){
                            stos.pop();
                            break;
                        }
                        else{
                            stos.push(s.charAt(i));
                            break;
                        }
                    case '}':
                        if(!stos.empty() && (int)stos.peek() == (int)s.charAt(i) - 2){
                            stos.pop();
                            break;
                        }
                        else{
                            stos.push(s.charAt(i));
                            break;
                        }
                    default:
                        stos.push(s.charAt(i));
                        break;
                }
            }
            if(stos.empty()){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}