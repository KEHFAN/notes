package com.fkh.spring5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /*转账的方法*/
    public void accountMoney(){
        /*使用try catch模拟事务处理过程*/
        try{
            /*第一步 开启事务*/

            /*第二步 进行业务操作*/
            /*Lucy扣除100*/
            userDao.reduceMoney();

            /*模拟异常*/
            int i = 10/0;

            /*Mary增加100*/
            userDao.addMoney();

            /*第三步 没有异常发生，提交事务*/
        }catch (Exception e){
            /*第四步 出现异常，事务回滚*/
        }
    }
}
