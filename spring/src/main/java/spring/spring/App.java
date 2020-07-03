package spring.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testbean.MySpringBeanWithDependency;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
                "beandefinition.xml");
        BeanFactory factory = context;
        MySpringBeanWithDependency test = (MySpringBeanWithDependency) factory
                .getBean("mySpringBeanWithDependency");
        test.run();
    }
}
