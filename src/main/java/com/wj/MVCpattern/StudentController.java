package com.wj.MVCpattern;

public class StudentController {
    Student model;
    StudentView view;
    
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setStudentName(String name) {
        model.setName(name);
    }
    
    public String getStudentName(){
        return model.getName();
    }
    
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }
    
    public String getStudentRollNo() {
        return model.getRollNo();
    }
    
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
