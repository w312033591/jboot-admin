package io.jboot.admin.service.entity.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public void setPwd(java.lang.String pwd) {
		set("pwd", pwd);
	}
	
	public java.lang.String getPwd() {
		return getStr("pwd");
	}

	public void setStatus(java.lang.String status) {
		set("status", status);
	}
	
	public java.lang.String getStatus() {
		return getStr("status");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}
	
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}
	
	public java.lang.String getEmail() {
		return getStr("email");
	}

	public void setCreatedate(java.util.Date createdate) {
		set("createdate", createdate);
	}
	
	public java.util.Date getCreatedate() {
		return get("createdate");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public void setSalt2(java.lang.String salt2) {
		set("salt2", salt2);
	}
	
	public java.lang.String getSalt2() {
		return getStr("salt2");
	}

	public void setOnlineStatus(java.lang.String onlineStatus) {
		set("onlineStatus", onlineStatus);
	}
	
	public java.lang.String getOnlineStatus() {
		return getStr("onlineStatus");
	}

	public void setLastUpdAcct(java.lang.String lastUpdAcct) {
		set("lastUpdAcct", lastUpdAcct);
	}
	
	public java.lang.String getLastUpdAcct() {
		return getStr("lastUpdAcct");
	}

	public void setLastUpdTime(java.util.Date lastUpdTime) {
		set("lastUpdTime", lastUpdTime);
	}
	
	public java.util.Date getLastUpdTime() {
		return get("lastUpdTime");
	}

	public void setNote(java.lang.String note) {
		set("note", note);
	}
	
	public java.lang.String getNote() {
		return getStr("note");
	}

}
