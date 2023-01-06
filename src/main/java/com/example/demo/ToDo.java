package com.example.demo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

//static list of todos => Database (H2,mysql)
@Entity(name = "Todo")
public class ToDo {
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	@Size(min = 10, message = "Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean done;

	public ToDo() {

	}

	public ToDo(int id, String userName, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}

}
