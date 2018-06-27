package client;

import com.lonely.pojo.Student;
import com.lonely.service.StudentService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import java.util.List;

/**
 * Created by 15072 on 2018/6/27.
 */
public class InvokeMain {

    public static void main(String[] args) {
        //利用JaxWsProxyFactoryBean调用webService的服务端
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        //调用地址
        jaxWsProxyFactoryBean.setAddress("http://localhost:8090/stuService?wsdl");
        //获取service服务视图
        jaxWsProxyFactoryBean.setServiceClass(StudentService.class);
        //获取portType
        StudentService studentService = (StudentService) jaxWsProxyFactoryBean.create();
        //调用portType方法
        Student student = studentService.findByName("lonely");
        System.out.println(student);
    }
}
