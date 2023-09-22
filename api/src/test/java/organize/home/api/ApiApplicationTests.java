package organize.home.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import organize.home.api.domain.entities.Material;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	void testListOfMaterial() {
		ResponseEntity<Material[]> response = testRestTemplate.getForEntity("/api/v1/material", Material[].class);
		assertEquals(HttpStatus.OK, response.getStatusCode());
	}
}