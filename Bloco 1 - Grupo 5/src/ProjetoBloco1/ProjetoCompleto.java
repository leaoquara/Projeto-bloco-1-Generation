package ProjetoBloco1;

import java.util.Scanner;



public class ProjetoCompleto {

	public static int contador1, contador2, contador3;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		int idade;
		String nome;
		
		System.out.print("O");
		Thread.sleep(300);
		System.out.print("l");
		Thread.sleep(300);
		System.out.print("�");
		Thread.sleep(300);
		System.out.print(", ");
		Thread.sleep(300);
		System.out.print("s");
		Thread.sleep(300);
		System.out.print("e");
		Thread.sleep(300);
		System.out.print("j");
		Thread.sleep(300);
		System.out.print("a ");
		Thread.sleep(300);
		System.out.print("b");
		Thread.sleep(300);
		System.out.print("e");
		Thread.sleep(300);
		System.out.print("m ");
		Thread.sleep(300);
		System.out.print("v");
		Thread.sleep(300);
		System.out.print("i");
		Thread.sleep(300);
		System.out.print("n");
		Thread.sleep(300);
		System.out.print("d");
		Thread.sleep(300);
		System.out.print("o ");
		Thread.sleep(300);
		System.out.print("!\n");
		Thread.sleep(750);
		
		espa�o();
		
		System.out.println("\nIremos te passar algumas perguntas para podermos te mostrar\n"
		                 + "a melhor maneira de come�ar a estudar para entrar no mundo tech.\n" 
		                 + "Mas antes, escreva seu nome e sua idade.");
		
		Thread.sleep(1500);
		
		espa�o();
		
		System.out.print("\nDigite seu nome: ");
		nome = sc.next();
		
		Thread.sleep(200);
		
		System.out.print("\nDigite sua idade: ");
		idade = sc.nextInt();
		
		Thread.sleep(750);
		
		espa�o();	
		
		pergunta1();
		
		espa�o();
		
		pergunta2();

		espa�o();
		
		pergunta3();
		
		espa�o();
		
		pergunta4();
		
		espa�o();
		
		pergunta5();
		
		espa�o();
		
		System.out.println("\nObrigado por completar nosso teste !\n");
		
		Thread.sleep(1000);
		
		System.out.println("A alternativa correta para voc� �: ");
		
		Thread.sleep(1000);
		
		if(contador1 > contador2 && contador1 > contador3) {
			System.out.println("\nAlternativa numero 1");
		}
		
		if(contador2 > contador1 && contador2 > contador3) {
			System.out.println("\nAlternativa numero 2");
		}
		
		if(contador3 > contador2 && contador3 > contador1) {
			System.out.println("\nAlternativa numero 3");
	}
}
	
			public static void pergunta1() throws InterruptedException {
		
	    System.out.print("\nP");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("i");
		Thread.sleep(100);
		System.out.print("m");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("i");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("a ");
		Thread.sleep(100);
		System.out.print("p");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a");
		Thread.sleep(100);
		System.out.print(" !\n");
		Thread.sleep(750); 
		
				int contador = 0;
				String resposta;
				System.out.println("\nEu me considero uma pessoa :\n");
				System.out.println("A - Que gosta de se movimentar, conversar e permanecer-se ativa;\n");
				System.out.println("B - Mais calma, gosto de medita��o e lugares quietos e reservados;\n");
				System.out.println("C - Que gosta de ajudar as pessoas e tenho facilidade de falar em p�blico;\n");
			
				System.out.print("\nResposta: ");
				resposta = sc. next();
				
				while(contador == 0) {
				
					switch(resposta) {
				
						case "A","a" :
							System.out.println("\nVoc� escolheu: A.");
						    contador ++;
						    contador1 ++;
							break;
					
						case "B","b" :
							System.out.println("\nVoc� escolheu: B.");
							contador ++;
							contador2 ++;
							break;
					
						case "C","c" :
							System.out.println("\nVoc� escolheu: C.");
							contador ++;
							contador3 ++;
							break;
					
						default :
							System.out.println("\nResposta invalida !");
							System.out.print("\nResposta: ");
							resposta = sc. next();
							break;
						
		}
	} Thread.sleep(750);
}
	
			public static void pergunta2() throws InterruptedException {
	    System.out.print("\nS");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("d");
		Thread.sleep(100);
		System.out.print("a ");
		Thread.sleep(100);
		System.out.print("p");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a");
		Thread.sleep(100);
		System.out.print(" !\n");
		Thread.sleep(750); 
		
				int contador = 0;
				String resposta;
				System.out.println("\nMeu hobby favorito � ...\n");
				System.out.println("A - Encontrar os amigos, fazer video chamadas com os que moram longe e\n"
						         + "    manter contato e socializar;\n");
				System.out.println("B - ler, ouvir m�sica e ficar em casa;\n");
				System.out.println("A - Ir para festas, barzinhos, teatro, cinema, eventos culturais;\n");
			
				System.out.print("\nResposta: ");
				resposta = sc. next();
				
				while(contador == 0) {
				
					switch(resposta) {
				
						case "A","a" :
							System.out.println("\nVoc� escolheu: A.");
						    contador ++;
						    contador3 ++;
							break;
					
						case "B","b" :
							System.out.println("\nVoc� escolheu: B.");
							contador ++;
							contador2++;
							break;
					
						case "C","c" :
							System.out.println("\nVoc� escolheu: C.");
							contador ++;
							contador1 ++;
							break;
							
						default :
							System.out.println("\nResposta invalida !");
							System.out.print("\nResposta: ");
							resposta = sc. next();
							break;
						
		}
	} Thread.sleep(750);
}
	
			public static void pergunta3() throws InterruptedException {
	    System.out.print("\nT");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("c");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("i");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("a ");
		Thread.sleep(100);
		System.out.print("p");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a");
		Thread.sleep(100);
		System.out.print(" !\n");
		Thread.sleep(750); 
		
				int contador = 0;
				String resposta;
				System.out.println("\nDentre as op��es abaixo, qual voc� acredita ser sua melhor qualidade:\n");
				System.out.println("A - Habilidade l�gica, criatividade;\n");
				System.out.println("B - Empatia, saber falar e ouvir;\n");
				System.out.println("C - Habilidade manual, gosto de mexer e desmontar coisas para descobrir\n" 
								 + "    como elas funcionam;\n");
			
				System.out.print("\nResposta: ");
				resposta = sc. next();
				
				while(contador == 0) {
				
					switch(resposta) {
				
						case "A","a" :
							System.out.println("\nVoc� escolheu: A.");
						    contador ++;
						    contador2 ++;
							break;
					
						case "B","b" :
							System.out.println("\nVoc� escolheu: B.");
							contador ++;
							contador3 ++;
							break;
					
						case "C","c" :
							System.out.println("\nVoc� escolheu: C.");
							contador ++;
							contador1 ++;
							break;
					
						default :
							System.out.println("\nResposta invalida !");
							System.out.print("\nResposta: ");
							resposta = sc. next();
							break;
						
		}
	} Thread.sleep(750);
}
			
			public static void pergunta4() throws InterruptedException {
		
		System.out.print("\nQ");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("a");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a ");
		Thread.sleep(100);
		System.out.print("p");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a");
		Thread.sleep(100);
		System.out.print(" !\n");
		Thread.sleep(750);
		
				int contador = 0;
				String resposta;
				System.out.println("\nNa escola eu me identificava mais com: \n");
				System.out.println("A - Trabalhos em equipe como, por exemplo montar maquetes e projetos;\n");
				System.out.println("B - Hist�ria, literatura, geografia;\n");
				System.out.println("C - Resolver problemas l�gicos e educa��o art�stica;\n");
			
				System.out.print("\nResposta: ");
				resposta = sc. next();
				
				while(contador == 0) {
				
					switch(resposta) {
				
						case "A","a" :
							System.out.println("\nVoc� escolheu: A.");
						    contador ++;
						    contador1 ++;
							break;
					
						case "B","b" :
							System.out.println("\nVoc� escolheu: B.");
							contador ++;
							contador3 ++;
							break;
					
						case "C","c" :
							System.out.println("\nVoc� escolheu: C.");
							contador ++;
							contador2 ++;
							break;
					
						default :
							System.out.println("\nResposta invalida !");
							System.out.print("\nResposta: ");
							resposta = sc. next();
							break;
						
		}
	} Thread.sleep(750);
}
		
			public static void pergunta5() throws InterruptedException {
		
		
	    System.out.print("\nQ");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("i");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a ");
		Thread.sleep(100);
		System.out.print("p");
		Thread.sleep(100);
		System.out.print("e");
		Thread.sleep(100);
		System.out.print("r");
		Thread.sleep(100);
		System.out.print("g");
		Thread.sleep(100);
		System.out.print("u");
		Thread.sleep(100);
		System.out.print("n");
		Thread.sleep(100);
		System.out.print("t");
		Thread.sleep(100);
		System.out.print("a");
		Thread.sleep(100);
		System.out.print(" !\n");
		Thread.sleep(750); 
		
				int contador = 0;
				String resposta;
				System.out.println("\nQuando faz um trabalho em grupo, voc� � aquele(a) que:\n");
				System.out.println("A - Mostra compromisso em transformar o conhecimento em aprendizagem;\n");
				System.out.println("B - Analisa bem o escopo do trabalho antes de propor a��es;\n");
				System.out.println("C - Prospera em encontrar novas maneiras de fazer algo funcionar; \n");
			
				System.out.print("\nResposta: ");
				resposta = sc. next();
				
				while(contador == 0) {
				
					switch(resposta) {
				
						case "A","a" :
							System.out.println("\nVoc� escolheu: A.");
						    contador ++;
						    contador3 ++;
							break;
					
						case "B","b" :
							System.out.println("\nVoc� escolheu: B.");
							contador ++;
							contador1 ++;
							break;
					
						case "C","c" :
							System.out.println("\nVoc� escolheu: C.");
							contador ++;
							contador2 ++;
							break;
					
						default :
							System.out.println("\nResposta invalida !");
							System.out.print("\nResposta: ");
							resposta = sc. next();
							break;
						
		}
	} Thread.sleep(750);
}	
			
			public static void espa�o() throws InterruptedException {
				
			System.out.println(" ");
			for(int i = 0; i < 90; i++) {
				System.out.print("-");
				Thread.sleep(15);
		}	System.out.println(" ");
	}		
}