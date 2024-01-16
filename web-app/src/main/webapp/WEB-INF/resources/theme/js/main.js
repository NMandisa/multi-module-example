$(document).ready(function() {
    let base_url ="";//context path here for web-service
    console.log("...DOM Loaded...");
    //Work in Progress will edit later...
    $("form").submit(function (event) {
        let test_obj = {};
        test_obj.test_name = $("#name").val();
        $.ajax({
                type: "POST",
                url: base_url + "/api/v1/tests/create",
                contentType: "application/json",
                dataType: "json",
                data: JSON.stringify(test_obj),
                success: function (response) {
                    console.log(response);
                },
                error: function (response) {
                    console.log(response);
                }
            },
            event.preventDefault());
    });

    $.ajax({
        type: "GET",
        url: base_url + "/api/v1/tests/",
        contentType: "application/json",
        async: true,
        success: function(response) {
            console.log(response);
        },
        error: function(response) {
            console.log(response);
        }
    });
});