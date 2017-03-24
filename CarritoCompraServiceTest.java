package com.everis.bootcamp.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.everis.bootcamp.tallerjunit.Articulo;
import com.everis.bootcamp.tallerjunit.CarritoCompraService;

@RunWith(SorterRunner.class)
public class CarritoCompraServiceTest {

	private static CarritoCompraService carro;
	
	@BeforeClass public static void crearCarro(){
		carro = new CarritoCompraService();
		System.out.println("Before Class hecho. Construccion terminada.");
	}
	
	@Before public void setUp(){
		//Se limpia el carro antes de cada test.
		carro.limpiarCesta();
	}
	
	/*
	@Test public void test(){
		System.out.println("Holaquetal");
	}
	
	@Test public void addArticuloFunciona1(){
		//Carrito vacio.
		Articulo prueba = new Articulo();
		carro.addArticulo(prueba);
		
		//Miramos si tiene un articulo.
		assertTrue("La lista NO tiene un elemento", carro.getArticulos().size()== 1);
		//Miramos si es el mismo articulo (la referencia sera la misma).
		assertTrue("La lista NO tiene el mismo elemento añadido nuevo (distinta referencia)", carro.getArticulos().get(0)== prueba);
		
		//Probamos a añadir otro objeto.
		prueba = new Articulo();
		carro.addArticulo(prueba);
		//Miramos si tiene dos articulo.
		assertTrue("La lista AUN tiene un elemento", carro.getArticulos().size()== 2);
		//Miramos si es el mismo articulo (la referencia sera la misma).
		assertTrue("La lista NO tiene el mismo elemento añadido nuevo (distinta referencia)", carro.getArticulos().get(1)== prueba);
		
		//Va añadiendo articulos uno detras de otro correctamente.
	}
	
	
	@Test public void limpiarCestaTest1(){
		//Añadimos
		Articulo prueba = new Articulo();
		carro.addArticulo(prueba);
		
		//Cesta llena.
		carro.limpiarCesta();
		
		assertTrue("No se ha limpiado la cesta", carro.getArticulos().size()==0);
	}
	
	@Test public void totalPrecioTest1(){
		//Creamos articulos randoms y guardamos su precio.
		Articulo[] varios = new Articulo[10];
		double suma =0;
		Random rng = new Random();
		for(int i=0; i<varios.length; i++){
			varios[i] = new Articulo();
			varios[i].setPrecio(rng.nextDouble()*1000);
			carro.addArticulo(varios[i]);
			suma += varios[i].getPrecio();
		}
		
		//Deberian corresponder el que nos devuelve el metodo y nuestra suma.
		assertEquals("El precio total no corresponde al de los articulos metidos", new Double(suma), carro.totalPrice());
			
	}
	
	@Test public void calcularDescuentoTest1(){
		//Es mil veces mejor probar casos discretos. Para tener control de que metemos y que deberia salir.
		Random rng = new Random();
		Double precio = new Double(rng.nextDouble()*100);
		Double descuento = new Double(rng.nextDouble());
		
		//Deberia devolver esto el metodo.
		assertEquals("El descuento no es el valor correcto", CarritoCompraService.calculadorDescuento(precio, descuento), new Double(precio-(precio*descuento/100)));
	}
	*/
	
	@Test public void Test1(){
		//Carrito vacio.
				Articulo prueba = new Articulo();
				carro.addArticulo(prueba);
				
				//Miramos si tiene un articulo.
				assertTrue("La lista NO tiene un elemento", carro.getArticulos().size()== 1);
				//Miramos si es el mismo articulo (la referencia sera la misma).
				assertTrue("La lista NO tiene el mismo elemento añadido nuevo (distinta referencia)", carro.getArticulos().get(0)== prueba);
				
				//Probamos a añadir otro objeto.
				prueba = new Articulo();
				carro.addArticulo(prueba);
				//Miramos si tiene dos articulo.
				assertTrue("La lista AUN tiene un elemento", carro.getArticulos().size()== 2);
				//Miramos si es el mismo articulo (la referencia sera la misma).
				assertTrue("La lista NO tiene el mismo elemento añadido nuevo (distinta referencia)", carro.getArticulos().get(1)== prueba);
				
				//Va añadiendo articulos uno detras de otro correctamente.
	}
	
	@Test public void Test2(){
		//Creamos articulos randoms y guardamos su precio.
		Articulo[] varios = new Articulo[10];
		double suma =0;
		Random rng = new Random();
		for(int i=0; i<varios.length; i++){
			varios[i] = new Articulo();
			varios[i].setPrecio(rng.nextDouble()*1000);
			carro.addArticulo(varios[i]);
			suma += varios[i].getPrecio();
		}
		
		//Deberian corresponder el que nos devuelve el metodo y nuestra suma.
		assertEquals("El precio total no corresponde al de los articulos metidos", new Double(suma), carro.totalPrice());
	}
	
	@Test public void Test3(){
		//Añadimos
		Articulo prueba = new Articulo();
		carro.addArticulo(prueba);
		
		//Cesta llena.
		carro.limpiarCesta();
		
		assertTrue("No se ha limpiado la cesta", carro.getArticulos().size()==0);
	}
	
	@AfterClass public static void terminarCarro(){
		carro = null;
		System.out.println("Carro seleccionable por el recolector de basura. After class terminado");
	}
	
}
