package solving;

import java.text.DecimalFormat;
import java.util.List;

public class Mean {

    static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public static String getMean(List<Integer> data) {
        float result = 0;
        for(Integer x : data) result += x;
        return decimalFormat.format(result / data.size());

    }
    
}
