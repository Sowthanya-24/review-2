package com.example.review2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity

public class MuseumsModel {
@Id
private int m_id;
private String m_name;
private String m_location;
private String theme;
private String gallery_name;
private String artifact_name;
private int objects;
private String staff;
private int check_in;
private int check_out;
public String getM_name() {
	return m_name;
}
public void setM_name(String m_name) {
	this.m_name = m_name;
}
public int getM_id() {
	return m_id;
}
public void setM_id(int m_id) {
	this.m_id = m_id;
}
public String getM_location() {
	return m_location;
}
public void setM_location(String m_location) {
	this.m_location = m_location;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
public String getGallery_name() {
	return gallery_name;
}
public void setGallery_name(String gallery_name) {
	this.gallery_name = gallery_name;
}
public String getArtifact_name() {
	return artifact_name;
}
public void setArtifact_name(String artifact_name) {
	this.artifact_name = artifact_name;
}
public int getObjects() {
	return objects;
}
public void setObjects(int objects) {
	this.objects = objects;
}
public String getStaff() {
	return staff;
}
public void setStaff(String staff) {
	this.staff = staff;
}
public int getCheck_in() {
	return check_in;
}
public void setCheck_in(int check_in) {
	this.check_in = check_in;
}
public int getCheck_out() {
	return check_out;
}
public void setCheck_out(int check_out) {
	this.check_out = check_out;
}

}
