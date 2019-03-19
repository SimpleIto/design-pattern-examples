package structural.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogHandler implements InvocationHandler {
    private Object obj;

    public LogHandler(Object obj) {
        this.obj = obj;
    }

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoke Time："+dateFormat.format(new Date(System.currentTimeMillis())).toString());
        return method.invoke(obj,args);
    }
}
