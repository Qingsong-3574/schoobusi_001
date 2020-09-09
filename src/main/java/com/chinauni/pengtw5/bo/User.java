package com.chinauni.pengtw5.bo;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="t_user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="oa")
    private String oa;
    @Column(name="province")
    private String province ;
    @Column(name="city")
    private  String city;
    @Column(name="password")
    private  String password;

    @Column(name="role")
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

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

    public String getOa() {
        return oa;
    }

    public void setOa(String oa) {
        this.oa = oa;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", oa='" + oa + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
