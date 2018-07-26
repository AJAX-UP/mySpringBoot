package com.wx.project.service;

import com.wx.project.dao.IDaoUser;
import com.wx.project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private IDaoUser daoUser;

    @Override
    public User selectByPrimaryKey(Integer Id) throws Exception {
        return daoUser.selectByPrimaryKey(Id);
    }

}
