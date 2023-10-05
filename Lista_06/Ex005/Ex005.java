public class Ex005 {
        public static void main(String[] args) {
            System.out.println(ehPalindromo("Arara"));
        }

        public static boolean ehPalindromo(String str) {
            // Remove espaços em branco e converte a string para minúsculas para uma comparação não sensível a maiúsculas/minúsculas.
            str = str.replaceAll("\\s+", "").toLowerCase();
            
            // Caso base: uma string vazia ou com um único caractere é sempre um palíndromo.
            if (str.length() <= 1) {
                return true;
            }
            
            // Compara o primeiro e último caractere da string.
            char primeiroCaractere = str.charAt(0);
            char ultimoCaractere = str.charAt(str.length() - 1);
            
            // Se os caracteres forem iguais, chama a função recursivamente com a string sem os extremos.
            if (primeiroCaractere == ultimoCaractere) {
                String substringSemExtremos = str.substring(1, str.length() - 1);
                return ehPalindromo(substringSemExtremos);
            } else {
                return false; // Se os caracteres não forem iguais, a string não é um palíndromo.
            }
        }
    }
