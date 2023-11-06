package principal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
//Lista de STring

    private static final List<String> paises = Arrays.asList("Argentina", "Chile", "Bolivia", "Paraguay", "Brasil", "Uruguay");

    public static void main(String[] args) {
        
        /*------------------------->Actividad 1<-------------------------*/
        // Ejecuto el metodo convertirListaMayuscula

        List<String> listaEnMayusculas = convertirListaMayuscula(paises);

        //El rertorno lo envio al metodo imprimir
        imprimir(listaEnMayusculas);

        
        /*------------------------->Actividad 2<-------------------------*/
        List<String> nuevaLista = nuevaListaDeCadena(paises, 7);
        
         System.out.println(nuevaLista);

         
    }

//Metodo Actividad 01
    public static List<String> convertirListaMayuscula(List<String> paises) {
        return paises.stream()
                .map(pais -> pais.toUpperCase())
                .collect(Collectors.toList());
    }

// Metodo Actividad 2
       public static List<String> nuevaListaDeCadena(List<String> paises, int cantidadCaracteres) {
        return paises.stream()
            .filter(item -> item.length() > cantidadCaracteres)
            .collect(Collectors.toList());
    }
       
       //Otro Metodo
    public static void imprimir(List<String> lista) {
        lista.forEach((pais) -> {
            System.out.println(pais);
        });
    }
}
