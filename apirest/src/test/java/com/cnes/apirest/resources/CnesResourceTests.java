package com.cnes.apirest.resources;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.cnes.apirest.models.Cnes;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CnesResourceTests {

	@Autowired
	private TestRestTemplate template;

	@Test
	public void listaCnesPorId() throws Exception {
		ResponseEntity<Cnes> response = template.getForEntity("http://localhost:8080/cnes/ativo/6612741", Cnes.class);
		Cnes cnes = response.getBody();

		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertNotNull(cnes);
	}

	@Test
	public void listaCnesPorUf() throws Exception {
		
		ResponseEntity<Void> response = template.exchange("/cnes/Estado/SE", HttpMethod.GET, null, Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
	
	@Test
	public void listaCnesPorTipoUnidade() throws Exception {
		
		ResponseEntity<Void> response = template.exchange("/cnes/Tipos/POLICLINICA", HttpMethod.GET, null, Void.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
	}
}
