package com.MicroServiceProject2.MicroServiceApp2.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Comment {
	@Id
	int cid;
	String commnet;
	String commenter;
	int pid;
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comment(int cid, String commnet, String commenter, int pid) {
		super();
		this.cid = cid;
		this.commnet = commnet;
		this.commenter = commenter;
		this.pid = pid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCommnet() {
		return commnet;
	}
	public void setCommnet(String commnet) {
		this.commnet = commnet;
	}
	public String getCommenter() {
		return commenter;
	}
	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Comment [cid=" + cid + ", commnet=" + commnet + ", commenter=" + commenter + ", pid=" + pid + "]";
	}
	
}
