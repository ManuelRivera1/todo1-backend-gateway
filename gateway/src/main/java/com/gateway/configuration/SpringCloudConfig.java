package com.gateway.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuraciones de los routes del gateway
 */
@Configuration
public class SpringCloudConfig {

	/** URI del microservicio de datos para consultas */
	@Value("${uri.consultas}")
	private String uriConsultas;

	/** URI del microservicio de obtener los datos generales */
	@Value("${uri.general}")
	private String uriGeneral;

	
    
	/**
	 * Metodo que permite configurar los routers del gateway
	 */
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/consultas/**")
                        .uri(this.uriConsultas)
                        .id("cosultasModule"))

                .route(r -> r.path("/general/**")
                        .uri(this.uriGeneral)
                        .id("generalModule"))
                
                .build();
    }
}
