package com.gsau.service;

import com.gsau.exception.UserException;
import com.gsau.pojo.User;

public interface UserService {
    public boolean registerUser(User user);
    /*
     * ����һ��ͨ������״̬����������֤��Ϣ����
     */
    public boolean login(String username,String password);
    /*
     *  ��������ͨ���쳣��������֤Ӱ�췴��
     */
    public User login1(String username,String password)throws UserException;
    
    public void updateUser(User user);
    
}
