package com.whxh.student.mapper;

import com.whxh.student.entity.Student;
import com.whxh.student.util.PageBean;

import java.util.List;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/4
 * @Time: 10:01
 **/
//也要将mapper对象交给spring管理
public interface StuMapper {
//  完整的方法包括：(接口没有方法实现，即方法体)
// 访问修饰符，返回值（类型）,方法名(,方法名可自定义，注意映射文件id绑定一起。另外注意是否传参)，方法体（花括号，接口不实现，没有）
  //查询所有学生成绩信息
  public List<Student> getAllStu(PageBean pageBean);
  //添加一条学生成绩信息：向数据库增加，告诉程序添加数据-对象
  public void addStu(Student student);
  //删除一条学生成绩信息 delete,请求(告知程序)删除哪一条信息
  int delStu(Integer id);
  //查询一条 （修改第一步，展示该条给用户修改编辑）--返回一条记录：对象
   public Student selectOne(Integer id);
   //修改执行: 明确修改的记录-对象(传参-持久化操作：入参) （访问修饰符，返回值（类型）,方法名）
   public void updateStu(Student student);
}
