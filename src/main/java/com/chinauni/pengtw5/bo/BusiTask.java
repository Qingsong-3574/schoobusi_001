package com.chinauni.pengtw5.bo;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_busiactivy")
public class BusiTask {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="begintime",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date begintime;

    @Column(name="endtime",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date endtime;

    @Column(name="school")
    private String school;


    @Column(name="target")
    private String target;

    @Column(name="activityid")
    private String activityid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getActivityid() {
        return activityid;
    }

    public void setActivityid(String activityid) {
        this.activityid = activityid;
    }
}
