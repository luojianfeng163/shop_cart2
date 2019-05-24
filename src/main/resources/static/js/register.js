
function check(){
		var emailTest=/^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$/;
		var username=document.getElementById("username").value;
		var password=document.getElementById("password").value;
		var Rpassword=document.getElementById("Rpassword").value;
		var email=document.getElementById("email").value;
		var name=document.getElementById("name").value;
		if(username==null||username==""){
			alert("请输入会员名！");
			return false;
		}
		else if(password==""){
			alert("密码不能为空！");
		 return false;
		}
		else if(password!=Rpassword){
			alert("两次密码不一致！")
				  return false;
		}
		else if(email==""){
			alert("邮箱不能为空");
			return false;
		}
		else if(！emailTest.test(email)){
			alert("邮箱格式不正确");
			return false;
		}
		else if(name==""||name=null){
			alert("姓名不能为空");
			return false;
		}
		else 	  
		return true;


	}
function showTips(id,information){
		
		document.getElementById(id+"span").innerHTML="<font color='red'>"+information+"<font>";
	}
	function warn(id,information){
		var info=document.getElementById(id).value;
		if(info==""||info==null){
			document.getElementById(id+"span").innerHTML="<font color='red'>"+information+"<font>";
		}
		else{
			document.getElementById(id+"span").innerHTML="";
		}
	}