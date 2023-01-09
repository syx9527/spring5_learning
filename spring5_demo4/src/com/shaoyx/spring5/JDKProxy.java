package com.shaoyx.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 代理类
 *
 * @author SYX
 */
public class JDKProxy {

    public static void main(String[] args) {
        //    创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 2);
        System.out.println("result:" + result);
    }
}

/**
 * 创建代理对象代码
 */
class UserDaoProxy implements InvocationHandler {
    private Object obj;

    // 1.把创建的类的代理对象，把该对象传递进来
    // 有参数的构造
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前处理
        System.out.println("方法之前执行..." + method.getName() + ":传递的参数" + Arrays.toString(args));
        // 被增强的方法执行
        Object res = method.invoke(obj, args);
        // 方法之后处理
        System.out.println("方法之后执行..." + obj + "");
        return res;
    }
}