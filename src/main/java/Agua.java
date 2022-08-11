public class Agua implements Elemento {

    private int vida = 100;
    private int energia = 20;

    @Override
    public void alimentar(Comida comida) {
        if(energia == 20){
            throw new MaximaEnergia();
        }
        comida.darComida(this);
    }

    public int obtenerVida(){
        return this.vida;
    }

    public int obtenerEnergia(){ return this.energia; }


    @Override
    public void modificarEnergia(int energia) {
        this.energia += energia;
    }
}
