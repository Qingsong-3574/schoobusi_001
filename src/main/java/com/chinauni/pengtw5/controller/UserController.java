package com.chinauni.pengtw5.controller;

import com.chinauni.pengtw5.bo.BusiActivity;
import com.chinauni.pengtw5.bo.User;
import com.chinauni.pengtw5.dao.BusiActJpa;
import com.chinauni.pengtw5.dao.UserJpa;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserJpa userJpa;

    @Autowired
    BusiActJpa busiActJpa;

    @RequestMapping("/loginPage")
    public ModelAndView login(){

            return new ModelAndView("/busi/login");

    }
    @RequestMapping("/login")
    public ModelAndView tologin(@RequestParam(name="name") String name,@RequestParam(name="password") String password){

        User user=this.userJpa.queryUserByName(name);

        System.out.println("---------------------");
        if(password.equals(user.getPassword())) {
            Map<String,Object> map= new HashMap<>();
            map.put("role",user.getRole());
            System.out.println("---------------------"+user.getRole());
            return new ModelAndView("/busi/createUser",map);
        }else {
            return new ModelAndView("/busi/fail");
        }
    }

    @RequestMapping("/addUserPage")
    public ModelAndView toCreateUser(String name){

        User user=this.userJpa.queryUserByName(name);
        Map<String,Object> map=new HashMap<>();
        map.put("role",user.getRole());
        return new ModelAndView("/busi/createUser",map);
    }
    @RequestMapping("/adduser")
    public ModelAndView adduser(@RequestParam(name="name") String name , String oa, String tel, String province, String city, String role){
        System.out.println("role"+role);
        User user=new User();
        user.setName(name);
        user.setOa(oa);
        user.setProvince(province);
        user.setRole(role);
        user.setCity(city);
        this.userJpa.save(user);
        return new ModelAndView("/busi/success");
    }

    @RequestMapping(value = "/createbusiact",method = RequestMethod.GET)
    public ModelAndView createbusiact( String role){
        Map<String,Object> map =new HashMap<>();
        map.put("role" ,"1");
        System.out.println("role=="+role);
        return new ModelAndView("/busi/activity",map);

    }

    @RequestMapping("/addActivity")
    public ModelAndView adduser(@RequestParam(name="name") String name , @RequestParam(name="begintime") String begintime,  @RequestParam(name="endtime")  String endtime, @RequestParam(name="city") String city, @RequestParam(name="target") String target){
        System.out.println("role"+begintime);
        BusiActivity ba=new BusiActivity();

        SimpleDateFormat sdf=new SimpleDateFormat("yyyymmddhhmmss");
        Date begintime1=null;
        Date endtime1=null;
        try {
            begintime1= sdf.parse(begintime);
             endtime1= sdf.parse(endtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ba.setBegintime(begintime1);
        ba.setCity(city);
        ba.setEndtime(endtime1);
        ba.setName(name);
        ba.setTarget(target);
        busiActJpa.save(ba);
        return new ModelAndView("/busi/success");
    }

    @RequestMapping("/actiList")
    public ModelAndView actiList(){
        List<BusiActivity> ba= this.busiActJpa.findAll();
        Map<String,Object> map =new HashMap<>();
        map.put("content",ba);
        map.put("role","1");
        return new ModelAndView("/busi/activityList",map);
    }

}
