统计

查询当日总数

selectTotalToday
===

	select ifnull(sum(price), 0) from account_record
	where
	rdate = CURRENT_DATE() and type = #type# and user_id = #userId#
	

查询指定日期段的总数（收入或支出）

selectTotalByTimeArea
===

	select ifnull(sum(price), 0) from account_record
	where 
	rdate between #startDate# and #endDate# and type = #type# and user_id = #userId#
	

每日总和

selectEachDayTotal
===

	select rdate as name, ifnull(sum(price), 0) as num from account_record
	where
	rdate between #startDate# and #endDate# and type = #type# and user_id = #userId#
	group by rdate order by rdate desc
	limit #start#, #size#
	
	
每个分类的总和

selectEachConsumeTotal
===

	select b.id, b.name, ifnull(sum(a.price), 0) as num from account_record a
	join account_consume b on a.consume_id = b.id
	where
	a.rdate between #startDate# and #endDate# and a.type = #type# and a.user_id = #userId#
	group by b.id 
	order by num desc
	limit #start#, #size#
	
	
总收入或支出

selectTotalAll
===

	select ifnull(sum(price), 0) from account_record
	where
	type = #type# and user_id = #userId#
	
	
总日均收入或支出

selectAvgAll
===

	select ifnull(sum(price),0)/(timestampdiff(day,min(rdate),current_date())+1) from account_record
	where
	type = #type# and user_id = #userId#
	
	
每月总收入或支出

selectMonthTotal
===
	
	select date_format(rdate, '%Y-%m') as name, ifnull(sum(price), 0) num from account_record
	where
	type = #type# and user_id = #userId#
	group by name
	order by name desc
	limit #start#, #size#
	
	
每年总收入或支出

selectYearTotal
===
	
	select date_format(rdate, '%Y') as name, ifnull(sum(price), 0) num from account_record
	where
	type = #type# and user_id = #userId#
	group by name
	order by name desc
	limit #start#, #size#
	