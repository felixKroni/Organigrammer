/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Date;

/**
 *
 * @author felix
 */
public class Skills {
    private String elementarySchool;
    private String secoundarySchool;
    private String college;
    private String educations;
    private double yearsOfWorkExperience;
    private String[] certifikates;
    private Date[] expireDate;

    public void setCollege(String college) {
        this.college = college;
    }

    public void setEducations(String educations) {
        this.educations = educations;
    }

    public void setYearsOfWorkExperience(double yearsOfWorkExperience) {
        this.yearsOfWorkExperience = yearsOfWorkExperience;
    }

    public void setCertifikates(String[] certifikates) {
        this.certifikates = certifikates;
    }

    public void setExpireDate(Date[] expireDate) {
        this.expireDate = expireDate;
    }



    
    
    public String getElementarySchool() {
        return elementarySchool;
    }

    public String getSecoundarySchool() {
        return secoundarySchool;
    }

    public String getCollege() {
        return college;
    }

    public String getEducations() {
        return educations;
    }

    public double getYearsOfWorkExperience() {
        return yearsOfWorkExperience;
    }

    public String[] getCertifikates() {
        return certifikates;
    }

    public Date[] getExpireDate() {
        return expireDate;
    }

    public Skills(String elementarySchool, String secoundarySchool, String college, String educations, double yearsOfWorkExperience, String[] certifikates, Date[] expireDate) {
        this.elementarySchool = elementarySchool;
        this.secoundarySchool = secoundarySchool;
        this.college = college;
        this.educations = educations;
        this.yearsOfWorkExperience = yearsOfWorkExperience;
        this.certifikates = certifikates;
        this.expireDate = expireDate;
    }

    
    
}