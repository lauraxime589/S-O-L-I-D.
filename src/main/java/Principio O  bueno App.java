interface Devolucion {
    public float indemnizacion(); 
}
 class Contrato implements Devolucion {
    public float indemnizacion() { return 3000; }
 }
 class Practicante implements Devolucion {
    public float indemnizacion() { return 1000; }

 }
 class NominaSueldo {
    private float saldo;
    public void calcular (Devolucion Funcionario) {
        this.saldo = funcionario.indemnizacion();
    }

 }