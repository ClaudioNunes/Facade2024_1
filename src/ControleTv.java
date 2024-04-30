public class ControleTv implements IControleRemoto{
    private boolean EstaLigado = false;
    @Override
    public void Ligar() {
        this.EstaLigado = true;
    }

    @Override
    public void Desligar() {
        this.EstaLigado = false;

    }

    @Override
    public String toString()
    {
     if (this.EstaLigado)
     {
         return  " A TV esta ligada";
     }
     return  "A TV esta desligada";
    }
}
