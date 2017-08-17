var unum=0;
var fnum=0;
function sss(t)
{
	if(t=="u")
	{
		unum++;
		var u=document.getElementById("user_list");
		if(unum%2==1)
			u.style.display="none";
		else
			u.style.display="block";
	}
	else
	{
		fnum++;
		var f=document.getElementById("fruit_list");
		if(fnum%2==1)
			f.style.display="none";
		else
			f.style.display="block";
	}

}

function ox(s)
{
	for(var i=0;i<7;i++)
	{
		var t="x"+i;
		
		if(s==t)
		{
			document.getElementById(t).style.display="block";
		}
		else
		{
			document.getElementById(t).style.display="none";
		}
	}
}

