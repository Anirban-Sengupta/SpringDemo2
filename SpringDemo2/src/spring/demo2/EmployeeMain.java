package spring.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("EmployeeXml.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		Employee emp = (Employee)fac.getBean("employee");
		emp.DisplayInfo();

	}
}
