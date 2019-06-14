

// For submit button in Characteristic Screen
function conf()
{
	alert("The Details have been submitted");
	
}

// function conf()
// {
// 	var con=confirm("Do you want to submit for sure?");
// }

// For colour changing in the configuration screen
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

function populatevalue() {
    //Build an array containing Customer records.
    var value = [
        { ValueId: 1, Name: "Binary" },
        { ValueId: 2, Name: "Nominal" },
        { ValueId: 3, Name: "Interval" },
        { ValueId: 4, Name: "Ratio" }
    ];

    var values = document.getElementById("value");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < value.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = value[i].Name;

        //Set ValueId in Value part.
        option.value = value[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populatedata() {
    var data = [
        { ValueId: 1, Name: "Numeric" },
        { ValueId: 2, Name: "Character" },
        { ValueId: 3, Name: "Date" }
    ];

    var values = document.getElementById("data");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < data.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = data[i].Name;

        //Set ValueId in Value part.
        option.value = data[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populatecategory() {
    var category = [
        { ValueId: 1, Name: "Individual" },
        { ValueId: 2, Name: "Organisation" },
        { ValueId: 3, Name: "Country" },
        { ValueId: 4, Name: "History" },
        { ValueId: 5, Name: "Loan" }
    ];

    var values = document.getElementById("category");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < category.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = category[i].Name;

        //Set ValueId in Value part.
        option.value = category[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populatedropdowns() {
    populatevalue() ;
    populatedata() ;
    populatecategory() ;
}

window.onload =  populatedropdowns;

