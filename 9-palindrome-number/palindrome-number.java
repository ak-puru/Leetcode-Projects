class Solution {

    public boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }

        String rightWay = Integer.toString(x);
        StringBuilder oppWay = new StringBuilder();

        for (int i=rightWay.length()-1; i>=0; i--) {
            oppWay.append(rightWay.charAt(i));
            
        }
        
        return rightWay.equals(oppWay.toString());
    }

 
}