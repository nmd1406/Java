package J04021;

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

    public IntSet union(IntSet intSet) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(set);
        treeSet.addAll(intSet.set);

        return new IntSet(treeSet);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        set.forEach(num -> builder.append(num).append(" "));

        return builder.toString();
    }
}
