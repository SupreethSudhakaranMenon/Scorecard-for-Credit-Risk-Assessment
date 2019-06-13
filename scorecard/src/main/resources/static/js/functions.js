

// For submit button
function conf()
{
	alert("The Details have been submitted");
	
}
// For colour changing in the configuration
function conf()
{
	var con=confirm("Do you want to submit for sure?");
}


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

