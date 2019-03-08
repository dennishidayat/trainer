package com.enigma.task.trainer.dto;

public class TrainerDto {
	private Integer trainerId;
	private boolean activeFlag;
	private String firstName;
	private String lastName;
	private String email;
	private Integer phone;
	
	public void TraineeDto (Integer trainerId, boolean activeFlag, String firstName, String lastName, String email, Integer phone) {
		this.trainerId = trainerId;
		this.activeFlag = activeFlag;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	
	public Integer getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}

	public boolean isActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public void TraineeDto () {}
}
