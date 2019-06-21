

// For submit button in Characteristic Screen
function conf()
{
	alert("The Details have been submitted");
	
}

// function conf()
// {
// 	var con=confirm("Do you want to submit for sure?");
// }

// For selecting colour in the configuration screen
var i = 0;
function colourchange1()
{
	i++;
	if(i>6){
		return;
	}
	var a = document.getElementById('colour1');
	if(i%2==0){
		document.getElementById('value-label-' + i/2).value = a.options[a.selectedIndex].value;
		document.getElementById(a.options[a.selectedIndex].value).remove();
	}

}

var ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://supreethsudhakaranmenon.github.io/details.json');
ourRequest.onload = function() {
	 //console.log(ourRequest.responseText);
};
ourRequest.send();
var test = JSON.stringify(ourRequest.responseText);



// function load()
// {
// 	var mydata = JSON.parse(data);
//     alert(mydata.length);
// }




// Used for getting the user details from details page.
function goTo(url)
{
	// conso
	// When using on click comment out url line
	url = 'localhost:8233/c_feature/'+url;
	console.log(url);
	// window.location.assign(''+url);
    window.open(url);
    // window.location.reload();

};
function goTocon(url)
{
	// conso
	// When using on click comment out url line
	url = 'localhost:8233/configuration/'+url;
	console.log(url);
	// window.location.assign(''+url);
	window.open(url);
	// window.location.reload();

};



// function myFunction()
// {
// 	var input , filter , ul , li , a, i;
// 	input = document.getElementById("myInput")
// 	filter = input.value.toUpperCase();
// 	ul = document.getElementsByClassName("list-group");
// 	li = ul.document.getElementsByTagName("li");
// 	for (i=0;<li.length;i++)
// 	{
// 		a = li[i].getElementsByTagName("a")[0];
// 		if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
// 			li[i].style.display = "";
// 		}
// 		else {
// 			li[i.style.display = "none";]
// 		}
// 	}
// }



