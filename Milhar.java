public class Milhar extends Dezena{
    public void milhar(Caracteres caracteres, Numero numero){
        String[] escrita = new String[]{"","um mil", "dois mil", "tres mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"};
        int milhar = (int) numero.getNumero()/1000;
        int centena = (int) numero.getNumero()/100 - milhar * 10;
        int dezena = numero.getNumero()/10 - milhar * 100 - centena * 10;
        int unidade = numero.getNumero() - (milhar * 1000) - (centena * 100) - (dezena * 10);
        numero.setMilhar(milhar);
        numero.setCentena(centena);
        numero.setDezena(dezena);
        numero.setUnidade(unidade);
        caracteres.setnumero_extenso("");
        setar(caracteres, escrita[milhar]);
    }
    public void setar(Caracteres caracteres, String escrita){
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + escrita);
        }
}
