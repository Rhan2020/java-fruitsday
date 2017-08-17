var st;

function qimg(){
	
	for(var i=0;i<5;i++)
	{
		var s=document.getElementById("p"+i);
		
		if(s.className=="show")
		{
			s.className="non";
			document.getElementById("l"+i).style.backgroundColor="#444444";
			
			i=(i+1)%5;
			document.getElementById("l"+i).style.backgroundColor="#669933";
			document.getElementById("p"+i).className="show";
			break;
		}
	}
}

function fimg(){
	st=setInterval("qimg()",5000);
}

function simg(n){
	
	window.clearInterval(st);
	
	var s=parseInt(n)-1;

	document.getElementById("p"+s).className="show";
	document.getElementById("l"+s).style.backgroundColor="#669933";
	
	var i=4;
	
	while(i--)
	{
		s=(s+1)%5;
		document.getElementById("p"+s).className="non";
		document.getElementById("l"+s).style.backgroundColor="#444444";
	}
}

function himg(n){

	var s=parseInt(n.charAt(1));

	document.getElementById("p"+s).className="show";

	var i=2;

	while(i--)
	{
		s=(s+1)%3;
		document.getElementById("p"+s).className="non";
	}
}

function number(s,fid){
	var num=document.getElementById("num"+fid);

	if(s=="0")
	{
		num.innerText=parseInt(num.innerText)+1;
	}
	else if(s=="1")
	{
		var k=parseInt(num.innerText)-1;

		num.innerText=k<1?1:k;
	}
}

function sum(fid)
{
	var up=parseFloat(document.getElementById("up"+fid).innerText);
	var sum=document.getElementById("sum"+fid);
	var num=parseFloat(document.getElementById("num"+fid).innerText);
	var cen=up*num;
	sum.innerText=cen;
}

function money()
{
	var sums=document.getElementsByClassName("fsum");
	var num=0;
	for(var i=0;i<sums.length;i++)
	{
		num+=parseInt(sums[i].innerText);
	}

	document.getElementById("money").innerText=num;
}
function show()
{
	var cart=document.getElementById("cart");

	if(cart.value=="已加入购物车")
	{
		cart.style.backgroundColor="#CCC";
		cart.style.cursor="auto";
	}

	var star=document.getElementById("star");

	if(star.value=="已关注")
	{
		star.style.backgroundColor="#CCC";
		star.style.color="#FFF";
		star.style.border="none";
		star.style.cursor="auto";
	}

}

function addCart(idd,fidd)
{
	var id=parseInt(idd);
	var fid=parseInt(fidd);
	var add=document.getElementById("cart");
	var f=document.getElementById("fform");
	if(add.value=="加入购物车")
	{
		f.action= "/x-test/ShopServlet?key=add&id="+id+"&fid="+fid+"&str=cart";
		f.submit();
	}
	else
		alert("当前商品已加入购物车!");
}

function addStar(idd,fidd)
{
	var id=parseInt(idd);
	var fid=parseInt(fidd);
	var add=document.getElementById("star");
	var f=document.getElementById("fform");
	if(add.value=="关注商品"){
		f.action="/x-test/ShopServlet?key=add&id="+id+"&fid="+fid+"&str=star";
		f.submit();
	}
	else
		alert("当前商品已关注!");
}
