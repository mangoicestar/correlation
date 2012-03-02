package com.ellipsiz.form;

import org.apache.struts.action.ActionForm;

public class form01 extends ActionForm{
	
	public String getMo_name() {
		return mo_name;
	}
	public void setMo_name(String mo_name) {
		this.mo_name = mo_name;
	}
	public String getAlarm_name() {
		return alarm_name;
	}
	public void setAlarm_name(String alarm_name) {
		this.alarm_name = alarm_name;
	}
	private String mo_name;
	private String alarm_name;

	
}