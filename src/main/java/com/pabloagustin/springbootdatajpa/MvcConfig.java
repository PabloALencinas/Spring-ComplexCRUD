package com.pabloagustin.springbootdatajpa;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Paths;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    // Sobreescribimos el siguiente metodo para agregar RECURSOS a nuestro proyecto
    // Para el manejo de las fotos de los clientes fuera del proyecto
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        WebMvcConfigurer.super.addResourceHandlers(registry);
        // Registrar nuestra ruta como recurso estatico
        // Mapeamos este directorio de imagenes a una ruta URL
        String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();

        registry.addResourceHandler("/uploads/**")
                .addResourceLocations(resourcePath);
    }

     */
}
