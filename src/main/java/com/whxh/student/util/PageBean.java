package com.whxh.student.util;

/**
 * Created By IDEA
 *
 * @Author: YJ
 * @Date: 2020/2/7
 * @Time: 9:59
 **/
//分页要素：当前页、每页条数
public class PageBean {
  private int pageNum;//当前页
  private int pageSize=5;//每页条数

 //搜索条件
 private String name;//学生姓名
 private String classid;//班级编号
 private String teacher;//老师姓名
 private Integer scoreFrom;  //最低分数
 private Integer scoreTo;  //最高分数

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getClassid() {
  return classid;
 }

 public void setClassid(String classid) {
  this.classid = classid;
 }

 public String getTeacher() {
  return teacher;
 }

 public void setTeacher(String teacher) {
  this.teacher = teacher;
 }

 public Integer getScoreFrom() {
  return scoreFrom;
 }

 public void setScoreFrom(Integer scoreFrom) {
  this.scoreFrom = scoreFrom;
 }

 public Integer getScoreTo() {
  return scoreTo;
 }

 public void setScoreTo(Integer scoreTo) {
  this.scoreTo = scoreTo;
 }

 public int getPageNum() {
  return pageNum;
 }

 public void setPageNum(int pageNum) {
  this.pageNum = pageNum;
 }

 public int getPageSize() {
  return pageSize;
 }

 public void setPageSize(int pageSize) {
  this.pageSize = pageSize;
 }

 @Override
 public String toString() {
  return "PageBean{" +
   "pageNum=" + pageNum +
   ", pageSize=" + pageSize +
   '}';
 }
}
