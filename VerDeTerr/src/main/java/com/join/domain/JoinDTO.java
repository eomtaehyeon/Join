package com.join.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDTO {

	/** 아이디 (PK) */
	private String id;

	/** 비밀번호 */
	private String pw;

	/** 비밀번호 힌트 */
	private String pwHint;

	/** 이메일 */
	private String email;

	/** 닉네임 */
	private String nickname;

	/** 나이 */
	private String age;

	/** 성별 */
	private String gender;

	/** 성격유형 */
	private String userType;

	/** 관리자 여부 */
	private Boolean mangerYn;

	/** 등록일 */
	private LocalDateTime regDate;
	
}
