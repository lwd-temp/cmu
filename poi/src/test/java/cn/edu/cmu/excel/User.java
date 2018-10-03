package cn.edu.cmu.excel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: jshand
 * @Date: 2018/10/2 21:06
 * @site https://github.com/jshand
 * @Project cmu
 * @Version 1.0
 */
public class User {

    private String id;
    private String userName;
    private Integer age;
    private Date birthDay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User() {
    }

    public User(String id, String userName, Integer age, Date birthDay) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }

    public static void main(String[] args) {
        List<User> data = new ArrayList();

        data.add(new User("001", "admin1", 18, new Date()));
        data.add(new User("201", "admin2", 28, new Date(2018,9,20)));
        data.add(new User("301", "admin3", 38, new Date(2019,8,21)));
        data.add(new User("401", "admin4", 48, new Date(2020,7,22)));
        data.add(new User("501", "admin5", 58, new Date(2021,6,23)));


        User user = data.get(0);
        Date birthday = user.getBirthDay();

        System.out.println(birthday instanceof  Date);
    }
}
