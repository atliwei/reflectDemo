package reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 16:50
 */
public class reflectDemo {
    public static void main(String[] args) throws Exception{
        //1在程序中加载读取配置文件
        //1.1创建properties对象
        Properties pro = new Properties();
        //1.2获取classloader
        ClassLoader classloader = reflectDemo.class.getClassLoader();
        //1.3获取配置文件的路径
        InputStream is = classloader.getResourceAsStream("pro.properties");
        pro.load(is);
        //1.4读取配置文件
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //2用反射技术来加载进内存
        Class<?> clazz = Class.forName(className);
        //3获取方法
        Method method = clazz.getMethod(methodName);
        //4执行方法
        Object o = clazz.newInstance();
        method.invoke(o);
        System.out.println("456");

    }
}
