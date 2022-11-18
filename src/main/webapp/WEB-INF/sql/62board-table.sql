CREATE DATABASE prj1;
USE prj1;
CREATE TABLE Board (
	id INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(255) NOT NULL,
    content VARCHAR(1000) NOT NULL
);

-- 작성자 컬럼 추가
SELECT * FROM Board ORDER BY 1 DESC;
ALTER TABLE Board
ADD COLUMN writer VARCHAR(255) NOT NULL;

-- 작성일시 컬럼 추가
ALTER Table Board
ADD COLUMN inserted DATETIME NOT NULL DEFAULT NOW();

-- 권한 테이블 만들기
CREATE TABLE Authority(
	memberId VARCHAR(255) NOT NULL REFERENCES Member(id),
    auth VARCHAR(255) NOT NULL,
    PRIMARY KEY (memberId, auth)
);

INSERT INTO Authority (memberId, auth)
VALUES ('admin', 'admin');	

SELECT * FROM Authority;

SELECT 
		id,
		nickName,
		password,
		email,
		inserted,
        a.auth
	FROM
		Member
	WHERE
		id = #{id}
	










