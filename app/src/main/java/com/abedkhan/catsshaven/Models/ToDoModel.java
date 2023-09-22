package com.abedkhan.catsshaven.Models;

public class ToDoModel {
    public String todoTitle,todoTime,todoStatus;
    public int todoImg,todoPriority;


    public ToDoModel(String todoTitle, String todoTime, String todoStatus, int todoImg, int todoPriority) {
        this.todoTitle = todoTitle;
        this.todoTime = todoTime;
        this.todoStatus = todoStatus;
        this.todoImg = todoImg;
        this.todoPriority = todoPriority;
    }

    public  ToDoModel (){

    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoTime() {
        return todoTime;
    }

    public void setTodoTime(String todoTime) {
        this.todoTime = todoTime;
    }

    public String getTodoStatus() {
        return todoStatus;
    }

    public void setTodoStatus(String todoStatus) {
        this.todoStatus = todoStatus;
    }

    public int getTodoImg() {
        return todoImg;
    }

    public void setTodoImg(int todoImg) {
        this.todoImg = todoImg;
    }

    public int getTodoPriority() {
        return todoPriority;
    }

    public void setTodoPriority(int todoPriority) {
        this.todoPriority = todoPriority;
    }
}
