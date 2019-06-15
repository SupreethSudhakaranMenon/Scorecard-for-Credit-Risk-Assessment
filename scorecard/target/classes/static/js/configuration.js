function populateproduct() {
    var product = [
        { ValueId: 1, Name: "Agriculture" },
        { ValueId: 2, Name: "Personal" },
        { ValueId: 3, Name: "Capital" },
        { ValueId: 4, Name: "Ratio" }
    ];

    var values = document.getElementById("product");

    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < product.length; i++) {
        var option = document.createElement("OPTION");
        //Set Value Name in Text part.
        option.innerHTML = product[i].Name;
        //Set ValueId in Value part.
        option.value = product[i].Name;
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



function populatecharacteristic() {
    var characteristic = [
        { ValueId: 1, Name: "Age" },
        { ValueId: 2, Name: "Income" },
        { ValueId: 3, Name: "Gender" }
    ];

    var values = document.getElementById("characteristic");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < characteristic.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = characteristic[i].Name;

        //Set ValueId in Value part.
        option.value = characteristic[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populatefrom1() {
    var from1 = [
        { ValueId: 0, Name: "0" },
        { ValueId: 1, Name: "1" },
        { ValueId: 2, Name: "2" },
        { ValueId: 3, Name: "3" },
        { ValueId: 4, Name: "4" },
        { ValueId: 5, Name: "5" },
        { ValueId: 6, Name: "6" },
        { ValueId: 7, Name: "7" },
        { ValueId: 8, Name: "8" },
        { ValueId: 9, Name: "9" },
        { ValueId: 10, Name: "10" }
    ];

    var values = document.getElementById("from1");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < from1.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = from1[i].Name;

        //Set ValueId in Value part.
        option.value = from1[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}

function populatefrom2() {
    var from2 = [
        { ValueId: 0, Name: "0" },
        { ValueId: 1, Name: "1" },
        { ValueId: 2, Name: "2" },
        { ValueId: 3, Name: "3" },
        { ValueId: 4, Name: "4" },
        { ValueId: 5, Name: "5" },
        { ValueId: 6, Name: "6" },
        { ValueId: 7, Name: "7" },
        { ValueId: 8, Name: "8" },
        { ValueId: 9, Name: "9" },
        { ValueId: 10, Name: "10" }
    ];

    var values = document.getElementById("from2");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < from2.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = from2[i].Name;

        //Set ValueId in Value part.
        option.value = from2[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populatefrom3() {
    var from3 = [
        { ValueId: 0, Name: "0" },
        { ValueId: 1, Name: "1" },
        { ValueId: 2, Name: "2" },
        { ValueId: 3, Name: "3" },
        { ValueId: 4, Name: "4" },
        { ValueId: 5, Name: "5" },
        { ValueId: 6, Name: "6" },
        { ValueId: 7, Name: "7" },
        { ValueId: 8, Name: "8" },
        { ValueId: 9, Name: "9" },
        { ValueId: 10, Name: "10" }
    ];

    var values = document.getElementById("from3");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < from3.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = from3[i].Name;

        //Set ValueId in Value part.
        option.value = from3[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populateto1() {
    var to1 = [
        { ValueId: 0, Name: "0" },
        { ValueId: 1, Name: "1" },
        { ValueId: 2, Name: "2" },
        { ValueId: 3, Name: "3" },
        { ValueId: 4, Name: "4" },
        { ValueId: 5, Name: "5" },
        { ValueId: 6, Name: "6" },
        { ValueId: 7, Name: "7" },
        { ValueId: 8, Name: "8" },
        { ValueId: 9, Name: "9" },
        { ValueId: 10, Name: "10" }
    ];

    var values = document.getElementById("to1");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < to1.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = to1[i].Name;

        //Set ValueId in Value part.
        option.value = to1[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populateto2() {
    var to2 = [
        { ValueId: 0, Name: "0" },
        { ValueId: 1, Name: "1" },
        { ValueId: 2, Name: "2" },
        { ValueId: 3, Name: "3" },
        { ValueId: 4, Name: "4" },
        { ValueId: 5, Name: "5" },
        { ValueId: 6, Name: "6" },
        { ValueId: 7, Name: "7" },
        { ValueId: 8, Name: "8" },
        { ValueId: 9, Name: "9" },
        { ValueId: 10, Name: "10" }
    ];

    var values = document.getElementById("to2");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < to2.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = to2[i].Name;

        //Set ValueId in Value part.
        option.value = to2[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populateto3() {
    var to3 = [
        { ValueId: 0, Name: "0" },
        { ValueId: 1, Name: "1" },
        { ValueId: 2, Name: "2" },
        { ValueId: 3, Name: "3" },
        { ValueId: 4, Name: "4" },
        { ValueId: 5, Name: "5" },
        { ValueId: 6, Name: "6" },
        { ValueId: 7, Name: "7" },
        { ValueId: 8, Name: "8" },
        { ValueId: 9, Name: "9" },
        { ValueId: 10, Name: "10" }
    ];

    var values = document.getElementById("to3");


    //Add the Options to the DropDownList of Value.
    for (var i = 0; i < to3.length; i++) {
        var option = document.createElement("OPTION");

        //Set Value Name in Text part.
        option.innerHTML = to3[i].Name;

        //Set ValueId in Value part.
        option.value = to3[i].Name;

        //Add the Option element to DropDownList.
        values.options.add(option);
    }
}


function populatedropdowns() {
    populateproduct();
    populatecategory();
    populatecharacteristic();
    populatefrom1();
    populateto1();
    populatefrom2();
    populateto2();
    populatefrom3();
    populateto3();
}

window.onload = populatedropdowns;