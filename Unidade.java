public class Unidade {
    Unidade(Caracteres caracteres, Numero numero) {
        int milhar = (int) numero.getNumero()/1000;
        int centena = (int) numero.getNumero()/100 - milhar * 10;
        int dezena = numero.getNumero()/10 - milhar * 100 - centena * 10;
        int unidade = numero.getNumero() - (milhar * 1000) - (centena * 100) - (dezena * 10);
        numero.setMilhar(milhar);
        numero.setCentena(centena);
        numero.setDezena(dezena);
        numero.setUnidade(unidade);
        if (numero.getDezena() != 0 && numero.getDezena() !=1 && numero.getUnidade() != 0) {
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + " e ");
        }
        if (numero.getDezena() != 1 && numero.getNumero() != 0){
            String[] escrita = new String[]{"","um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"};
            setar(caracteres, escrita[numero.getUnidade()]);
        }else if (numero.getNumero() == 0) {
            String escrita = "zero";
            setar(caracteres, escrita);
        }
        
    }
    public void setar(Caracteres caracteres, String escrita){
        caracteres.setnumero_extenso(escrita + caracteres.getnumero_extenso());
    }
}
