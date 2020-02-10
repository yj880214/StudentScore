package com.whxh.student.service;

import com.whxh.student.entity.Student;
import com.whxh.student.util.PageBean;

import java.util.List;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/4
 * @Time: 10:07
 **/
public interface StuService {
 //查询所有
 public List<Student> getAllData(PageBean pageBean);
 //添加一条记录
 public void addStu(Student student);
 //删除一条记录
 public int delData(Integer id);
 //查询一条(为修改做准备)
 public Student selectOne(Integer id);
 //修改
 public void updateStu(Student student);

}
