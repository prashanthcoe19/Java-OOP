public class Str {
    public static void main(String[] args) {
        String s = "1abcd34";
        int k = 0;
        char ch[] = s.toCharArray();
        int x = ch.length - 1;
        while (k < x) {
            if (!Character.isAlphabetic(ch[k])) {
                k++;
            } else if (!Character.isAlphabetic(ch[x])) {
                x--;
            } else {
                char tmp = ch[k];
                ch[k] = ch[x];
                ch[x] = tmp;
                k++;
                x--;
            }
        }
        String rev = new String(ch);
        System.out.print(rev);
    }
}
