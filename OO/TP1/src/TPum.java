import java.util.Scanner;
import java.util.Random;
public class TPum {

      public static void main(String[] args) {
    	  Scanner opcao = new Scanner(System.in);
    	  Scanner corre = new Scanner(System.in);
    	  
    	  char op, correcao = 0;
    	  
    	  String temas[][]= new String[51][51];
    	  
    	  temas[0][0]="comidas";
    	  temas[0][1]="feijao";
    	  temas[0][2]="arroz";
    	  temas[0][3]="batata";
    	  temas[0][4]="frango";
    	  temas[0][5]="carne";
    	  temas[0][6]="salada";
    	  temas[0][7]="peixe";
    	  temas[0][8]="banana";
    	  temas[0][9]="morango";
    	  temas[0][10]="limao";
    	  
    	  temas[1][0]="animais";
    	  temas[1][1]="galinha";
    	  temas[1][2]="galo";
    	  temas[1][3]="ovelha";
    	  temas[1][4]="pombo";
    	  temas[1][5]="girafa";
    	  temas[1][6]="castor";
    	  temas[1][7]="peixe";
    	  temas[1][8]="cachorro";
    	  temas[1][9]="gato";
    	  temas[1][10]="leao";
    	  
    	  temas[2][0]="cidades";
    	  temas[2][1]="brasilia";
    	  temas[2][2]="goiania";
    	  temas[2][3]="recife";
    	  temas[2][4]="salvador";
    	  temas[2][5]="curitiba";
    	  temas[2][6]="fortaleza";
    	  temas[2][7]="manaus";
    	  temas[2][8]="campinas";
    	  temas[2][9]="maceio";
    	  temas[2][10]="natal";
    	  
    	  temas[8][0]="cores";
    	  temas[8][1]="amarelo";
    	  temas[8][2]="vermelho";
    	  temas[8][3]="azul";
    	  temas[8][4]="laranja";
    	  temas[8][5]="roxo";
    	  temas[8][6]="verde";
    	  temas[8][7]="rosa";
    	  temas[8][8]="preto";
    	  temas[8][9]="branco";
    	  temas[8][10]="cinza";
    	  
    	  temas[4][0]="países";
    	  temas[4][1]="brasil";
    	  temas[4][2]="argentina";
    	  temas[4][3]="paraguai";
    	  temas[4][4]="frança";
    	  temas[4][5]="espanha";
    	  temas[4][6]="venezuela";
    	  temas[4][7]="inglaterra";
    	  temas[4][8]="canada";
    	  temas[4][9]="mexico";
    	  temas[4][10]="catar";

    	  do {
    		  lp();
	    	  System.out.println("        FORCA");
	    	  System.out.println();
	    	  System.out.println("1) Gerenciar Temas");
	    	  System.out.println("2) Gerenciar Palavras");
	    	  System.out.println("3) Jogar");
	    	  System.out.println("4) Sair");
	    	  System.out.println();
	    	  System.out.print("Escolha uma opção:");
	    	  op=opcao.next().charAt(0);
	    	  	switch(op) {
	    	  	case '1':
	    	  		
	    	  		gerenciar_temas(temas);
	    	  		
	    	  	break;
	    	  	
	    	  	case '2':
	    	  		
	    	  		gerenciar_palavras(temas);
	    	  		
	    	  		
		    	break;
		    	
	    	  	case '3':
	    	  		jogar(temas);
	    	  		
		    	break;
		    	
	    	  	case '4':	    	  		
	    	  		
		    	break;
		    	
	    	  	default :
	    	  		lp();
	    	  		System.out.println("Opção inválida");
	    	  		System.out.println();
	    	  		System.out.println("1) Voltar para o menu");
	    	  		System.out.println("2) Sair");
	    	  		System.out.println();
	    	  		System.out.printf("Insira uma opcao válida:");
	    	  		correcao=corre.next().charAt(0);
	    	  		
	    	  		
	    	    	    		  
	    	  	}	    	
    	  }while(op!='4' && correcao!='2');
    	  lp();
    	  
      }
      static void lp() {
    	  int i;
    	  for (i=0; i < 100; i++) {
    		  System.out.println();			
		}
    	  
    	  
    	  
      }
      static void gerenciar_temas(String temas[][]) {
      char opcao, correcao;
    	  Scanner op = new Scanner(System.in);
    	  Scanner corre = new Scanner(System.in);
    	  do {
    		  lp();
	    	  System.out.println("Gerenciar temas");
	    	  System.out.println();
	    	  System.out.println("1)Cadastrar tema");
	    	  System.out.println("2)Excluir tema");
	    	  System.out.println("3)Buscar tema");
	    	  System.out.println("4)Voltar para o menu principal");
	    	  System.out.println();
	    	  System.out.print("Escolha uma opção:");
	    	  opcao=op.next().charAt(0);
	    	  switch (opcao) {
			  case '1': 
				  
				  cadastrar_tema(temas);
					
			  break;
			  
			  case '2': 
				  excluir_tema(temas);
				  
			  break;		
			  
			  case '3':
				  buscar_tema(temas);
				  
			  break;	
			  
			  case '4': 
				  
			  break;
			  
			  default:
				  	lp();
	    	  		System.out.println("Opção inválida");
	    	  		System.out.println();
	    	  		System.out.println("1) Voltar");
	    	  		System.out.println();
	    	  		System.out.printf("Insira uma opcao válida:");
	    	  		correcao=corre.next().charAt(0);				  
	    	  }
    	  }while(opcao!='4');
    	  
    	  
    	  		 
    	  		
    	  
    	  
      }
      static void cadastrar_tema(String temas[][]) {
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  int c=0, t=2;
    	  int l=0;
    	  int opcao=0;
    	  String tema, temap;
    	  do {
    		  t=2;
    		  lp();
    		  System.out.println("Somente letras minúsculas");
	    	  System.out.printf("Nome do tema:");
	    	  tema=tm.next();
	    	  for(l=0; l<51;l++) {
	    		  temap=temas[l][c];
	    		  boolean teste;
	    		  if(l!=51 && temap!=null) {
	    			  teste=temap.contains(tema);
		    		  if(teste==true){
		    			  lp();
		    			  System.out.println("tema já cadastrado");
		    			  System.out.println();
				    	  System.out.println("1) Cadastrar novo tema");
				    	  System.out.println("2) voltar");
				    	  System.out.println();
				    	  System.out.print("Escolha uma opção:");
				    	  opcao=op.nextInt();
		    			  l=51;
		    			  t=3;
		    		  }
	    		  }	    		  	    		  
	    	  }	    	  	    	  	
	    	  	if(t==2) {
	    	  		for(l=0; l<51;l++) {
	  	    		  temap=temas[l][c];
	  	    		  if(temap==null) {
	  	    			  temas[l][c]=tema;
	  	    			  l=51;
	  	    		  }
	    	  		}
	    	  	  lp();
	    	  	  System.out.println("Tema cadastrado com sucesso!");
	    	  	  System.out.println();
		    	  System.out.println("1) Cadastrar novo tema");
		    	  System.out.println("2) voltar");
		    	  System.out.println();
		    	  System.out.print("Escolha uma opção:");	    	  	
		    	  opcao=op.nextInt();
	    	  	}	    	  
    	  }while(opcao!=2);	    	      	    		  
  	  }
      static void excluir_tema(String temas[][]) {

    	  lp();
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  int l1=0, c1=0, c2=1, quantp=0, lp=0, le, opcao;
    	  String temap, palavra, teste;
    	  
    	  System.out.println("Temas cadastrados:");
    	  System.out.println();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][c1];
    		  if(temap!= null) {
    			  lp++;
    			  
    			  System.out.printf("%d) %s\n", lp, temap);
    			  
    		  }    		  
    	  }
    	  System.out.println();
    	  System.out.print("Escolha um tema para excluir:");
    	  le=tm.nextInt();
    	  lp=0;
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][c1];
    		  if(temap!= null) {
    			  lp++;
    		  }
    		  if(lp==le) {
    		  	for(c2=1; c2<51; c2++) {
    			  palavra=temas[l1][c2];
    			  if(palavra!=null) {
    				  quantp++;
    			  }
    		  	}
    		  }
    	  }
    	  if(quantp>0) {
    		  lp();
    		  System.out.println("Não foi possível excluir o tema. Verifique se existem palavras cadastradas nesse tema.");
    		  System.out.println();
	    	  System.out.println("1) voltar");
	    	  System.out.println();
	    	  System.out.print("Escolha uma opção:");
	    	  opcao=op.nextInt();	    	      		     		  
    	  }else {
    		  lp=0;
    		  for(l1=0; l1<51; l1++) {
        		  temap=temas[l1][c1];
        		  if(temap!= null) {
        			  lp++;
        		  }
        		  if(lp==le) {
        			  temas[l1][c1]=null;
        			  l1=51;
        		  }
    		  }
    		  lp();
    		  System.out.println("Tema excluido com sucesso");
    		  System.out.println();
	    	  System.out.println("1) voltar");
	    	  System.out.println();
	    	  System.out.print("Escolha uma opção:");
    	  		opcao=op.nextInt();
    	  }
      
  	  }
      static void buscar_tema(String temas[][]) {
    	  lp();
    	  Scanner pl = new Scanner(System.in);
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  String tema, temap;
    	  int l1, correcao, lp=0;
    	  boolean teste;
    	  
    	  System.out.println();
    	  System.out.printf("Digite o tema que você deseja buscar");
    	  System.out.println();
    	  System.out.print("Somente letras minúsculas:");  	  
    	  tema=tm.next();
    	  lp();
    	  for(l1=0; l1<51; l1++) {
    			  temap=temas[l1][0];
    			  if(temap !=null){
    				  teste=temap.contains(tema);    			  
    				  if(teste==true){    				      				  
	    	    		  System.out.println();
	    	        	  System.out.printf("O tema %s foi encontrado", tema);
	    	        	  System.out.println();
	    	        	  lp++;
	    	        	  l1=51;
    				  }
    			  }
    	  }    	  
    	  if(lp>0) {
	    	  System.out.println();
	    	  System.out.println("1) Voltar");
	    	  System.out.println();
	    	  System.out.printf("Digite 1 para voltar ao menu:");
	    	  correcao=pl.nextInt();
    	  }
    	  if(lp==0) {
    		  lp();
    		  System.out.println();
        	  System.out.printf("O tema %s não foi encontrado", tema);
        	  System.out.println();
        	  System.out.println();
        	  System.out.println("1) Voltar");
        	  System.out.println();
        	  System.out.printf("Digite 1 para voltar ao menu:");
        	  correcao=pl.nextInt();    		      	 
    	  }
    	  
      }
      static void gerenciar_palavras(String temas[][]) {
          char opcao, correcao;
    	  Scanner op = new Scanner(System.in);
    	  Scanner corre = new Scanner(System.in);
    	  do {
    		  lp();
	    	  System.out.println("Gerenciar palavras");
	    	  System.out.println();
	    	  System.out.println("1)Cadastrar palavra");
	    	  System.out.println("2)Excluir palavra");
	    	  System.out.println("3)Buscar palavra");
	    	  System.out.println("4)listar palavra(s)");
	    	  System.out.println("5)Voltar para o menu principal");
	    	  System.out.println();
	    	  System.out.print("Escolha uma opção:");
	    	  opcao=op.next().charAt(0);
	    	  switch (opcao) {
			  case '1': 
				  
				  cadastrar_palavra(temas);
					
			  break;
			  
			  case '2': 
				  excluir_palavra(temas);
				  
			  break;		
			  
			  case '3':
				  buscar_palavra(temas);
				  
			  break;
			  case '4':
				  listar_palavra(temas);
				  
			  break;
			  
			  case '5': 
				  
			  break;
			  
			  default:
				  	lp();
	    	  		System.out.println("Opção inválida");
	    	  		System.out.println();
	    	  		System.out.println("1) Voltar");
	    	  		System.out.println();
	    	  		System.out.printf("Insira uma opcao válida:");
	    	  		correcao=corre.next().charAt(0);				  
	    	  }
    	  }while(opcao!='5');    	      	      	  		     	  	    	      	   	  
      }
      static void cadastrar_palavra(String temas[][]) {
    	  lp();
    	  Scanner corre = new Scanner(System.in);
    	  Scanner pl = new Scanner(System.in);
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  int l1=0, c1=0, lp=0, opcao=0, tema, linha_tema=0,c2, t=0;
    	  boolean teste;
    	  String palap, temap="0", palavra;
    	  char correcao;
    	  
    	  System.out.println("Temas cadastrados:");
    	  System.out.println();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][c1];
    		  if(temap!= null) {
    			  lp++;
    			  
    			  System.out.printf("%d) %s\n", lp, temap);
    			  
    		  }    		  
    	  }
    	  lp=0;
    	  System.out.println();
    	  System.out.print("Escolha um tema para cadastra uma palavra:");
    	  tema=tm.nextInt();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][c1];
    		  if(temap!= null) {
    			  lp++;
    		  }
    		  if(lp==tema) {
    			  linha_tema=l1;
    			  l1=51;
    		  }
		  }
    	  if(temap!=null) {
	    	  do {
	    		  t=0;
		    	  lp();
		    	  System.out.println();
		    	  System.out.printf("Digite a palavra que você deseja cadastrar no tema: %s\n", temap);
		    	  System.out.print("Somente letras minúsculas:");    	  
		    	  palavra=tm.next();
		    	  
		    	  for(c2=0; c2<51; c2++) {
		    		  palap=temas[linha_tema][c2];
		    		  
		    		  if(c2!=51 && palap!=null) {
		    			  teste=palap.contains(palavra);
			    		  if(teste==true){
			    			  lp();
			    			  System.out.println("palavra já cadastrada");
			    			  System.out.println();
					    	  System.out.printf("1) Cadastrar nova palavra no tema: %s\n", temap);
					    	  System.out.println("2) voltar");
					    	  System.out.println();
					    	  System.out.print("Escolha uma opção:");
					    	  opcao=op.nextInt();
					    	  c2=51;
					    	  t=1;
			    		  }
		    		  }
		    	  }
		    	  if(t==0) {
		    		  for(c2=0; c2<51;c2++) {
		    			  palap=temas[linha_tema][c2];
		  	    		  if(palap==null) {
		  	    			temas[linha_tema][c2]=palavra;
		  	    			 c2=51;	    			  
		  	    		  }
		    	  		}
		    	  	  lp();
		    	  	  System.out.println("palavra cadastrada com sucesso!");
		    	  	  System.out.println();
			    	  System.out.println("1) Cadastrar nova palavra");
			    	  System.out.println("2) voltar");
			    	  System.out.println();
			    	  System.out.print("Escolha uma opção:");	    	  	
			    	  opcao=op.nextInt();
		    	  }	    	  
	    	  }while(opcao!=2);
    	  
    	  }else {
    		  lp();
  	  		System.out.println("Opção inválida");
  	  		System.out.println();
  	  		System.out.println("1) Voltar");
  	  		System.out.println();
  	  		System.out.printf("Insira uma opcao válida:");
  	  		correcao=corre.next().charAt(0);
    		  
    	  }
    	  
    	  
      }
      static void excluir_palavra(String temas[][]) {
    	  lp();
    	  Scanner pl = new Scanner(System.in);
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  
    	  int l1, lp=0, c1=0,c2=0, tema, linha_tema=0, palavra;
    	  String temap="0", palap;
    	  
    	  
    	  System.out.println("Temas cadastrados:\n");
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][c1];
    		  if(temap!= null) {
    			  lp++;
    			  
    			  System.out.printf("%d) %s\n", lp, temap);
    			  
    		  }    		  
    	  }
    	  lp=0;
    	  System.out.println();
    	  System.out.print("Escolha um tema para excluir uma palavra:");
    	  tema=tm.nextInt();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][c1];
    		  if(temap!= null) {
    			  lp++;
    		  }
    		  if(lp==tema) {
    			  linha_tema=l1;
    			  l1=51;
    		  }    		
		  }
    	  lp();
    	  System.out.printf("Tema:\n%s\n", temap);
    	  System.out.println();
    	  System.out.printf("Palavras no tema:\n");
    	  lp=0;
    	  for(c2=1; c2<51; c2++) {
    		  palap=temas[linha_tema][c2];
    		  if(palap!= null) {
    			  lp++;
    			  
     			  System.out.printf("%d) %s\n", lp, palap);
    		  }    		  
    	  }
    	  if(lp!=0) {
    	  System.out.println();
    	  System.out.printf("Qual o numero da palavra que deseja excluir:");
    	  palavra=pl.nextInt();
    	  lp=0;
    	  for(c2=1; c2<51; c2++) {
    		  palap=temas[linha_tema][c2];
    		  if(palap!= null) {
    			  lp++;
    			  if(lp==palavra){
    				  temas[linha_tema][c2]=null;
    				  c2=51;
    				  lp();
    	    		  System.out.println();
    	        	  System.out.printf("palavra excluida com sucesso do tema %s", temap);
    	        	  System.out.println();
    	        	  System.out.println();
    	        	  System.out.println("1) Voltar");
    	        	  System.out.println();
    	        	  System.out.printf("Digite 1 para voltar ao menu:");
    	        	  palavra=pl.nextInt();
    				  
    			  }
    		  }
    	  }    	  
    	  }else {
    		  lp();
    		  System.out.println();
        	  System.out.printf("Nenhuma palavra cadastrada no tema %s.", temap);
        	  System.out.println();
        	  System.out.println();
        	  System.out.println("1) Voltar");
        	  System.out.println();
        	  System.out.printf("Digite 1 para voltar ao menu:");
        	  palavra=pl.nextInt();    		  
    	  }
    	  
    	  
    	  
    	  
      }
      static void buscar_palavra(String temas[][]) {
    	  lp();
    	  Scanner pl = new Scanner(System.in);
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  String palavra, palap, temap;
    	  int l1, c1, correcao, lp=0;
    	  boolean teste;
    	  
    	  System.out.println();
    	  System.out.printf("Digite a palavra que você deseja buscar");
    	  System.out.println();
    	  System.out.print("Somente letras minúsculas:");  	  
    	  palavra=tm.next();
    	  lp();
    	  for(l1=0; l1<51; l1++) {
    		  for(c1=1; c1<51; c1++) {
    			  palap=temas[l1][c1];
    			  temap=temas[l1][0];
    			  if(palap !=null){
    				  teste=palap.contains(palavra);
    			  
    				  if(teste==true){    				      				  
	    	    		  System.out.println();
	    	        	  System.out.printf("A palavra %s foi encontrada", palavra);
	    	        	  System.out.println();
	    	        	  System.out.printf("Tema: %s", temap);
	    	        	  System.out.println();
	    	        	  lp++;
    				  }
    			  }
    		  }
    	  }
    	  if(lp>0) {
	    	  System.out.println();
	    	  System.out.println("1) Voltar");
	    	  System.out.println();
	    	  System.out.printf("Digite 1 para voltar ao menu:");
	    	  correcao=pl.nextInt();
    	  }
    	  if(lp==0) {
    		  lp();
    		  System.out.println();
        	  System.out.printf("A palavra %s não foi encontrada em nenhum tema", palavra);
        	  System.out.println();
        	  System.out.println();
        	  System.out.println("1) Voltar");
        	  System.out.println();
        	  System.out.printf("Digite 1 para voltar ao menu:");
        	  correcao=pl.nextInt();    		      	 
    	  }
    	  
      }
      static void listar_palavra(String temas[][]) {
    	  lp();
    	  Scanner pl = new Scanner(System.in);
    	  Scanner corre = new Scanner(System.in);
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  int l1, c1, lp=0, lt, linha_tema=-1, c2;
    	  String temap="0", palap;
    	  char correcao;
    	  
    	  System.out.println("Temas cadastrados:");
    	  System.out.println();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][0];
    		  if(temap!= null) {
    			  lp++;
    			  
    			  System.out.printf("%d) %s\n", lp, temap);
    			  
    		  }    		  
    	  }
    	  lp=0;
    	  System.out.println();
    	  System.out.print("Escolha um tema:");
    	  lt=tm.nextInt();
    	  lp();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][0];
    		  if(temap!= null) {
    			  lp++;
    		  }
    		  if(lp==lt) {
    			  linha_tema=l1;
    			  l1=51;
    		  }
		  }
    	  lp=0;
    	  if(temap!=null) {
    		  System.out.printf("tema: %s", temap);
    		  System.out.println();
    		  System.out.println();
    		  System.out.println("palavras cadastradas:");
        	  for(c2=1; c2<51; c2++) {
        		  palap=temas[linha_tema][c2];
        		  if(palap!= null) {
        			  lp++;
        			  if(lp>0) {
        			  System.out.printf("%d) %s\n", lp, palap);
        			  }
        			  
        		  }    		  
        	  }
        	  	
        	  if(lp==0) {
        		lp();
        		System.out.println();
      	  		System.out.printf("nenhuma palavra cadastrada no tema %s", temap);
      	  		
        	  }
    	  		System.out.println();
    	  		System.out.printf("Digite 1 para voltar:");
    	  		correcao=corre.next().charAt(0);
        	  
    	  }else {
    		  lp();
  	  		System.out.println("Opção inválida");
  	  		System.out.println();
  	  		System.out.println("1) Voltar");
  	  		System.out.println();
  	  		System.out.printf("Insira uma opcao válida:");
  	  		correcao=corre.next().charAt(0);
    	  }
    	  
   
    	  
      }
      static void jogar(String temas[][]) {
    	  lp();
    	  Random random = new Random();
    	  Scanner pl = new Scanner(System.in);
    	  Scanner corre = new Scanner(System.in);
    	  Scanner tm = new Scanner(System.in);
    	  Scanner op = new Scanner(System.in);
    	  
    	  int l1, lp=0, lt, linha_tema=0, qp=0, c2;
    	  String temap, palap, palavra="0";
    	  boolean teste;
    	  
    	  
    	  
    	  System.out.println("Temas cadastrados:");
    	  System.out.println();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][0];
    		  if(temap!= null) {
    			  lp++;
    			  
    			  System.out.printf("%d) %s\n", lp, temap);
    			  
    		  }    		  
    	  }
    	  lp=0;
    	  System.out.println();
    	  System.out.print("Escolha um tema para jogar:");
    	  lt=tm.nextInt();
    	  lp();
    	  for(l1=0; l1<51; l1++) {
    		  temap=temas[l1][0];
    		  if(temap!= null) {
    			  lp++;
    		  }
    		  if(lp==lt) {
    			  linha_tema=l1;
    			  l1=51;
    		  }
		  }
    	  
    	  for(c2=1; c2<51; c2++) {
    		  palap=temas[linha_tema][c2];
    		  if(palap!=null) {
    			  qp++;
    		  }
    	  }
    	  int numero = random.nextInt(qp);
    	  lp=0;
    	  if(numero==0) {
    		  numero++;
    	  }
    	  for(c2=1; c2<51; c2++) {
    		  palap=temas[linha_tema][c2];
    		  if(palap!= null) {
    			  lp++;
    		  }
    		  if(lp==numero) {
    			  palavra=temas[linha_tema][numero];;
    			  c2=51;
    		  }
    	  }  
    		  
    		int erro=0, qt1, qt2, testep=0; 
    		String letras[]= new String[30];
    		String letrap="0";
 
    		  do {
    			  for(qt1=0; qt1<30; qt1++) {
	    			String letra;
	    			System.out.print("Escolha uma letra:");
	    			letra=tm.next();
	    			
	    			lp();
	    			testep=0;
    			  	for(qt2=0;qt2<30;qt2++) {
	    			  	letrap=letras[qt2];
	    			  	if(letrap!=null) {
	    			  		teste=letrap.contains(letra);
	    			  	
	    			  		if(teste==true) {
	    			  			testep=-30;
	    			  			qt2=30;
	    			  		}else {
	    			  			testep++;
	    			  	
	    			  		}
	    			  	}
    			  	}
    			  	if(testep>=0) {
    			  		letras[qt1]=letra;
    			  		teste=palavra.contains(letra);
    			  		if(teste==true) {
    			  			
    			  			
    			  		}else {
    			  			erro++;
    			  		}   			  		
    			  	}else {
    			  		qt1=qt1-1;
    			  		
    			  		System.out.println();
    			    	System.out.print("Essa letra ja foi escolhida");
    			    	System.out.println();
    			  		
    			  	}
    			  	if(erro==5) {
    			  		qt1=30;
    			  	}
    			  }    		  
    		  }while(erro<5);
    		  char correcao;
    		  if(erro==5) {
    		  	lp();
    	  		System.out.println("Você perdeu");
    	  		System.out.println();
    	  		System.out.printf("Digite 1 para voltar: ");
    	  		correcao=corre.next().charAt(0);
    		  }
    		  
    		  
    		  
    		  
		      	  
      }
}