package reflect2;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author Will_Lee
 * @date 2019/12/30 - 10:28
 */
public class reflectTest {
    public static void main(String[] args) throws Exception{
        //1加载配置文件
        //1.1创建Properties对象
        Properties pro = new Properties();
        //1.2获取类加载器
        ClassLoader classloader = reflectTest.class.getClassLoader();
        InputStream is = classloader.getResourceAsStream("pro2.properties");
        pro.load(is);
        //1.3获取配置文件中的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //2加载该类进内存    反射
        Class <?> clazz = Class.forName(className);
        //3获取方法
        Method method = clazz.getMethod(methodName);
        //4执行方法
        Object o = clazz.newInstance();
        method.invoke(o);

    }
}
