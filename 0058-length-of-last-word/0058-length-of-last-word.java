class Solution {
    public int lengthOfLastWord(String s) {
        String[] tab = s.split(" ");
        return tab[tab.length-1].length();
    }
}