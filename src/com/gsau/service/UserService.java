package com.gsau.service;

import com.gsau.exception.UserException;
import com.gsau.pojo.User;

public interface UserService {
    public boolean registerUser(User user);
    /*
     * 方法一：通过设置状态变量进行验证信息反馈
     */
    public boolean login(String username,String password);
    /*
     *  方法二：通过异常处理解决验证影响反馈
     */
    public User login1(String username,String password)throws UserException;
    
    public void updateUser(User user);
    
}
