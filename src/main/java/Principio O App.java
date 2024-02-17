class Funcionario {

}
 class Contrato entends Funcionario {
    public float salario() { return 3000; }
 }

 class Practicante extends Funcionario {
    public float bolsaAuxilio() { return 1000; }

 }

 class NominaSueldo {
    private float sueldo;
    public void calcular(Funcionario funcionario) {
        if(Funcionario instanceof Contrato )
        this.saldo = ((Contrato) funcionario). salario();
          else if(Funcionario instanceof Practicante)
           this.saldo = ((Practicante) funcionario).bolsaAuxilio();
    }
}

 