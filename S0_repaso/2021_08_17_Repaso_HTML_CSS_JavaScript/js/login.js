const Usuario = document.getElementById("user");
const Contra = document.getElementById("contra");

function login(){

    if (Usuario.value == "Tannia"){
        if (Contra.value == "4840"){
            window.location.replace("principal.html")
        }
        else{
            alert("Contraseña incorrecta")
        }
    }
    else{
        alert("Usuario incorrecto")
    }
}