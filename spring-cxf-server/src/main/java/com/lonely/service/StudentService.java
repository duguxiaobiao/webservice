package com.lonely.service;

import com.lonely.pojo.Student;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;

/**
 * Created by 15072 on 2018/6/27.
 */
@WebService(
        targetNamespace="http://student.ws.com/",//指定 wsdl的命名空间
        name="StudentInterface",//指定portType的名称
        portName="StudentInterfacePort",//指定port的名称
        serviceName="StudentService"//服务视图的名称
)
@BindingType(javax.xml.ws.soap.SOAPBinding.SOAP12HTTP_BINDING)
public interface StudentService {

    /**
     * 查询指定名字的学生列表
     * @param name
     * @return
     */
    @WebResult(name="student") Student findByName(@WebParam(name = "name") String name);

}
