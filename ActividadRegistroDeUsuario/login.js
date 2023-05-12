$(document).ready(function() {
    $("#myForm").submit(function(event) {
        event.preventDefault();
        var usuario = $("#usuario").val();
        var contrasena = $("#contrasena").val();
        if (usuario == "" || contrasena == "") {
            alert("Es necesario que complete todos los campos.");
            return false;
        } else if (usuario.toLowerCase() == "admin" || contrasena == "1234" || contrasena.toLowerCase() == "admin") {
            alert("Los valores ingresados no superan la validación de ingreso de datos. Por favor, ingrese nuevamente valores distintos.");
            return false;
        } else {
            alert("Registro exitoso.");
            return true;
        }
    });
});
