$(document).ready(function () {
$.ajax({
        type: "GET",
        contentType: "application/json",
        url: "http://localhost:8080/bundles?p=0&l=3",
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {
            var txt = "";
            txt += "<table border='bundle-table'>"
            for (x in data) {
                txt += "<tr><td>" + data[x].name
                 + "</td><td>" + data[x].description
                 + "</td><td>" + data[x].price
                 "</td></tr>";
            }
            txt += "</table>"
            document.getElementById("top-bundles").innerHTML = txt;
            console.log("SUCCESS : ", data);
        },
        error: function (e) {
            $('#error').html(e.responseText);
            console.log("ERROR : ", e);
        }
    });
});