public class SwitchExample {
    public static void main(String[] args) {
        int value = Integer.parseInt((args[0]));
        switch (value){
            case 0 :
                System.out.println("so bad");
                break;
            case 1 :
                System.out.println("it's ok");
                break;
            default:
                System.out.println("invalid");
                break;
        }
    }
}
