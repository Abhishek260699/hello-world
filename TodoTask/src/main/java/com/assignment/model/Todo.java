package com.assignment.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class Todo {
	@Id
	@GeneratedValue
	@Column(name = "task_no")
	private int taskNo;
	@Column(name = "task_name")
	private String taskName;

	public int getTaskNo() {
		return taskNo;
	}

	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Todo() {
	}

	@Override
	public String toString() {
		return "Task [taskNo=" + taskNo + ", taskName=" + taskName + " ]";
	}

}
