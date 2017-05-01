package com.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="price")
public @Data class Price {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) // 기본키생성
	@Column(name="seq")
	int seq;
	@Column(name="id")
	String id;
	@Column(name="item")
	String item;
	@Column(name="expense")
	Integer expense;
	@Column(name="regdate")
	Date regdate;
	
	@Override
	public String toString() {
		return "Price [seq=" + seq + ", id=" + id + ", item=" + item
				+ ", expense=" + expense + ", regdate=" + regdate + "]";
	}
}
