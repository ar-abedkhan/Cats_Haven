package com.abedkhan.catsshaven.Models;

public class SubjectModel {

    String subjectName,subjectDescription;
            int subjectId,subjectImg;

    public SubjectModel(String subjectName, String subjectDescription, int subjectId, int subjectImg) {
        this.subjectName = subjectName;
        this.subjectDescription = subjectDescription;
        this.subjectId = subjectId;
        this.subjectImg = subjectImg;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectDescription() {
        return subjectDescription;
    }

    public void setSubjectDescription(String subjectDescription) {
        this.subjectDescription = subjectDescription;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(int subjectImg) {
        this.subjectImg = subjectImg;
    }
}
