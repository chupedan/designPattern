package bt_java.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    List<String> dungs = Arrays.asList("va", "thi", "ma", "la", "hoac", "qua");
    public LoaiBoTuDung(ITokennize src) {
        super(src);
    }

    @Override
    public String[] tokennize() {
//        List<String> tus = Arrays.asList(super.tokennize());
////        tus.removeAll(dungs);
//        List<String> tuMois = new ArrayList<>();
//        for (String s : tus) {
//            if (!dungs.contains(s.toLowerCase())) {
//                tuMois.add(s);
//            }
//        }
//        return tuMois.toArray(new String[0]);
        ArrayList<String> dsTu = new ArrayList<>();
        dsTu.addAll(Arrays.asList(super.tokennize()));
        dsTu.removeAll(Arrays.asList(dungs));
        return dsTu.toArray(new String[0]);
    }
}
