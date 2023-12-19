package J02009;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for(int i = 0; i < test; ++i) {
            list.add(new Pair<>(scanner.nextInt(), scanner.nextInt()));
        }

        Collections.sort(list, Comparator.comparingInt(Pair::getFirst));
        int res = list.get(0).getFirst() + list.get(0).getSecond();
        for(int i = 1; i < test; ++i) {
            if(res < list.get(i).getFirst()) {
                res = list.get(i).getFirst() + list.get(i).getSecond();
            } else {
                res += list.get(i).getSecond();
            }
        }
        System.out.println(res);
    }
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}
