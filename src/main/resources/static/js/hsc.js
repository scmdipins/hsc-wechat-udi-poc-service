$(function() {
	
	var redirectToUDIUrl = '';
	
	function goHSCServer() {
    	$.ajax({
    		type: 'POST',
    		url: "",
    		contentType: false,
    		processData: false,
    		cache: false,
    		success: function(data){
    			if (data.success) {
    				wx.miniProgram.navigateTo({url: '../udi/udi'}) 
    			} else {
    				$.toast('跳转失败');
    			}
    		}
    	})
    }
}