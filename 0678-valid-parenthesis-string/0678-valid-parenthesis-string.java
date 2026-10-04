import java.util.Stack;

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                open.push(i);
            } else if (ch == '*') {
                star.push(i);
            } else { // ch == ')'
                if (!open.isEmpty()) {
                    open.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        // Bache hue '(' ko right side wale '*' se match karein
        while (!open.isEmpty() && !star.isEmpty()) {
            // Agar '(' ka index '*' ke baad hai, jaise "*(", toh match nahi ho sakta
            if (open.pop() > star.pop()) {
                return false;
            }
        }

        return open.isEmpty();
    }
}