package com.study.hj.web.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name="user")

/*
* jpa 설정 위한 테스트 클래스
* */
public class User {

	public User() {
	}

	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //키 생성을 DB에 위임, null이 들어가도 자동 증가됨
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private String phone;


	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}
}
