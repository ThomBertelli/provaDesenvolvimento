package Hydros;

public class BanheiroPublico extends SanitarioPublico {

    private Chuveiro chuveiro;

    public BanheiroPublico(Chuveiro chuveiro) {
        super(new VasoSanitario(11f,false), new Pia(20f,false));
        this.chuveiro = chuveiro;
    }


}
