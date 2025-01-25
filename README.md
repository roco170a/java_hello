# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/3.4.1/reference/using/devtools.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)



# Ejemplo de CICD en AWS

Este proyecto es un microservicio desarrollado en Java Spring Boot que demuestra el uso de workflows, CI/CD (Integración Continua/Despliegue Continuo) y despliegue automático en AWS.

## Descripción

El microservicio está diseñado para mostrar cómo implementar un flujo de trabajo de CI/CD utilizando GitHub Actions y Terraform para desplegar automáticamente en AWS. El servicio expone un endpoint de salud que puede ser consultado para verificar el estado del servicio.

## Instalación

El despliegue del microservicio en AWS se realiza de manera automática a través de GitHub Actions. No es necesario realizar instalaciones manuales.

## Uso

Una vez desplegado, puedes verificar el estado del servicio navegando a la siguiente ruta:


http://3.146.178.27:8080/health


## Estructura del Proyecto

El proyecto está estructurado como un microservicio en Java Spring Boot. La configuración de CI/CD se maneja mediante GitHub Actions, y la infraestructura en AWS se gestiona con Terraform.

## Contribución

Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añade nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Licencia

Este proyecto está licenciado bajo la licencia Apache 2.0. Consulta el archivo [LICENSE](LICENSE) para más detalles.

## Créditos

- **Roberto Corona** - Desarrollador principal.

## Contacto

Si tienes alguna pregunta o necesitas ayuda, no dudes en contactarme:

- **Email**: roco170@gmail.com