package com.gsau.service.servceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsau.dao.UserDao;
import com.gsau.exception.UserException;
import com.gsau.pojo.User;
import com.gsau.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public boolean registerUser(User user) {
		boolean b=false;
		User users=userDao.findByUserName(user.getUsername());
		if(users==null){
			userDao.saveUser(user);
			b=true;
		}else{
			b=false;
		}
		return b;
	}
	/*
	 * ����һ��ͨ������״̬����������֤��Ϣ����
	 */
	@Override
	public boolean login(String username, String password) {
		boolean b = false;
		User u = userDao.checkUser(username, password);
		if(u != null){
			b = true;
		}
		return b;
	}
	/*
	 *  ��������ͨ���쳣��������֤Ӱ�췴��
	 */
	@Override
	public User login1(String username,String pwd) throws UserException {
		User u = null;
		try {
			u = userDao.checkUser(username);
			if(u == null){
				throw new Exception("�û���������");
			}
			if(!pwd.equals(u.getPassword())){
				throw new Exception("�����������������");
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new UserException(e.getMessage());
		}
		return u;
	}
	public void updateUser(User user) {
		userDao.UpdateUser(user);
	}
}
