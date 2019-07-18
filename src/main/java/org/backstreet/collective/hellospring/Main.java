package org.backstreet.collective.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring-config.fxml");

        context.getBean("helloSetter", HelloBean.class).play();

        context.getBean("helloConstructor", HelloBean.class).play();

    }

}
