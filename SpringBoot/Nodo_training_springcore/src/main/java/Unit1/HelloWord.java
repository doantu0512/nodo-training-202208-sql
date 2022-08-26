package Unit1;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWord {
    private static final Logger logger = Logger.getLogger(HelloWord.class);
    String message;
    String name;


    private HelloClazz clazz;
    public HelloWord() {
    }

    public HelloWord(String name, HelloClazz clazz) {
        this.name = name;
        message= "From HelloWord"+name+":" + clazz.getMessage();

    }

    public void sayHello(){
        this.clazz.printMessage();
        Logger.getLogger("From HelloWord"+message);
    }
    public void setMessage(String message) {
        this.message = message;

    }

    public void setClazz(String clazz) {
    }

}

