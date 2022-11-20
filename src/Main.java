import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    private static final List<String> NAMES = List.of(
            "Вася", "Петя", "Саша", "Маша", "Миша", "Федя", "Ваня", "Света", "Глеб");
    private static final Random RANDOM = new Random();
    private static final int Max_SIZE = 5;


    public static void main(String[] args) {
        //какие то задания по спискам и очередям
        Queue<String> queue1 = new ArrayDeque<>();
        Queue<String> queue2 = new ArrayDeque<>();
        filling(queue1);
        filling(queue2);
        System.out.println("очередь 1" + queue1);
        System.out.println("очередь 2" + queue2);
        add("Дима",queue1,queue2);
        System.out.println("очередь 1" + queue1);
        System.out.println("очередь 2" + queue2);
        delete( queue1,queue2);
        System.out.println("очередь 1" + queue1);
        System.out.println("очередь 2" + queue2);
    }

    public static void add(String name, Queue<String> queue1, Queue<String> queue2) {
        if (queue1.size() == Max_SIZE && queue2.size() == Max_SIZE) {
            System.out.println("ГАААААААААААААААААААААЛЛЛЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯЯ");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(name);
        } else {
            queue2.offer(name);
        }
    }
    public static void delete(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.poll();
        } else {
            queue2.poll();
        }
    }

    private static void filling(Queue<String> queue) {
        int size = RANDOM.nextInt(Max_SIZE);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }
}