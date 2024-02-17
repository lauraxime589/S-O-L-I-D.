package co.edu.uniquindio.poo;

class Usuario {
     private String email;
     private String contraseña;

     public Usuario (String email, String contraseña)
     this.email = email;
     this.contraseña = contraseña;

}

public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

public boolean usuarioValido () {
    //realizar la autenticacion de usuario
}

public boolean temCargo() {
    //realizar la validacion del cargo del usuario 
}
 
class ControlAcesso {
    Usuario Login (Usuario usuario, String cargo ){
        if(usuario.usuarioValido() && usuario.temCargo(cargo))
        return usuario;

        throw new acessoNegadoUsuario("Acceso negado");

    }
}
