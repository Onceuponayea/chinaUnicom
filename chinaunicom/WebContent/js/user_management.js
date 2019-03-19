/**
 * 
 */


$(function() {
	
	// 表格
	layui.use('table', function() {
		var table = layui.table;
		var keyword = $('#keyword');
		// 方法级渲染
		table.render({
			elem : '#mytab',
			url : 'docshare/findAllUser.action',
			cols : [ [ {
				field : 'rowno',
//				width : 50,
				title : '序号',
				align : 'center'
			}, {
				field : 'uid',
//				width : 120,
				title : '隐藏uid',
				align : 'center',
			// hide:true
			}, {
				field : 'name',
//				width : 120,
				title : '用户名',
				align : 'center'
			}, {
				field : 'sex',
//				width : 100,
				title : '性别',
				align : 'center',
			}, {
				fixed: 'right',
				title : '操作',
				align:'center',
				width : 250,
				toolbar: '#barDemo'
			} ] ],
			id : 'tabReload',
			page : true,
			limits:[3,5,10,30,50,100],
			limit:10,
		});
		
		
	});
});