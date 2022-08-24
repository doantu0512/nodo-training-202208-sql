import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        Consumer<Integer> myConsumer = n -> {
            System.out.println("user input value = " + n);
            if (n < 5) {
                System.out.println("Invalid value!");
                return;
            }
            listOfIntegers.add(n);
            System.out.println("values: " + listOfIntegers.get(listOfIntegers.size() - 1));
            listOfIntegers.forEach(x -> System.out.print(x + "-"));
        };
        myConsumer.accept(12);
    }

    private static void vd3() {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        Consumer<Integer> myConsumer = n -> {
            System.out.println("user input value = " + n);
            if (n < 5) {
                System.out.println("Invalid value!");
                return;
            }
            listOfIntegers.add(n);
            System.out.println("values: " + listOfIntegers.get(listOfIntegers.size() - 1));
            listOfIntegers.forEach(x -> System.out.print(x + "-"));
        };
        myConsumer.accept(12);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("PLease input a number: ");
            Integer value = scanner.nextInt();
            myConsumer.accept(value);
            System.out.println();
        }
    }

    private static void vd2() {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
        Consumer<Integer> myConsumer = n -> {
            System.out.println("user input value = " + n);
            if (n < 5) {
                System.out.println("Invalid value!");
                return;
            }
            listOfIntegers.add(n);
            System.out.println("values: " + listOfIntegers.get(listOfIntegers.size() - 1));
            listOfIntegers.forEach(x -> System.out.print(x + "-"));
        };
        myConsumer.accept(12);
    }
    private static void vd5(){
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        Predicate<Integer> tester = v -> v > 5;
        Consumer<Integer> myConsumer = n -> listOfIntegers.add(n);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Please input a number: ");
            int value = scanner.nextInt();
            if (value < 0){
                break;
            }
            if (tester.test(value)){
                myConsumer.accept(value);
            }
        }
        listOfIntegers.forEach(x -> System.out.print(x + "-"));
    }

}
