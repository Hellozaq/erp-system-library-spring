package com.biblioteca.erp_biblioteca;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(properties = {
    "spring.flyway.enabled=false",
    "spring.security.basic.enabled=false"
})
@ActiveProfiles("test")
class ErpBibliotecaApplicationTests {

	@Test
	void contextLoads() {
	}

}
