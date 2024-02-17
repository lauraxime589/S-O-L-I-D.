class Recatngulo{
    int base;
    int altura;
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    function area(){
             return base*altura; 
    }
}
class Cuadrado entends Recatngulo{
    fuction setAltura(int altura){
            this.altura = altura;
            this.base = base; //en un cuadrado ambos son iguales;
    }
    function setBase(int base){
             this.altura = base; //en un cuadrado ambos son iguales;
             this.base = base;
    }
}   

class Usuario{
      fuction comprobarArea(Reactangulo reactangulo){
               recatangulo.setBase(4);
               reactangulo.setAltura(5);
               if (recatngulo.area() !=20){
                     //entrar aqui implica que se viola el principio, un cuadradotendria un area 25, pero lo esperado es 20
               }
               else{
                     //buena Implementacion
               }
      }    

}