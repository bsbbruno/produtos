package br.com.brittus.produtos;

import static org.junit.Assert.*;
import org.junit.Test;


public class ProdutoTest {
	
	@Test
	public void deveSetarAsVariaveis() {
		
		Produto bala = new Produto("bala", 15.30);
		assertEquals(15.30, bala.getValor(), 0.0);
		assertEquals("bala", bala.getNome());
		
	}
	
}
