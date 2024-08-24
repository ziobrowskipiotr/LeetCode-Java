class Solution {
    Stack<Integer> stos = new Stack <>();
    int wynik;
    public int evalRPN(String[] tokens) {
        for(int i=0; i<tokens.length; i++){
            try{
                stos.push(Integer.parseInt(tokens[i]));
            }
            catch(NumberFormatException e){
                stos.push(calculations(stos.pop(), stos.pop(), tokens[i]));
            }
        }
        return stos.pop();
    }
    public int calculations(int num1, int num2, String op){
        switch(op){
            case "+":
                return num2 + num1;
            case "-":
                return num2 - num1;
            case "*":
                return num2 * num1;
            case "/":
                return num2 / num1;
            default:
                return -1;
        }
    }
}