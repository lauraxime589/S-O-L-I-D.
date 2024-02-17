interface Ave {
    void comer();
}
interface AveVoladora {
    void volar();
}
interface AveNadadora {
    void nadar();
}
class Loro implements Ave, AveVoladora{

    @Override
    public void volar() {
    }
    @Override
    public void comer(){

    }
}
class Pinguino implements AveNadadora{
      
     @Override
     public void nadar() {

     }
     @Override
     public void comer(){
        
     }
}