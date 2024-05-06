package entities;

import interfaces.IPod;
import interfaces.Internet;
import interfaces.Telefone;

public class IPhone implements IPod, Telefone, Internet{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBIR PÁGINA");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONAR NOVA ABA");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZAR PÁGINA");
		
	}

	@Override
	public void ligar() {
		System.out.println("FAZER LIGAÇÃO");
		
	}

	@Override
	public void atender() {
		System.out.println("ATENDER");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("INICIAR CORREIO DE VOZ");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("TOCAR MUSICA");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("PAUSAR MUSICA");
		
	}

	@Override
	public void silenciarMusica() {
		System.out.println("SILENCIAR MUSICA");
		
	}

}
