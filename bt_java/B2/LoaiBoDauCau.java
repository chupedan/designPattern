package bt_java.B2;

import java.util.Arrays;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    List<String> daus = Arrays.asList(",", ".", "!", "?");

    public LoaiBoDauCau(ITokennize src) {
        super(src);
    }
    public String[] tokennize() {
        String[] st = super.tokennize();
        for (int i = 0; i < st.length; i++) {
            String dau = st[i].substring(st[i].length() - 1);
            if (daus.contains(dau)) {
                st[i] = st[i].substring(0, st[i].length() - 1);
            }
        }
//        Arrays.stream(st).forEach(s -> {
//            String dau = s.substring(s.length() - 1);
//            if (daus.contains(dau)) {
//                s = s.substring(0, s.length() - 2);
//            }
//        });
        return st;
    }
}
