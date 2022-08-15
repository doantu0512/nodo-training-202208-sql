public class ArrayExample1 {
    public static void main(String[] args) {
        float[] values= {4.5f,5.5f};
        float max= values[0];
        for (float n :values) {
            if(max<n) {
                max= n;
            }
        }
        System.out.println("Gia Tri Lon Nhat ="+max);
    }
}
