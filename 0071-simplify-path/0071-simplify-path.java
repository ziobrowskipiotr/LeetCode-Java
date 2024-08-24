//4
class Solution {
    public String simplifyPath(String path) {
        String new_path = new String();
        String[] tab = path.split("/");
        Stack<String> stos = new Stack<>();
        for(String element : tab){
            switch(element){
                case ".":
                    continue;
                case "..":
                    if(!stos.empty()){
                        stos.pop();
                        break;
                    }
                    else{
                        continue;
                    }
                case "":
                    continue;
                default:
                    stos.push(element);
                    break;
            }
        }
        return "/" + String.join("/", stos);
    }
}