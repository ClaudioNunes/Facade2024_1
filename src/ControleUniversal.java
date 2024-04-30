public class ControleUniversal {
    private ControleAr ar;
    private ControleTv tv;
    private ControleLuzAmbiente luz;
    private ControleAudio audio;

    private ServicosStream servico;


    public ControleUniversal() {
        ControleAr ar = new ControleAr();
        ControleTv tv = new ControleTv();
        ControleLuzAmbiente luz = new ControleLuzAmbiente();
        ControleAudio audio  = new ControleAudio();
        ServicosStream servico = new ServicosStream();
    }

    public void NetFlix()
    {
        ar.Ligar();
        ar.AjustarTemperatura(18);
        tv.Ligar();
        luz.Ligar();
        luz.AjustaLuminosidade(3);
        audio.Ligar();
        audio.AjustarVolume(5);
        servico.SelecionarServico("NetFlix");

    }
}
