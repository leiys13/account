CREATE TABLE sys_user (
	id bigint(11) primary key AUTO_INCREMENT,
	user_name varchar(30) not null,
	nick_name varchar(30) default null,
	password varchar(50) not null,
	reg_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table sys_user AUTO_INCREMENT=11328156;

CREATE TABLE account_consume (
	id bigint(20) primary key AUTO_INCREMENT,
	name varchar(30) default null,
	pid bigint(20) default 0,
	user_id bigint(20) default 0,
	code varchar(200) default null,
	level tinyint(4) default 0,
	sort tinyint(4) default 0,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_consume AUTO_INCREMENT=11328156;

CREATE TABLE account_method (
	id bigint(20) primary key AUTO_INCREMENT,
	method varchar(30) default null,
	user_id bigint(20) default 0,
	sort tinyint(4) default 0,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_method AUTO_INCREMENT=11328156;

CREATE TABLE account_record (
	id bigint(20) primary key AUTO_INCREMENT,
	rdate date default null,
	user_id bigint(20) default 0,
	cid bigint(20) default 0,
	mid bigint(20) default 0,
	price decimal(20,0) default 0,
	remark varchar(200) default null,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_record AUTO_INCREMENT=11328156;
