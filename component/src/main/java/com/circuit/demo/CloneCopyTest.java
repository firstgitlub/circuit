package com.circuit.demo;

public class CloneCopyTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        Address address = new Address("杭州", "中国");
        User user = new User("大山", address);

        // 调用clone()方法进行深拷贝
        User copyUser = user.clone();

        // 修改源对象的值
        user.getAddress().setCity("深圳");

        // 检查两个对象的值不同
        assertNotSame(user.getAddress().getCity(), copyUser.getAddress().getCity());


        Address addressCopy = address.clone();

        addressCopy.setCity("深圳1");
        System.out.println(address.getClass()+"====="+addressCopy.getClass());
    }
    public static boolean assertNotSame(String s1,String s2){
        return s1.equals(s2);
    }
}
