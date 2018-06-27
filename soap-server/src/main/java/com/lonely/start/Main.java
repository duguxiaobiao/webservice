package com.lonely.start;

import com.lonely.service.StudentService;
import com.lonely.service.impl.StudentServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by 15072 on 2018/6/27.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("WS 服务端 start~~~~~~");
        String address = "http://localhost:8090/stuService";
        StudentService studentService = new StudentServiceImpl();
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        // 设置地址
        jaxWsServerFactoryBean.setAddress(address);
        // 设置接口
        jaxWsServerFactoryBean.setServiceClass(StudentService.class);
        // 设置实现类
        jaxWsServerFactoryBean.setServiceBean(studentService);
        jaxWsServerFactoryBean.create();
        System.out.println("WS 服务端 started~~~~~~~");
    }
}
