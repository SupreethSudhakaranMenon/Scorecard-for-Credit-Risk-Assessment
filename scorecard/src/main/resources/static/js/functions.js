


function conf()
{
	alert("The Details have been submitted");
	
}

var ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://supreethsudhakaranmenon.github.io/details.json');
ourRequest.onload = function() {
	//console.log(ourRequest.responseText);
};
ourRequest.send();

var test = JSON.stringify(ourRequest.responseText);

