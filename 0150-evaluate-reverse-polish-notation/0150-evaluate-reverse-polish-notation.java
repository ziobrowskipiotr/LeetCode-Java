class Solution {
    Stack<Integer> stos = new Stack <>();
    int num1;
    int num2;
    public int evalRPN(String[] tokens) {
        for(int i=0; i<tokens.length; i++){
            switch(tokens[i]){
                case("+"):
                    this.num1 = stos.pop();
                    this.num2 = stos.pop();
                    stos.push(num2 + num1);
                    break;
                case("-"):
                    this.num1 = stos.pop();
                    this.num2 = stos.pop();
                    stos.push(num2 - num1);
                    break;
                case("*"):
                    this.num1 = stos.pop();
                    this.num2 = stos.pop();
                    stos.push(num2 * num1);
                    break;
                case("/"):
                    this.num1 = stos.pop();
                    this.num2 = stos.pop();
                    stos.push(num2 / num1);
                    break;
                default:
                    stos.push(Integer.parseInt(tokens[i]));
                    break;
            }
        }
        System.gc();
        return stos.pop();
    }
}