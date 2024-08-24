class Solution {
    Stack<Integer> stos = new Stack <>();
    public int evalRPN(String[] tokens) {
        for(int i=0; i<tokens.length; i++){
            try{
                stos.push(Integer.parseInt(tokens[i]));
            }
            catch(NumberFormatException e){
                stos.push(calculations(stos.pop(), stos.pop(), tokens[i]));
            }
        }
        System.gc();
        return stos.pop();
    }
    public int calculations(int num1, int num2, String op){
        if(op.equals("+")){
            return num2 + num1;
        }
        else if(op.equals("-")){
            return num2 - num1;
        }
        else if(op.equals("*")){
            return num2 * num1;
        }
        else{
            return num2 / num1;
        }

    }
}