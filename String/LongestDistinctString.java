import java.util.HashSet;

public class LongestDistinctString{
    public static void main(String[] args) {
        String S="aldshflasghdfasgfkhgasdfasdgvfyweofyewyrtyefgv";
         int sLen=S.length();
        String arr[]=S.split("");
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<sLen;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
    }
}