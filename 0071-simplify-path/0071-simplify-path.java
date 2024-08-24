class Solution {
    public String simplifyPath(String path) {
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
        String new_path = new String();
        while(!stos.empty()){
            new_path = "/" + stos.pop() + new_path;
        }
        if(new_path.equals("")){
            return "/";
        }
        else{
            return new_path;
        }
    }
}