public class ManipularCaracteres {
    ManipularCaracteres(Caracteres numero){
        numero.setnumero_extenso(numero.getnumero_extenso().substring(0,1).toUpperCase() + numero.getnumero_extenso().substring(1));
    }
}
