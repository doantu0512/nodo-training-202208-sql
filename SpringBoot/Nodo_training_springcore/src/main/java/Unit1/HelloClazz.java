package Unit1;

import org.springframework.beans.factory.DisposableBean;

public class HelloClazz  implements DisposableBean {
    String message;

    public HelloClazz() {
        message = "From Constructor: Say hello everyone!";
    }
    public HelloClazz(int person){
            message = "From Constructor: Say hello to" +person+ "person(s)!";
    }
    public HelloClazz(HelloClazz clazz){
        message = clazz.message;
    }
    @Override
    public void destroy() throws Exception {
        message = null;
        System.out.println("message is null");
    }
    private void  release(){
        message= null;
        System.out.println("Message is null");
    }

    private void initMessage(){
        System.out.println("Calling init method:...");
        message= "From init method: say hello bean!";
    }
    public void printMessage() {
        System.out.println("Your message:" + message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

        this.message ="Call from setter "+ message;
    }

    public HelloClazz(String message) {
        this.message = message;
    }



}
