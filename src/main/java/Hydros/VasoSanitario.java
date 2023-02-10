package Hydros;

public class VasoSanitario {

    private float vazao;
    private boolean status;

    public VasoSanitario(float vazao, boolean status) {
        this.vazao = vazao;
        this.status = status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
