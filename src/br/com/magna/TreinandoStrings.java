package br.com.magna;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TreinandoStrings {

	public static void main(String[] args) {

		// String é uma sequência ordenada de caracteres
		String nome = "Luis Felipe";
		System.out.println("String: " + nome);

		// utilizando os métodos da classe String

		// charAt - Devolve o caractere na posição específica solicitada
		System.out.println("charAt: " + nome.charAt(3)); // Nesse caso foi pego o S

		// codePointAt - Devolve o valor numérico do (ponto de código Unicode)
		// é uma padronização que atribui um número exclusivo a cada caractere
		System.out.println("codePointAt: " + nome.codePointAt(3));

		// codePointBefore - devolve o valor numérico do (ponto de código Unicode)
		// na posição anterior do que foi especificado
		System.out.println("codePointBefore: " + nome.codePointAt(3));

		// codePointCount - é usado para contar os pontos de código Unicode
		// em uma determinada sequencia de caracteres
		System.out.println("codePointCount: " + nome.codePointCount(0, 11));

		// compareTo - compara duas strings e retorna a diferença lexicografica
		// entre as duas na tabela de códigos ASCII ou Unicode.
		System.out.println("compareTo: " + nome.compareTo("Luana"));

		// compareToIgnoreCase - compara duas strings e retorna a diferença
		// lexicografica (int)
		// mas ignorando a diferença de caixa ALTA ou baixa
		System.out.println("compareToIgnoreCase: " + nome.compareToIgnoreCase("LUANA"));

		// concat - Concatena uma nova String no final da String que está utilizando o
		// método
		System.out.println("concat: " + nome.concat(" Garcia Menezes"));

		// contains - retorna true se a string sendo comparada contem a sequencia de
		// caracteres da string da comparação
		System.out.println("contains: " + nome.contains("Fel"));

		// contentEquals(CharSequence cs) - retorna true se a string sendo comparada
		// contem a EXATA sequencia
		// de caracteres da string da comparação
		System.out.println("contentEquals CharSequence: " + nome.contentEquals("Luis"));

		// contentEquals(StringBuffer sb) - retorna true se a string sendo comparada é
		// igual
		// a sequencia especifica de StringBuffer(objetos da classe são mutáveis
		// diferente do String)
		StringBuffer sb = new StringBuffer("Luis Felipe");
		System.out.println("contentEquals StringBuffer: " + nome.contentEquals(sb));

		// copyValueOf (char[] data) - retorna uma nova String estática a partir de um
		// array de caracteres
		char[] charArray = { 'L', 'u', 'i', 's', ' ', 'A', 'r', 'r', 'a', 'y' };
		System.out.println("copyValueOf char[]: " + String.copyValueOf(charArray));

		// copyValueOf (char[] data, int offset, int count) - retorna uma nova String
		// estática a partir de um array de caracteres
		// a partir da posição inicial e posição final do array
		// utilizando o objeto charArray criado acima
		System.out.println("copyValueOf char[] data, int, int: " + String.copyValueOf(charArray, 1, 7));

		// endsWith - retorna true se a string termina com o ultimo sufixo exatamente
		// igual a string comparada
		System.out.println("endsWith: " + nome.endsWith("Felipe"));

		// equals - retorna true se a string for igual ao objeto comparado
		String nome2 = "Luis Felipe";
		System.out.println("equals: " + nome.equals(nome2));

		// equalsIgnoreCase - retorna true se a string for igual ao objeto comparado mas
		// ignorando a diferença de caixa ALTA ou baixa
		String nome3 = "lUiS FeLIpE";
		System.out.println("equalsIgnoreCase: " + nome.equalsIgnoreCase(nome2));

		// format(String format, Object... args) - retorna uma String estática
		// formatada, passando o formato desejado (podendo usar especidicadores de formato),
		// que serão subistituidos pelos argumentos do varargs
		int idade = 19;
		double salario = 2500.50;
		System.out.println("\nformat(String format, Object... args): \n"
				+ String.format("Nome - %s, Idade - %d, Salario - %.2f", nome, idade, salario));

		// format(Locale l, String format, Object... args)- retorna uma String estática
		// formatada, passando o local (definir a região, para controlar elementos 
		// específicos do idioma e da região além de passar o formato e os argumentos

		Locale franca = Locale.FRANCE;
		System.out.println("\nformat(Locale l, String format, Object... args)\n: "
				+ String.format(franca, "Salario - %.2f", salario) + "\n");
		
		// getBytes - usado para converter uma string em um array de bytes, utilizando a
		// codificação padrão da plataforma (normalmente UTF-8)
		System.out.println("getBytes: " + Arrays.toString(nome.getBytes()));
		
		// getBytes(Charset charset) - usado para converter uma string em um 
		// array de bytes usando a codificação de caracteres especificada pelo objeto Charset.
		Charset utf16Charset = Charset.forName("UTF-16"); // especifica a codificação de caracteres a ser usada para a conversão.
		System.out.println("getBytes(Charset charset): " + Arrays.toString(nome.getBytes(utf16Charset)));
		
		// getBytes(String charsetName) - usado para converter uma string em um
		// array de bytes usando a codificação de caracteres especificada apenas
		// passando uma String com o nome do charset, sem precisar criar um objeto
		// É necessário utilizar um TryCatch para utilizar esse método
		try {
			System.out.println("getBytes(Charset charset): " + Arrays.toString(nome.getBytes("UTF-16")));
		} catch (UnsupportedEncodingException e) {
			System.out.println("Nome do Charset não suportado");
		}

		// getChars - retorna uma copia de uma parte específica da string para um array
		// de caracteres
		char[] array = new char[6];
		nome.getChars(5, 11, array, 0); // copiando cada caracter do "Felipe" para o array
		System.out.println("getChars: ");
		for (char c : array) {
			System.out.println(c); // dando print em cada posição do array
		}

		// hashCode - retorna o código Hash para a String
		System.out.println("hashCode: " + nome.hashCode());

		// indexOf(int ch) - retorna a posição da primeira ocorrencia do caracter
		System.out.println("indexOf(int ch): " + nome.indexOf('s'));

		// indexOf(int ch, int fromIndex) - retorna a posição da primeira ocorrencia do
		// caracter,
		// a partir de uma posição especifica
		System.out.println("indexOf(int ch, int fromIndex): " + nome.indexOf('i', 3));

		// indexOf(String str) - retorna a primeira posição da string que foi procurada
		System.out.println("indexOf(String str): " + nome.indexOf("Felipe"));

		// indexOf(String str, int fromIndex) - retorna a primeira posição da string que
		// foi procurada
		// a partir de uma posição especifica
		System.out.println("indexOf(String str, int fromIndex): " + nome.indexOf("Felipe", 3));

		// intern - Ele retorna uma referência à representação canônica da string no
		// pool de strings
		// da JVM (Java Virtual Machine). Se uma string literal com o mesmo conteúdo já
		// existir no pool,
		// o método intern() retornará a referência para essa string existente, em vez
		// de criar uma nova cópia na memória.
		String str1 = new String("Testando o método interno");
		String str2 = str1.intern();
		System.out.println("intern: " + str2); // a variável str2 está apontando seu valor para o espaço que está
												// armazenado o str1

		// isEmpty - retorna verdadeiro se o o tamanho da String é 0
		System.out.println("isEmpty: " + nome.isEmpty());
		
		// join(CharSequence delimiter, CharSequence... elements)- Ele é usado para unir várias sequencias de 
		// caracteres usando um demilitador especifico (" ")
		CharSequence[] palavras = {"Olá","estou", "testando", "o", "join", "no", "Java"};
		System.out.println("join(CharSequence delimiter, CharSequence... elements): \n" + String.join(" ", palavras));
		
		// join(CharSequence delimiter, Iterable<? extends CharSequence> elements) - usamos ele para unir uma
		// coleção de sequencia de caracteres usando um demilitador especifico (" ")
		List<String> listaPalavras = Arrays.asList("Olá","estou", "testando", "o", "join", "no", "Java", "usando", "listas");
		System.out.println("join(CharSequence delimiter, Iterable<? extends CharSequence> elements): \n" + String.join(" ", listaPalavras));

		// lastIndexOf(int ch) - retorna a posição da ultima ocorrencia do caracter
		System.out.println("lastIndexOf(int ch): " + nome.lastIndexOf('e'));

		// lastIndexOf(int ch, int fromIndex) - retorna a posição da ultima ocorrencia
		// do caracter,
		// a partir de uma posição especifica procurando do final para o começo
		System.out.println("indexOf(int ch, int fromIndex): " + nome.indexOf('i', 3));

		// lastIndexOf(String str) - retorna a ultima posição da string que foi
		// procurada
		System.out.println("lastIndexOf(String str): " + nome.lastIndexOf("Felipe"));

		// lastIndexOf(String str, int fromIndex) - retorna a ultima posição da string
		// que foi procurada
		// a partir de uma posição especifica procurando do final para o começo
		System.out.println("lastIndexOf(String str, int fromIndex): " + nome.indexOf("Luis", 3));

		// length - retorna o tamanho da String
		System.out.println("length: " + nome.length());

		// matches(String regex) - retorna verdadeiro se a String é compativel com o
		// regex passado por parametro
		String email = "lfelipegm@magnasistemas.com.br";
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		System.out.println("matches: " + email.matches(regex));

		// offsetByCodePoints(int index, int codePointOffset) - ajuda a calcular o novo
		// indice após o deslocamento
		// especificado em termos de pontos de código (Unicode) normalemente usado para
		// caracteres especiais e emojis.
		System.out.println("offsetByCodePoints: " + nome.offsetByCodePoints(0, 3));

		// regionMatches(int toffset, String other, int ooffset, int len) - é usado para
		// comparar uma
		// parte específica (região) de duas strings para determinar se elas são iguais.
		System.out.println("regionMatches: " + nome.regionMatches(0, "LUIS", 0, 4));

		// regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int
		// len) - a diferença dele
		// para o método acima é que o primeiro parametro define se vai ignorar
		// CaseSensitive (true) ou se vai adotar
		// o CaseSensitive (false)
		System.out.println("regionMatches(sem CaseSensitive): " + nome.regionMatches(true, 0, "LUIS", 0, 4));

		// replace(char oldChar, char newChar) - retorna uma String subistituindo todos
		// os Caracteres antigos pelos novos
		System.out.println("replace(char oldChar, char newChar): " + nome.replace('e', 'z'));

		// replace(CharSequence target, CharSequence replacement) - é usado para
		// substituir todas as ocorrências
		// de uma sequência de caracteres específica, por outra sequencia
		String frase = "Hello World,Hello Java,Hello Magna";
		System.out.println("\nreplace(CharSeq target, CharSeq replacement): \n" + frase.replace("Hello", "Olá") + "\n");

		// replaceAll(String regex, String replacement) - Procura um expressão regular
		// (Regex) para substituir por
		// outra String
		System.out.println(
				"replaceAll(String regex, String replacement): \n" + frase.replaceAll("(?i)java", "Python") + "\n");

		// replaceFirst(String regex, String replacement) - subistitui a primeira
		// ocorrencia achada pela
		// expressão regular (regex)por outra string
		System.out.println(
				"replaceFirst(String regex, String replacement): \n" + frase.replaceFirst("(?i)hello", "Salve") + "\n");

		// split(String regex) - usado para dividir uma string em um array de substrings
		// atraves de uma expressão regular
		// (Regex)
		String[] olas = frase.split(",");
		System.out.println("split(String regex): ");
		for (String string : olas) {
			System.out.println(string);
		}

		// split(String regex, int limit) - usado para dividir uma string em um array de
		// substrings atraves de
		// uma expressão regular (Regex) mas colocando um limite máximo para a
		// separação.
		String frutas = "maça,banana,abacaxi,uva,morango";
		String[] arrFrutas = frutas.split(",", 3);
		System.out.println("\nsplit(String regex, int limit): ");
		for (String string : arrFrutas) {
			System.out.println(string);
		}

		// startsWith(String prefix) - retorna true se a string verificada começar com o
		// determinado prefixo
		System.out.println("\nstartsWith(String prefix): " + nome.startsWith("Luis"));

		// startsWith(String prefix, int toffset) - retorna true se a string verificada
		// começar com o
		// determinado prefixo que inicia em determinada posição
		System.out.println("startsWith(String prefix, int toffset): " + frutas.startsWith("banana", 5));

		// subSequence - usado para obter uma sequencia de chars a partir da
		// string original
		System.out.println("subSequence: " + nome.subSequence(5, 11));

		// substring(int beginIndex) - usado para obter uma subsequência (parte) da
		// string original,
		// começando do índice até o final da string.
		System.out.println("substring(int beginIndex): " + nome.substring(2));

		// substring(int beginIndex, int endIndex) - usado para obter uma subsequência
		// (parte) da string original,
		// começando do índice até o índice de fim.
		System.out.println("substring(int beginIndex, int endIndex): " + nome.substring(5, 9));

		// toCharArray() - usado para converter uma string em um array de caracteres,
		// separando cada palavra
		// em uma posição do array
		char[] arrayChars = nome.toCharArray();
		System.out.print("toCharArray: ");
		for (char c : arrayChars) {
			System.out.print(c + " ");
		}

		// toLowerCase() - retorna a string em caixa baixa
		String magna = "MaGnA SiStEmAs";
		System.out.println("\ntoLowerCase: " + magna.toLowerCase());

		// toLowerCase(Locale locale) - retorna a string em caixa baixa usando as regras
		// da localização
		System.out.println("toLowerCase(Locale locale): " + magna.toLowerCase(franca));

		// toString - retorna o objeto como uma string (se usado com uma string a
		// redundancia não afetando em nada)
		System.out.println("toString: " + magna.toString());

		// toUpperCase() - retorna a string em caixa alta
		System.out.println("toUpperCase: " + magna.toUpperCase());

		// toUpperCase(Locale locale) - retorna a string em caixa alta usando as regras
		// da localização
		System.out.println("toUpperCase(Locale locale): " + magna.toUpperCase(franca));

		// trim() - retorna a string removendo todos os espaços em branco no inicio e
		// final da string
		String teste = "    Hello World!     ";
		System.out.println("trim: " + teste.trim());

		// valueOf(boolean b) - retorna uma representação de String a partir do Boolean
		boolean flag = true;
		System.out.println("valueOf(boolean b): " + String.valueOf(flag));

		// valueOf(char c) - retorna uma representação de String a partir do char
		char caracter = 'M';
		System.out.println("valueOf(char c): " + String.valueOf(caracter));

		// valueOf(char[] data) - retorna uma representação de String a partir de um array de char 
		char[] caracterArray = {'H', 'e', 'l', 'l', 'o'};
		System.out.println("valueOf(char[] data): " + String.valueOf(caracterArray));
		
		// valueOf(char[] data, int offset, int count) - retorna uma representação de String a partir de um array de char
		// colocando o indice de inicio e fim
		System.out.println("valueOf(char[] data, int offset, int count): \n" + String.valueOf(caracterArray, 1, 3));
		
		// valueOf(double d) - retorna uma representação de String a partir do double
		System.out.println("valueOf(double d): " + String.valueOf(3.14159265359));
		
		// valueOf(float f) - retorna uma representação de String a partir do float
		System.out.println("valueOf(float f): " + String.valueOf(3.14159f));
		
		// valueOf(int i) - retorna uma representação de String a partir de um int
		System.out.println("valueOf(int i): " + String.valueOf(14));
		
		// valueOf(long l) - retorna uma representação de String a partir de um long
		System.out.println("valueOf(long l): " + String.valueOf(123456789L));
		
		// valueOf(Object obj) - retorna uma representação de String a partir de um objeto
		int[] numeros = { 10, 20, 30, 40, 50 };
		System.out.println("valueOf(Object obj): " + String.valueOf(numeros)); // retorna uma representação interna da referência do array.
		

	}

}
