import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
    static Random random = new Random();

    public static void main(String[] args) {
        int brithday = 971006;
        HashMap<Integer, Integer> resultMap = new HashMap<Integer, Integer>();
        setResultMap(resultMap);
        for (int i = 0; i < brithday; i++) {
            List<Integer> ints = new ArrayList();
            setLottoBalls(ints);
            for (int j = 0; j < 6; j++) {
                Integer ballNumber = shootLottoBall(ints);
                resultMap.computeIfPresent(ballNumber, (Integer key, Integer value) ->  ++value);
            }
        }
        List<Map.Entry<Integer, Integer>> collect = resultMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        for (Map.Entry<Integer, Integer> entry : collect) {
            System.out.println("Key: " + entry.getKey() + ", " + "Value: " + entry.getValue());
        }
    }

    public static void setLottoBalls(List<Integer> ints) {
        for (int i = 1; i <= 45; i++) {
            ints.add(i);
        }
    }
    public static void setResultMap(HashMap<Integer, Integer> resultMap) {
        for (int i = 1; i <= 45; i++) {
            resultMap.put(i, 0);
        }
    }

    public static Integer shootLottoBall(List<Integer> ints) {
        int randomNum = random.nextInt(ints.size());
        Integer result = ints.get(randomNum);
        ints.remove(randomNum);
        return result;
    }
}