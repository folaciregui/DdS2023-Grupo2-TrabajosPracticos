    $(document).ready(function() {
        $("#myForm").submit(function(event) {
            event.preventDefault();
            var usuario = $("#usuario").val();
            var contrasena = $("#contrasena").val();
            if (usuario == "" || contrasena == "") {
                alert("Por favor complete todos los campos.");
                return false;
            } else if (usuario.toLowerCase() == "admin" || contrasena == "1234" || contrasena.toLowerCase() == "admin") {
                alert("No se permiten valores predefinidos.");
                return false;
            } else {
                alert("Registro exitoso.");
                return true;
            }
        });
    });
