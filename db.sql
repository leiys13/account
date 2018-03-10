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

alter table account_way AUTO_INCREMENT=11328156;

CREATE TABLE account_record (
	id bigint(20) primary key AUTO_INCREMENT,
	rdate date default null,
	user_id bigint(20) default 0,
	consume_id bigint(20) default 0,
	way_id bigint(20) default 0,
	type tinyint(2) default 0,
	price decimal(20,0) default 0,
	remark varchar(200) default null,
	create_time datetime default null
) ENGINE = INNODB DEFAULT CHARSET = utf8;

alter table account_record AUTO_INCREMENT=11328156;

insert into account_record(rdate, user_id, consume_id, way_id, type, price, remark, create_time)
values
('2018-02-01', 1, 1, 1, 0, 1100, '深圳，', '2018-03-01 22:23:23'),
('2018-02-01', 1, 2, 1, 0, 1200, '深圳，', '2018-03-01 22:23:23'),
('2018-02-01', 1, 3, 1, 0, 1300, '深圳，', '2018-03-01 22:23:23'),
('2018-02-01', 1, 3, 1, 0, 1400, '深圳，', '2018-03-01 22:23:23'),
('2018-02-01', 1, 2, 1, 0, 1500, '深圳，', '2018-03-01 22:23:23'),
('2018-02-02', 1, 1, 1, 0, 1600, '深圳，', '2018-03-01 22:23:23'),
('2018-02-02', 1, 2, 1, 0, 1700, '深圳，', '2018-03-01 22:23:23'),
('2018-02-02', 1, 3, 1, 0, 1800, '深圳，', '2018-03-01 22:23:23'),
('2018-02-04', 1, 1, 1, 0, 1900, '深圳，', '2018-03-01 22:23:23'),
('2018-02-04', 1, 3, 1, 0, 1800, '深圳，', '2018-03-01 22:23:23'),
('2018-02-04', 1, 2, 1, 0, 1700, '深圳，', '2018-03-01 22:23:23'),
('2018-02-05', 1, 3, 1, 0, 1600, '深圳，', '2018-03-01 22:23:23'),
('2018-02-05', 1, 1, 1, 0, 1500, '深圳，', '2018-03-01 22:23:23'),
('2018-02-05', 1, 3, 1, 0, 1400, '深圳，', '2018-03-01 22:23:23'),
('2018-02-05', 1, 2, 1, 0, 1300, '深圳，', '2018-03-01 22:23:23'),
('2018-02-05', 1, 1, 1, 0, 1200, '深圳，', '2018-03-01 22:23:23'),
('2018-02-06', 1, 3, 1, 0, 1100, '深圳，', '2018-03-01 22:23:23'),
('2018-02-07', 1, 2, 1, 0, 1400, '深圳，', '2018-03-01 22:23:23'),
('2018-02-07', 1, 1, 1, 0, 1200, '深圳，', '2018-03-01 22:23:23'),
('2018-02-07', 1, 1, 1, 0, 1600, '深圳，', '2018-03-01 22:23:23'),
('2018-02-07', 1, 2, 1, 0, 1300, '深圳，', '2018-03-01 22:23:23'),
('2018-02-08', 1, 1, 1, 0, 1200, '深圳，', '2018-03-01 22:23:23'),
('2018-02-08', 1, 2, 1, 0, 1500, '深圳，', '2018-03-01 22:23:23'),
('2018-02-08', 1, 2, 1, 0, 1600, '深圳，', '2018-03-01 22:23:23'),
('2018-02-08', 1, 3, 1, 0, 1100, '深圳，', '2018-03-01 22:23:23'),
('2018-02-09', 1, 3, 1, 0, 1900, '深圳，', '2018-03-01 22:23:23'),
('2018-02-09', 1, 2, 1, 0, 1800, '深圳，', '2018-03-01 22:23:23'),
('2018-02-09', 1, 1, 1, 0, 1600, '深圳，', '2018-03-01 22:23:23'),
('2018-02-09', 1, 1, 1, 0, 1500, '深圳，', '2018-03-01 22:23:23');
