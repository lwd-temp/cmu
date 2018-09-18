package cn.edu.cmu.base;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIOC {

    private String springmvcFile = "springmvc.xml";
    public ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(springmvcFile);;


}
