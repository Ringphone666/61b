 public class TestDemo {
    public static void main(String args[]) {
        Student stu = new Student(); // 实例化的是子类
        stu.setName("张三"); // Person类定义
        stu.setAge(20); // Person类定义
        System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
    }
}