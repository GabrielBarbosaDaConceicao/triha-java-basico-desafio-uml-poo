package aplication;

import entities.IPhone;

public class SmartPhone {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone();
		
		System.out.println("IPod");
		// IPod
		iphone.tocarMusica();
		iphone.pausarMusica();
		iphone.silenciarMusica();
		
		System.out.println();
		System.out.println("Telefone");
		
		// Telefone
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioDeVoz();
		
		System.out.println();
		System.out.println("Internet");
		
		// Internet
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}

}
