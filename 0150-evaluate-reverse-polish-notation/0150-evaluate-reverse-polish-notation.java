class Solution {
    Stack<Integer> stos = new Stack <>();
    public int evalRPN(String[] tokens) {
        for(int i=0; i<tokens.length; i++){
            try{
                stos.push(Integer.parseInt(tokens[i]));
            }
            catch(NumberFormatException e){
                int num1 = stos.pop();
                int num2 = stos.pop();
                if(tokens[i].equals("+")){
                    stos.push(num2 + num1);
                }
                else if(tokens[i].equals("-")){
                    stos.push(num2 - num1);
                }
                else if(tokens[i].equals("*")){
                    stos.push(num2 * num1);
                }
                else{
                    stos.push(num2 / num1);
                }
            }
        }
        return stos.pop();
    }
}