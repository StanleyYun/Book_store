package com.gsau.mapper;

import com.gsau.pojo.User;

public interface UserMapper {
    public User findByUserName(String usename);

    public void saveUser(User user);
    /*
     *  方法二：通过异常处理解决验证影响反馈
     */
    public User checkUser(String name,String password);
    /*
     *  方法二：通过异常处理解决验证影响反馈
     */
    public User checkUser1(String name);
    public void UpdateUser(User user);
}
