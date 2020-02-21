package com.mentor.model;

import java.util.Date;

public class TrainingDetails {
	int trainingDetailsId;
	String status;
	int progress;
	float fees;
	float commissionAmount;
	int rating;
	Date startDate;
	Date endDate;
	Date startTime;
	Date endTime;
	float amountReceived;
	int userId;
	int mentorId;
	int skillId;
	public int getTrainingDetailsId() {
		return trainingDetailsId;
	}
	public void setTrainingDetailsId(int trainingDetailsId) {
		this.trainingDetailsId = trainingDetailsId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public float getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(float commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public float getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(float amountReceived) {
		this.amountReceived = amountReceived;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMentorId() {
		return mentorId;
	}
	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}
	public int getSkillId() {
		return skillId;
	}
	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}
}
