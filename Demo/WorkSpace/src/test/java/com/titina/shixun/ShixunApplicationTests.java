package com.titina.shixun;

import com.titina.shixun.bean.UserBean;
import com.titina.shixun.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShixunApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads()
    {
        UserBean userBean = userService.loginIn("解忧杂货店","东野圭吾");
        System.out.println("ID为：---"+userBean.getId());
    }

}
