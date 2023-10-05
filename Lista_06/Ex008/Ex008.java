public class Ex008 {

    public static String inverterString(String str) {
        // Caso base: se a string tiver um comprimento menor ou igual a 1, ela já está invertida.
        if (str.length() <= 1) {
            return str;
        } else {
            // Obtém o primeiro caractere da string.
            char primeiroCaractere = str.charAt(0);
            
            // Chama a função recursivamente para inverter o restante da string.
            String stringInvertida = inverterString(str.substring(1));
            
            // Concatena o primeiro caractere invertido com o restante da string invertida.
            return stringInvertida + primeiroCaractere;
        }
    }

    public static void main(String[] args) {
        String texto = "Hello, world!"; // Você pode alterar a string para inverter outra sequência de caracteres.
        
        String textoInvertido = inverterString(texto);
        System.out.println("String original: " + texto);
        System.out.println("String invertida: " + textoInvertido);
    }
}
