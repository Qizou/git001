import java.util.*;

public class test001 {

    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList ans = new ArrayList();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    if (m < 10) {
                        String s = h + ":0" + m;
                        ans.add(s);
                    } else {
                        String s = h + ":" + m;
                        ans.add(s);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String a = Integer.valueOf("0100001", 2).toString();
        System.out.println(a);
    }
}
