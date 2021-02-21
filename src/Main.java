public class Main {
    public static void main(String args[]){
        // Asignación
        int numeroDeIngredientes = 7;

        System.out.println("Total de Ingredientes: " + numeroDeIngredientes);
        numeroDeIngredientes += 1;
        System.out.println("Agregamos 1 Ingrediente: " + numeroDeIngredientes);
        numeroDeIngredientes -= 2;
        System.out.println("Quitamos 2 Ingredientes: " + numeroDeIngredientes);
        numeroDeIngredientes *= 3;
        System.out.println("Multiplicamos los Ingredientes por 3: " + numeroDeIngredientes);
        numeroDeIngredientes /= 9;
        System.out.println("Dividmos en 9 el total de Ingredientes: " + numeroDeIngredientes);
        System.out.println();

        // Aritméticos
        int numeroDeGolesActual =  12;

        System.out.println("Nuestro resultado en Goles actual es: " + numeroDeGolesActual);
        System.out.println("Si sumamos 8, el resultado es: " + (numeroDeGolesActual + 8));
        System.out.println("Si restamos 2, el resultado es: " + (numeroDeGolesActual - 2));
        System.out.println("Si multiplicamos por 3, el resultado es: " + numeroDeGolesActual * 3);
        System.out.println("Si dividimos entre 7, el resultado es: " + numeroDeGolesActual / 7);
        System.out.println("Si buscamos el residuo de dividir entre 7, el resultado es: " + numeroDeGolesActual % 7);
        System.out.println();

        // Unarios
        System.out.println("Si mostramos el resultado primero y luego sumamos, el resultado es: " + numeroDeGolesActual ++);
        System.out.println("Y luego es: " + numeroDeGolesActual);

        System.out.println("Si mostramos el resultado primero y luego restamos, el resultado es: " + numeroDeGolesActual --);
        System.out.println("Y luego es: " + numeroDeGolesActual);

        System.out.println("Si sumamos primero y luego mostramos, el resultado es: " + ++ numeroDeGolesActual);
        System.out.println("Y luego es:" + numeroDeGolesActual);

        System.out.println("Si restamos primero y luego mostramos, el resultado es: " + -- numeroDeGolesActual);
        System.out.println("Y luego es: " + numeroDeGolesActual);
        System.out.println();

        // Relacionales
        int edadPapa = 54;
        int edadRoberto = 18;
        int edadAmigo = 18;

        System.out.println("La edad del Papá es de " + edadPapa + " años, la de Roberto es de " + edadRoberto + " años.");
        System.out.println("¿La edad del Papá es MENOR QUE la edad de Roberto? \nR:" + (edadPapa < edadRoberto));
        System.out.println("¿La edad del Papá es MENOR O IGUAL QUE la edad de Roberto? \nR:" + (edadPapa <= edadRoberto));
        System.out.println("¿La edad del Papá es MAYOR QUE la edad de Roberto? \nR:" + (edadPapa > edadRoberto));
        System.out.println("¿La edad del Papá es MAYOR O IGUAL QUE la edad de Roberto? \nR:" + (edadPapa >= edadRoberto));
        System.out.println("¿La edad del Papá es IGUAL QUE la edad de Roberto? \nR:" + (edadPapa == edadRoberto));
        System.out.println("¿La edad del Papá es DIFERENTE QUE la edad de Roberto? \nR:" + (edadPapa != edadRoberto));
        System.out.println();

        System.out.println("La edad del Amigo es de " + edadAmigo + " años, la de Roberto es de " + edadRoberto + " años.");
        System.out.println("¿La edad del Amigo es MENOR QUE la edad de Roberto? \nR:" + (edadAmigo < edadRoberto));
        System.out.println("¿La edad del Amigo es MENOR O IGUAL QUE la edad de Roberto? \nR:" + (edadAmigo <= edadRoberto));
        System.out.println("¿La edad del Amigo es MAYOR QUE la edad de Roberto? \nR:" + (edadAmigo > edadRoberto));
        System.out.println("¿La edad del Amigo es MAYOR O IGUAL QUE la edad de Roberto? \nR:" + (edadAmigo >= edadRoberto));
        System.out.println("¿La edad del Amigo es IGUAL QUE la edad de Roberto? \nR:" + (edadAmigo == edadRoberto));
        System.out.println("¿La edad del Amigo es DIFERENTE QUE la edad de Roberto? \nR:" + (edadAmigo != edadRoberto));
        System.out.println();

        // Logicos
        boolean usuarioComun = true;
        boolean tengoInternet = false;
        boolean pagueLaSuscripcion = true;
        boolean meLlamoElTaller = false;
        boolean escuchoUnRuidoRaro = true;

        System.out.println("Si soy un usuario común, ¿Debería codificar en Java? \nR: " + !usuarioComun);
        System.out.println("Si no tengo internet pero Pagué la subscripción, ¿Puedo ver Prime Video en casa? \nR:" +
                (tengoInternet && pagueLaSuscripcion));
        System.out.println("Si no me ha llamado el taller automotriz, pero escucho un ruido al manejar, " +
                "¿Necesito darle mantemiento al coche? \nR:" + (meLlamoElTaller || escuchoUnRuidoRaro));
    }
}
