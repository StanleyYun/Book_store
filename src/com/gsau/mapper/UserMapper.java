package com.gsau.mapper;

import com.gsau.pojo.User;

public interface UserMapper {
    public User findByUserName(String usename);

    public void saveUser(User user);
    /*
     *  ��������ͨ���쳣��������֤Ӱ�췴��
     */
    public User checkUser(String name,String password);
    /*
     *  ��������ͨ���쳣��������֤Ӱ�췴��
     */
    public User checkUser1(String name);
    public void UpdateUser(User user);
}
