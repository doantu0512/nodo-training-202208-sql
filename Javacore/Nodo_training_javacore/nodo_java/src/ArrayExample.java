public class ArrayExample {
    public static void main(String[] args) {
        float[] values ={4.5f,5.5f};
        float total =0;
        for (float value :values) {
            total+= value;
        }
        System.out.println("the total value of array is" +total);

    }
}
