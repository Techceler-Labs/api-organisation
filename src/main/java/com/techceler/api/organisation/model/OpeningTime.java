package com.techceler.api.organisation.model;

public class OpeningTime {

	private String opening;
	private String closing;
	private DayEnum day;

	public OpeningTime(final String opening,final String closing,final DayEnum day) {
		this.opening = opening;
		this.closing = closing;
		this.day = day;
	}
	
	public String getOpening() {
		return opening;
	}
	public void setOpening(final String opening) {
		this.opening = opening;
	}
	public String getClosing() {
		return closing;
	}
	public void setClosing(final String closing) {
		this.closing = closing;
	}
	public DayEnum getDay() {
		return day;
	}
	public void setDay(final DayEnum day) {
		this.day = day;
	}
	
}
