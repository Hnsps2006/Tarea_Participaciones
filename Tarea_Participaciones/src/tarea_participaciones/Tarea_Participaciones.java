/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_participaciones;
import java.util.Scanner;
//estos son los imports que voy usar, el de java.util.Scanner para poder leer las entradas de usuarios.
import java.util.ArrayList;
//import ArrayList para poder crear una arraylist y poder guardar mis datos de mi Lista
import java.security.SecureRandom;
//esto es para poder generar cosas aleatorias, en este caso un numero aleatorio el cual eligirá una persona al azar dentro de la lista, de manera segura.
/**
 *
 * @author eliza
 */
public class Tarea_Participaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();
        //crea una instancia de la clase SecureRandom llamada numerosAleatorios. Esta instancia se utiliza para generar números aleatorios de forma segura 
        ArrayList<String> Lista;
        //creo arraylist llamada lista
        Lista = new ArrayList<String>();
        
        Lista.add("GABRIEL ERNESTO MEJIA BARCENAS");
        Lista.add("JOSE FERNANDO ALVAREZ BECERRA");
        Lista.add("HALMAR ANDRES ORDOÑEZ BULNES");
        Lista.add("MAXIMINO JOSE RODRIGUEZ CALIX");
        Lista.add("ANDRE IBRAHIM NAVAS CASCO");
        Lista.add("NAHUN FRANCISCO VASQUEZ CASTAÑEDA");
        Lista.add("AYLEEN DANIELA ESCOBAR CRUZ");
        Lista.add("JAFET ANTONIO XIRUI HOU DIAZ");
        Lista.add("CARLOS DANIEL FLORES GARCIA");
        Lista.add("ERICK DANIEL HERNANDEZ GARCIA");
        Lista.add("DAVID EMANUEL GARCIA GOMEZ");
        Lista.add("ANDRE HECHENBICHLER");
        Lista.add("JOSÉ ROBERTO SERÓN HERNÁNDEZ");
        Lista.add("BRYAN JOSE ARITA LOPEZ");
        Lista.add("JULIO ARIEL CÁRCAMO MERLO");
        Lista.add("LIA DARIELLA ERAZO MILLA");
        Lista.add("HANNE MICHELLE MENDOZA NUÑEZ");
        Lista.add("MIGUEL ANGEL MORAN NUÑEZ");
        Lista.add("EDUARDO JOSE VALDEZ ORTEZ");
        Lista.add("JONATAN JAZIEL VALLECILLO PEÑA");
        Lista.add("AARON ANTONIO CASTILLO PINEDA");
        Lista.add("JOEL EDGARDO FUENTES PINEDA");
        Lista.add("EXDI ABIMELEKH MATAMOROS RAMOS");
        Lista.add("GABRIEL ALEXIS MEJIA SERVELLON");
        Lista.add("CARLOS ADRIAN DOMINGUEZ TORRES");
        Lista.add("JOSE DAVID RODRIGUEZ VELASQUEZ");
        //añado todos los datos a la lista, que son todos los nombre de mis compañero de clase de programación 2
        boolean sololaprimeravez = true;
        //creo este bolean para poder imprimir el encabezado sin que se repita
        int numero_random_Seleccionado = numerosAleatorios.nextInt(26);
        //creo un numero aleatorio de 0-25, no de 0 a 26 porque lo vamos a comparar con i que se inicializa en 0
        for (int i = 0; i < Lista.size(); i++) {//acedemos adentro del arraylist.
            String Emoji_circulo = "⚪"; //los dos emoji para ver quien será el elegido.
            String Emoji_circulo2 = "⚫";
            String posicion_i_persona = Integer.toString(i+1); //le sumo 1 para que aparezca 1 y no 0
            String posicion_i_persona_2 = ""; //aqui declararemos los espacios en blanco si es del 1 al 9 tendrá dos espacios y si no tendrá 1 espacio.
             for (int j = 1; j <= 9; j++) {
                if (i == j || i == 0) {
                    posicion_i_persona_2 = "  " + posicion_i_persona; 
                    break; 
                }else{
                    posicion_i_persona_2 = " " + posicion_i_persona;
                }
            }
            if(sololaprimeravez == true){//condición de encabezado
                System.out.println("SE HA SELECCIONADO ALEATORIAMENTE UN ESTUDIANTE: ");
                System.out.println("================================================ \n");
                sololaprimeravez = false;
            }
            if(numero_random_Seleccionado==i){//imprimimos si es el elegido.
                System.out.println(""+Emoji_circulo2+" "+posicion_i_persona_2+" "+Lista.get(i));
            }else{//si no es el elegido imprimiremos lo siguiente.
                System.out.println(""+Emoji_circulo+" "+posicion_i_persona_2+" "+Lista.get(i));
            }
        }
        
    }
    
}
