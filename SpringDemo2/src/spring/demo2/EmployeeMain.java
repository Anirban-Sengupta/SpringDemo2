package spring.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {

	public static void main(String[] args) {
		/*Resource res = new ClassPathResource("EmployeeXml.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		Employee emp = (Employee)fac.getBean("employee");*/
		ClassPathXmlApplicationContext res = new ClassPathXmlApplicationContext("EmployeeXml.xml");
		Employee emp = (Employee)res.getBean("employee");
		emp.DisplayInfo();

	}
}
