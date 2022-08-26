package Unit1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();

//        HelloClazz obj = (HelloClazz) context.getBean("hello clazz");
//        ((HelloClazz) obj).printMessage();
//        System.out.println(obj.toString());
//
//        HelloClazz obj2 = (HelloClazz) context.getBean("hello clazz1");
//        ((HelloClazz) obj2).printMessage();
//        System.out.println(obj2== obj2);
//
//        HelloClazz obj3 = (HelloClazz) context.getBean("hello clazz2");
//        ((HelloClazz) obj3).printMessage();
//        System.out.println(obj3);
//
//        HelloClazz obj4 = (HelloClazz) context.getBean("hello clazz3");
//        ((HelloClazz) obj4).printMessage();
//        System.out.println(obj4);
//
//        HelloClazz obj5 = (HelloClazz) context.getBean("hello clazz4");
//        ((HelloClazz) obj5).printMessage();
//        System.out.println(obj5);

//        HelloClazz obj6 = (HelloClazz) context.getBean("hello clazz5");
//        ((HelloClazz) obj6).printMessage();
//        System.out.println(obj6);
//
//        HelloClazz obj7 = (HelloClazz) context.getBean("hello clazz6");
//        ((HelloClazz) obj7).printMessage();
//        System.out.println(obj7);

//        HelloClazz obj8 = (HelloClazz) context.getBean("hello clazz7");
//        ((HelloClazz) obj8).printMessage();
//        System.out.println(obj8);
//
//        HelloClazz obj9 = (HelloClazz) context.getBean("hello clazz8");
//        ((HelloClazz) obj9).printMessage();
//        System.out.println(obj9);

//        HelloWord obj10 = (HelloWord) context.getBean("helloWord");
//        obj10 .sayHello();
//        System.out.println(obj10);
//
//        HelloClazz obj11 = (HelloClazz) context.getBean("hello clazz8");
//        ((HelloClazz) obj11).printMessage();
//        System.out.println(obj11);

//        HelloClazz obj12 = (HelloClazz) context.getBean("hello clazz10");
//        ((HelloClazz) obj12).printMessage();
//        System.out.println(obj12);
//        HelloWord obj13 = (HelloWord) context.getBean("helloWord1");
//        obj13 .sayHello();
//        System.out.println(obj13);
//
//        HelloClazz obj14 = (HelloClazz) context.getBean("hello clazz11");
//        ((HelloClazz) obj14).printMessage();
//        System.out.println(obj14);

//        HelloClazz obj15 = (HelloClazz) context.getBean("hello clazz12");
//        ((HelloClazz) obj15).printMessage();
//        System.out.println(obj15);
        HelloWord obj16 = (HelloWord) context.getBean("helloWord2");
        obj16 .sayHello();
        System.out.println(obj16);

    }
}
