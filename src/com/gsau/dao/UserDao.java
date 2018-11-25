package com.gsau.dao;

import com.gsau.pojo.User;

public interface UserDao {
    public User findByUserName(String usename);

    public void saveUser(User user);
    /*
     * 方法一：通过设置状态变量进行验证信息反馈
     */
    public User checkUser(String name,String password);
    /*
     *  方法二：通过异常处理解决验证影响反馈
     */
    public User checkUser(String name);
    
    public void UpdateUser(User user);
}
