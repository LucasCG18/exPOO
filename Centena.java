public class Centena extends Dezena {
    public void centena(Caracteres caracteres, Numero numero){
        if ((numero.getMilhar() != 0||numero.getCentena() != 0) && (numero.getDezena() !=0 || numero.getUnidade() != 0)) {
            caracteres.setnumero_extenso(" e " + caracteres.getnumero_extenso());
        }
        
        if (numero.getCentena() == 1 && numero.getDezena() == 0 && numero.getUnidade() == 0){
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + "cem");
        }else{
            String[] escrita = new String[]{"","cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
            setar(caracteres, escrita[numero.getCentena()]);
        }
        
    }
}
