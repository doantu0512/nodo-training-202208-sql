public class MultidimensionalArrayExample {
    public static void main(String[] args) {
        String[][] values={
                {"Doan","Van","A"},
                {"Tran","Thi","B"}
        };
        for (int i= 0;i<values.length;i++) {
            System.out.println("L");
            for (int j= 0 ;j<values[i].length;j++) {
                System.out.println(values[i][j]+"L");

            }
            System.out.println();
        }
    }
}
