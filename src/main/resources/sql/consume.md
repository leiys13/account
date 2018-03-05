分类表操作

最大的code

findMaxCodeByParentId
===

	select max(code) from account_consume
	where 
	type = #type# and parent_id = #parentId#
	
	
上级分类有多少个子分类

countByParentId
===

	select count(0) from account_consume
	where
	parent_id = #parentId#