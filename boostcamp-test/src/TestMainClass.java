import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMainClass {

  public static void main(String[] args) {
    int[] a = {2, 3, 4, 3, 5};
    int[] b = {1, 6, 7};

    TestMainClass main = new TestMainClass();
    int[] answer = main.solution(a, b);
    System.out.println("finish");
  }

  public int[] solution(int[] a, int[] b) {
    List<Integer> base = setList(a);
    List<Integer> other = setList(b);
    int baseSize = base.size();
    int otherSize = other.size();
    int sumSize = sum(base, other).size();
    int complementSize = complement(base, other).size();
    int intersectSize = intersect(base, other).size();
    return new int[]{baseSize, otherSize, sumSize, complementSize, intersectSize};
  }

  public List<Integer> setList(int[] array) {
    List<Integer> list = new ArrayList<>();
    Arrays.stream(array).filter(n -> !list.contains(n)).forEach(list::add);
    return list;
  }

  public List<Integer> sum(List<Integer> base, List<Integer> other) {
    ArrayList<Integer> sumList = new ArrayList<>();
    List<Integer> addList = complement(other, base);
    sumList.addAll(base);
    sumList.addAll(addList);
    return sumList;
  }

  public List<Integer> complement(List<Integer> base, List<Integer> other) {
    return base.stream()
        .filter(n -> !other.contains(n))
        .collect(Collectors.toList());
  }

  public List<Integer> intersect(List<Integer> base, List<Integer> other) {
    return base.stream()
        .filter(other::contains)
        .collect(Collectors.toList());
  }
}
