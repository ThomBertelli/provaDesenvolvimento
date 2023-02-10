package Hydros;

public class Pia {

    private float vazao;
    private boolean status;

    public Pia(float vazao, boolean status) {
        this.vazao = vazao;
        this.status = status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setVazao(float vazao) {
        if(this.status){
            vazao = 20f;
        }
        this.vazao = vazao;

    }



}
