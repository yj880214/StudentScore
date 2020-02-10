package com.whxh.student.service;

import com.github.pagehelper.PageHelper;
import com.whxh.student.entity.Student;
import com.whxh.student.mapper.StuMapper;
import com.whxh.student.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/4
 * @Time: 10:08
 **/

@Service //目的将对象交给spring管理
public class StuServiceImpl implements  StuService {
  @Autowired  //自动注入,从spring获取对象
   private StuMapper stuMapper;

  //查询所有信息
   @Override
   public List<Student> getAllData(PageBean pageBean) {

//    开启分页
    PageHelper.startPage(pageBean.getPageNum(),pageBean.getPageSize());

    return stuMapper.getAllStu(pageBean);
//   return stuMapper.getAllStu();
 }
//添加一条学生信息
 @Override
 public void addStu(Student student) {
    stuMapper.addStu(student);
 }

 @Override
 public int delData(Integer id) {
    //调用mapper实现删除
  return stuMapper.delStu(id);
 }

 @Override
 public Student selectOne(Integer id) {
  return stuMapper.selectOne(id);
 }

 @Override
 public void updateStu(Student student) {
    stuMapper.updateStu(student);
 }
}
