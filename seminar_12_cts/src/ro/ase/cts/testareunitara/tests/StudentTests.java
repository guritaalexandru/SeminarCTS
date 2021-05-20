package ro.ase.cts.testareunitara.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.testareunitara.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		
		assertEquals("Numele nu a fost initializat",nume, student.getNume());
		//assertNotEquals(student.getNote(), null);
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
	}
	
	@Test
	public void testSetterNume() {
		String nume = "Gigel";
		Student student = new Student();
		
		student.setNume(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student();
		
		int nota = 10;
		student.adaugaNota(nota);
		
		assertEquals(1, student.getNote().size());
	}

}
