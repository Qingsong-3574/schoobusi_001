package com.chinauni.pengtw5.dao;

import com.chinauni.pengtw5.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserJpa extends JpaRepository<User,Integer> {

    @Query(value = "select id ,name,city,oa,province,role,password from t_user where name =?",nativeQuery = true)
    public  User queryUserByName(String name );

}
