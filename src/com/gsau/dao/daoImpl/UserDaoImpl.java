package com.gsau.dao.daoImpl;


import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gsau.common.MyBatisSqlSessionFactory;
import com.gsau.dao.UserDao;
import com.gsau.mapper.UserMapper;
import com.gsau.pojo.User;
@Repository
public class UserDaoImpl implements UserDao{

    @Override
    public User findByUserName(String username) {
	User user=null;
	try {
	    SqlSession session = MyBatisSqlSessionFactory.openSession();
	    UserMapper mapper=session.getMapper(UserMapper.class);
	     user=mapper.findByUserName(username);
	} catch (Exception e) {
	    // TODO: handle exception
	    e.printStackTrace();
	}
	return user;
    }

    @Override
    public void saveUser(User user) {
	try {
	    
	    SqlSession session = MyBatisSqlSessionFactory.openSession();
	    UserMapper mapper=session.getMapper(UserMapper.class);
	    mapper.saveUser(user);
	    session.commit();
	} catch (Exception e) {
	    // TODO: handle exception
	    e.printStackTrace();
	}
    }
    /*
     * 方法一：通过设置状态变量进行验证信息反馈所对应的验证方法
     */
    public User checkUser(String name,String password){
	 User u=null;
	       SqlSession session = MyBatisSqlSessionFactory.openSession();
	       UserMapper mapper=session.getMapper(UserMapper.class);
	       u=mapper.checkUser(name, password);
	return u; 
    }
    /*
     *  //方法二：通过异常处理解决验证影响反馈
     */
    public User checkUser(String name){
	 User u=null;
	  
	       SqlSession session = MyBatisSqlSessionFactory.openSession();
	       UserMapper mapper=session.getMapper(UserMapper.class);
	       u=mapper.checkUser1(name);
	return u; 
   }

    @Override
    public void UpdateUser(User user) {
	SqlSession session=MyBatisSqlSessionFactory.openSession();
	UserMapper mapper=session.getMapper(UserMapper.class);
	mapper.UpdateUser(user);
	session.commit();
    }
}
