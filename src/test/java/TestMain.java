import com.qf.hua.spring.bean.Product;
import com.qf.hua.spring.bean.User;
import com.qf.hua.spring.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        String path = "classpath:spring-context.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
        /*user这个是bean里面的id*/
        /*这个要进行强转*/
        /*Object user1 = context.getBean("user");*/
        /*User user = context.getBean("user", User.class);
        User user1 = context.getBean("user", User.class);
        *//*注册完毕拿到hash值并打印出来*//*
        *//*单例模式打印出来的是一个对象，普通模式的时候打印出来就不是一个对象*//*
        System.out.println(user.toString());
        System.out.println(user1.toString());
        //关闭容器之后，回收方法自动执行
        context.close();*/

        Product product = context.getBean("product", Product.class);
        System.out.println(product.toString());

        UserController userController = context.getBean("userController", UserController.class);
        System.out.println(userController);
        System.out.println(userController.userService);

    }
}
