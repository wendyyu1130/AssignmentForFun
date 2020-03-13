package DansDilemma;
import java.util.Set;
import java.util.HashSet;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        return dilemmaOfN(input1, input2);
    }

    private Set<Double> dilemmaOfTwoHelper(double input1, Double input2){
        Set<Double> helper = new HashSet<Double>();
        helper.add(input1 + input2);
        helper.add(input1 * input2);
        helper.add(input1 - input2);
        helper.add(input2 + input1);
        helper.add(input2 * input1);
        helper.add(input2 - input1);
        if(input1 != 0){
            helper.add(input2 / input1);
        }
        if(input2 != 0){
            helper.add(input1 / input2);
        }
        return helper;

    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {

        return dilemmaOfN(input1, input2, input3);
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> helper = new HashSet<Double>();
        for (int i = 1; i < args.length; i++){
            for (int j = 0; j < i; j++) {
                Set<Double> temp = dilemmaOfTwoHelper(args[i], args[j]);
                helper = merge(helper, temp);
            }
        }
        return helper.size();
    }

    private Set<Double> merge(Set<Double> set1, Set<Double> set2) {
        Set<Double> result = set1;
        for(Double d : set2){
            result.add(d);
        }
        return result;

    }
}
