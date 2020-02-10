package com.whxh.student.controller;

import com.github.pagehelper.PageInfo;
import com.whxh.student.entity.Student;
import com.whxh.student.service.StuService;
import com.whxh.student.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/4
 * @Time: 10:12
 **/
@Controller  //目的将对象交给spring管理
public class StuController {
  @Autowired  //自动注入,从spring获取对象
  private StuService stuService;
 //查询所有信息(未分页)
 @RequestMapping("/getScore")
 public String getScore(Model model, PageBean pageBean){ //访问修饰符、返回类型、方法名(参数)、方法体
  //调用业务
  List<Student> studentList = stuService.getAllData(pageBean);
  //目的展示数据--页面（先要将数据给页面或者页面能够拿到数据：通过域获取)
  PageInfo pageInfo=new PageInfo(studentList);
  //将数据放到域中
  // model.addAttribute("studentList",studentList);
  model.addAttribute("pageBean",pageBean);
  model.addAttribute("pageInfo",pageInfo);
  //返回页面
  return "student";
 }

  //查询所有信息(未分页)
 /*@RequestMapping("/getScore")
 public String getScore(Model model){ //访问修饰符、返回类型、方法名(参数)、方法体
    //调用业务
  List<Student> studentList = stuService.getAllData();
  //目的展示数据--页面（先要将数据给页面或者页面能够拿到数据：通过域获取)
  //将数据放到域中
  model.addAttribute("studentList",studentList);
  //返回页面
  return "student";
 }*/
   //添加信息
   @RequestMapping("/addStu")
  public String addStu(Student student){
     //调用业务添加功能
      stuService.addStu(student);
      //重定向  （上一步完成了操作-添加数据，同时还要展示-查询）
      return "redirect:getScore";
   }
   //删除一条信息
   @RequestMapping("/deleteStu")
   public String deleteStu(Integer id){
       //调用业务功能：删除功能
    int i = stuService.delData(id);
    System.out.println("i=" + i);
    return "redirect:getScore";
   }
  //修改  ：1 查询一条展示
   @RequestMapping("/selectOne")
  public String selectOne(Integer id,Model model){
    //调用业务
    Student student = stuService.selectOne(id);
    //将查询到信息放到域中
    model.addAttribute("obj",student);
    return "edit";
   }
   //修改：2 修改执行 update
   @RequestMapping("/uddateStu")
   public String uddateStu(Student student){
     //调用业务：实现修改（更新数据）
     stuService.updateStu(student);
     //回到展示信息页面(调用一次查询业务：重定向)
     return "redirect:/getScore";
   }

}
