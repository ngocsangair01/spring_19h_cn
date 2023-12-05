package com.example.buoi1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //getter
@Setter //setter
@NoArgsConstructor // hàm khởi tạo không đối số
@AllArgsConstructor // hàm khởi tạo tất cả đối số
public class UserDemo {
    private Long id;
    private String name;
    private Integer age;
    private String phoneNumber;

    public UserDemo(String name) {
        this.name = name;
    }
    //    public UserDemo() {
//    }
//
//    public UserDemo(String name, Integer age, String phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
}
