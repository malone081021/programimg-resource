package com.malone.hello;
import com.malone.hello.mapper.CustomerMapper;
import com.malone.hello.mapper.UserMapper;
import com.malone.hello.model.Customer;
import com.malone.hello.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Resource
    private CustomerMapper customerMapper;


    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void createCustomer() {
        Customer customer = new Customer();
        customer.setId(555555555);
        customer.setPhone("18810609622");
        customer.setName("4444444444400");
        customer.setCt(new Date());
        int count = customerMapper.insert(customer);
        Assert.assertEquals(1, count);
        System.out.println(count);
    }

}
