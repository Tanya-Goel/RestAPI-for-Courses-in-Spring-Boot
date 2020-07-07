package com.example.demo.entities;

public class Courses {
 private long id;
 public String title;
 public String description;
 
 
public Courses(long id,String title,String description)
{
	super();
	this.id=id;
	this.title=title;
	this.description=description;
}


public Courses()
{
	super();
}

@Override
public String toString() {
	return "Courses [id=" + id + ", title=" + title + ", description=" + description + ", getId()=" + getId()
			+ ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}


}

