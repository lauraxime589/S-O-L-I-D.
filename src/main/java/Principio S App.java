class Usuario {
    private String email;
    private String contraseña;
    public Usuario(String email; String contraseña) {
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
}

    class Validacion {
        public boolean temCargo(Usuario usuario, String cargo) {
            //valida el cargo del usuario 

        }
    }
    class IdentificacionCargo {
        public boolean temCargo(Usuario usuario, String cargo) {
             //realiza la identificacion del cargo del usuario
        }
    }