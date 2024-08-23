class Solution {
    public boolean isValid(String s) {
        Stack<Character> stos = new Stack<>();
        if(s.length()%2 == 0){
            stos.push(s.charAt(0));
            for(int i=1; i<s.length(); i++){
                if(!stos.empty()){
                    switch(s.charAt(i)){
                        case ')':
                            if((int)stos.peek() == (int)s.charAt(i) - 1){
                                stos.pop();
                                break;
                            }
                            else{
                                stos.push(s.charAt(i));
                                break;
                            }
                        case ']':
                            if((int)stos.peek() == (int)s.charAt(i) - 2){
                                stos.pop();
                                break;
                            }
                            else{
                                stos.push(s.charAt(i));
                                break;
                            }
                        case '}':
                            if((int)stos.peek() == (int)s.charAt(i) - 2){
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
                else{
                    stos.push(s.charAt(i));
                }
            }
            if(stos.empty()){
                System.gc();
                return true;
            }
            else{
                System.gc();
                return false;
            }
        }
        else{
            System.gc();
            return false;
        }
    }
}
//1