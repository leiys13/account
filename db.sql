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
	parent_id bigint(20) default 0,
	user_id bigint(20) default 0,
	type tinyint(2) default 0,
	code varchar(200) default null,
	level tinyint(4) default 0,
	sort tinyint(4) default 0,
	hasChild bit default 0,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_consume AUTO_INCREMENT=11328156;

CREATE TABLE account_way (
	id bigint(20) primary key AUTO_INCREMENT,
	name varchar(30) default null,
	parent_id bigint(20) default 0,
	user_id bigint(20) default 0,
	type tinyint(2) default 0,
	sort tinyint(4) default 0,
	hasChild bit default 0,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_method AUTO_INCREMENT=11328156;

CREATE TABLE account_record (
	id bigint(20) primary key AUTO_INCREMENT,
	rdate date default null,
	user_id bigint(20) default 0,
	consume_id bigint(20) default 0,
	way_id bigint(20) default 0,
	price decimal(20,0) default 0,
	remark varchar(200) default null,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_record AUTO_INCREMENT=11328156;
