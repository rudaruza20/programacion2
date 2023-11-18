import io.reactivex.Observable;

public class EjemploReactiveX {
    public static void main(String[] args) {
        // Crear un flujo de datos observable a partir de una lista de números
        Observable<Integer> flujo = Observable.fromArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Aplicar una transformación para filtrar solo los números pares
        flujo
            .filter(numero -> numero % 2 == 0)
            .map(n->n*n)           
            .subscribe(
                numero -> System.out.println("Número par: " + numero),
                error -> System.err.println("Error: " + error.getMessage()),
                () -> System.out.println("Flujo completado")
            );
    }
}





