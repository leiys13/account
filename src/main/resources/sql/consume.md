分类表操作

最大的code

findMaxCodeByParentId
===

	select max(code) from account_consume
	where 
	type = #type# and parent_id = #parentId#