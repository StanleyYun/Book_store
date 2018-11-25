package com.gsau.dao;

import com.gsau.pojo.User;

public interface UserDao {
    public User findByUserName(String usename);

    public void saveUser(User user);
    /*
     * ����һ��ͨ������״̬����������֤��Ϣ����
     */
    public User checkUser(String name,String password);
    /*
     *  ��������ͨ���쳣��������֤Ӱ�췴��
     */
    public User checkUser(String name);
    
    public void UpdateUser(User user);
}
