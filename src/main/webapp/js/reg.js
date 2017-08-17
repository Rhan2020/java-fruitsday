function isEmail(){
	var email=document.getElementById("email").value;
	var error=document.getElementById("isEmail");
	var reg=/^[A-Za-z]+\w+(-|\.|)+\w*\@\w+((\.|-)\w+)*\.\w+/;
	if(email=="")
		error.innerText="邮箱不能为空!";
	else
	{
		if(reg.test(email))
		{
			document.getElementById("email").style.border="1px solid #669933";
			error.innerText="";
			return true;
		}
		else
			error.innerText="邮箱格式不正确！";
	}
	document.getElementById("email").style.border="1px solid red";
	return false;
}

function isPhone(){
	var phone=document.getElementById("phone").value;
	var error=document.getElementById("isPhone");
	var reg=/0?(13|14|15|18)[0-9]{9}$/;
	if(phone=="")
		error.innerText="手机不能为空!";
	else
	{
		if(reg.test(phone))
		{
			document.getElementById("phone").style.border="1px solid #669933";
			error.innerText="";
			return true;
		}
		else
			error.innerText="手机格式不正确!";
	}
	document.getElementById("phone").style.border="1px solid red";
	return false;
}

function isPwd1(){
	var pwd1=document.getElementById("pwd1").value;
	var error=document.getElementById("isPwd1");
	var reg=/^[A-Za-z0-9_-]+$/;
	if(pwd1=="")
		error.innerText="密码不能为空!";
	else
	{
		if(reg.test(pwd1))
		{
			document.getElementById("pwd1").style.border="1px solid #669933";
			error.innerText="";
			return true;
		}
		else
			error.innerText="密码格式不正确!";
	}
	document.getElementById("pwd1").style.border="1px solid red";
	return false;
}

function isPwd2(){
	var pwd2=document.getElementById("pwd2").value;
	var pwd1=document.getElementById("pwd1").value;
	var error=document.getElementById("isPwd2");
	if(pwd2=="")
		error.innerText="不能为空!";
	else
	{
		if(pwd2==pwd1)
		{
			document.getElementById("pwd2").style.border="1px solid #669933";
			error.innerText="";
			return true;
		}
		else
			error.innerText="密码不一致!";
	}
	document.getElementById("pwd2").style.border="1px solid red";
	return false;
}

function isReg()
{
	if(isEmail()&&isPhone()&&isPwd1()&&isPwd2())
		document.getElementById("regForm").submit();
	else
		alert("请完成注册单!");
}





