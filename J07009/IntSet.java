package J07009;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set;

    public IntSet(int[] arr) {
        set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }
    }

    public IntSet(TreeSet<Integer> set) {
        this.set = set;
    }

    public TreeSet<Integer> getSet() {
        return set;
    }

    public IntSet intersection(IntSet intSet) {
        TreeSet<Integer> integerSet = new TreeSet<>();
        set.forEach(num -> {
            if (intSet.set.contains(num)) {
                integerSet.add(num);
            }
        });

        return new IntSet(integerSet);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        set.forEach(num -> builder.append(num).append(" "));

        return builder.toString();
    }
}
