public class Dezena extends Unidade{
    public void dezena(Caracteres caracteres, Numero numero){
        if ((numero.getMilhar() != 0||numero.getCentena() != 0) && (numero.getDezena() !=0 || numero.getUnidade() != 0)) {
            caracteres.setnumero_extenso(caracteres.getnumero_extenso() + " e ");
        }
        if (numero.getDezena() == 1 && numero.getUnidade() != 0){
            String[] escrita = new String[]{"","onze", "doze", "treze", "quatorse ", "quinze ", "dezesseis ", "dezesete ", "dezoito ", "dezenove "};
            setar(caracteres, escrita[numero.getUnidade()]);
        }else{
            String[] escrita = new String[]{"","dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
            setar(caracteres, escrita[numero.getDezena()]);
        }
    }
    
}

