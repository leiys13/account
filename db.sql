CREATE TABLE sys_user (
	id int(11) primary key auto_increment,
	userName varchar(30) not null,
	nickName varchar(30) default null,
	password varchar(50) not null,
	regTime datetime not null
) ENGINE = INNODB DEFAULT CHARSET = utf8;