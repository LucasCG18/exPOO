public class Milhar extends Dezena{
    public void milhar(Caracteres caracteres, Numero numero){
        if (numero.getMilhar() != 0 && (numero.getDezena() !=0 || numero.getUnidade() != 0 || numero.getCentena() != 0) && (numero.getDezena() ==0 && numero.getUnidade() == 0)) {
            caracteres.setnumero_extenso(" e " + caracteres.getnumero_extenso());
        }else if (numero.getMilhar() != 0 && numero.getCentena() != 0) {
            caracteres.setnumero_extenso(" e " + caracteres.getnumero_extenso());
        }
        String[] escrita = new String[]{"","um mil", "dois mil", "tres mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"};
        setar(caracteres, escrita[numero.getMilhar()]);
    }
}
