package courcesa.modulo.um.pilha;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PilhaTest {
	
	private Pilha p;
	
	@Before
	public void inicializaPilha(){
		p = new Pilha(10);		
	}

	@Test
	public void pilhaVazia() {		
		
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());		
	}
	
	@Test
	public void empilhaUmElemento() {		
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
	}
	
	@Test
	public void empilhaAndDesempilha() {		
		p.empilha("primeiro");
		p.empilha("segundo");
		
		assertEquals(2, p.tamanho());
		assertEquals("segundo", p.topo());
		Object desempilhado = p.desempilha();
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
		assertEquals("segundo", desempilhado);
	}

	
	@Test(expected=PilhaVaziaException.class)
	public void removeDaPilhaVazia(){
		p.desempilha();
	}
	
	@Test
	public void adicionaNaPilhaCheia(){
		int i = 0;
		do {
			p.empilha("elemento " + i);
			i++;
		} while (i < 10);	
		
		try {
			p.empilha("Booomm");
			fail();
		} catch (PilhaCheiaException e) {}
	}
}
