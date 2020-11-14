package desafio_NumExtenso;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Desafio_NumExtenso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void convert(float valor) {
		float num = valor; // 1553.05
		int reais = (int) Math.floor(num); // floor(x) retorna o menor número inteiro dentre o número
		int milhares = reais / 1000;
		reais -= milhares * 1000;
		int centenas = reais / 100;
		reais -= centenas * 100;
		int dezena = reais / 10;
		reais -= dezena * 10;
		int unidades = reais;

		String extenso = "";

//		String[] grupo = new String[5];
//		grupo[0] = "reais";
//		grupo[1] = "mil";
//		grupo[2] = "milhões";
//		grupo[3] = "centavos"; 

		if (milhares != 0) {
			if (milhares == 1) {
				extenso = "Mil";
			} else if (milhares >= 2 && milhares <= 9) {
				extenso = getNumber(milhares) + " mil";
			} else if (milhares >= 10 || milhares <= 90) {

				if (milhares >= 11 && milhares <= 19) {
					extenso = getOutros(milhares) + " mil";
				} else if (milhares >= 20 && milhares <= 99){
					extenso = getDezena(milhares) + " mil";
				}else if (milhares >= 100 && milhares <= 900){
					extenso = getCentena(milhares) + " mil";
				}

			}

		}

		// System.out.println(number[reais]);
		System.out.println(num);

		System.out.println(extenso);

	}

	public String getNumber(int num) {
		String[] number = new String[10];
		number[1] = "um";
		number[2] = "dois";
		number[3] = "três";
		number[4] = "quatro";
		number[5] = "cinco";
		number[6] = "seis";
		number[7] = "sete";
		number[8] = "oito";
		number[9] = "nove";
		return number[num];
	}

	public String getDezena(int num) {
		String[] number = new String[10];
		num = num / 10;
		number[1] = "dez";
		number[2] = "vinte";
		number[3] = "trinta";
		number[4] = "quarenta";
		number[5] = "cinquenta";
		number[6] = "sessenta";
		number[7] = "setenta";
		number[8] = "oitenta";
		number[9] = "noventa";
		return number[num];
	}

	public String getOutros(int num) {
		String[] number = new String[10];
		num = num - 10;
		number[1] = "onze";
		number[2] = "dose";
		number[3] = "treze";
		number[4] = "quatorze";
		number[5] = "quinze";
		number[6] = "dezesseis";
		number[7] = "dezessete";
		number[8] = "dezoito";
		number[9] = "deznove";
		return number[num];
	}
	
	public String getCentena(int num) {
		String[] number = new String[10];
		//num = num - 10;
		System.out.println(num);
		number[1] = "cem";
		number[2] = "duzentos";
		number[3] = "trezentos";
		number[4] = "quatrocentos";
		number[5] = "quinhentos";
		number[6] = "seiscentos";
		number[7] = "setecentos";
		number[8] = "oitocentos";
		number[9] = "novecentos";
		return number[num];
	}
}
