# IOC

## IOC操作Bean管理

### 基于xml方式

#### 基于xml方式创建对象

```xml
<bean id="user" class="com.shaoyx.spring5.User"></bean>
```

1. 在spring配置文件中，使用bean标签，标签里面添加对应属性，就可以实现对象创建
2. 在bean标签有很多属性，常见属性如下：
   - id：唯一标识
   - class：类的全路径（包类路径）
3. 创建对象时，默认也是执行无参构造方法

#### 基于xml方式注入属性

1. DI：依赖注入，就是注入属性

   - 使用set方法进行注入

     *Book.java*

     ```java
     public class Book {
         private String bookName;
         
         public Book() {
         }
         
         public void setBookName(String bookName) {
             this.bookName = bookName;
         }
         
         public void testDemo() {
             System.out.println(bookName + "::" + bookAuthor);
         }
     }
     ```

     *bean1.xml*

     ```xml
     <bean id="book" class="com.shaoyx.spring5.Book">
         <!--使用property完成属性注入
             name:类里面的属性名称
             value:向属性注入值-->
         <property name="bookName" value="本草科目"></property>
         <property name="bookAuthor" value="李时珍"></property>
     </bean>
     ```

     *TestSpring5Test.java*

     ```java
     public class TestSpring5Test {
         
         @Test
         public void testBook1() {
             ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
             Book book = context.getBean("book1", Book.class);
             System.out.println(book);
             book.testDemo();        
         }
     }
     ```

   - *有参构造注入*

     *Orders.java*

     ```java
     public class Orders {
         private String ordersName;
         private String address;
     
     
         public Orders(String ordersName, String address) {
             this.ordersName = ordersName;
             this.address = address;
         }
     
         public void ordersTest() {
             System.out.println(ordersName + "::" + address);
         }
     }
     ```

     *bean1.xml*

     ```xml
     <!--    3.使用有参构造注入属性-->
     <bean id="orders" class="com.shaoyx.spring5.Orders">
         <constructor-arg name="ordersName" value="电脑"></constructor-arg>
         <constructor-arg name="address" value="China"></constructor-arg>
     </bean>
     ```

     *TestSpring5Test.java*

     
     
     

### 基于注解方式实现



