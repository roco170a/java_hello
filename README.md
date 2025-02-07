# CI/CD con AWS

Este proyecto es un microservicio en Java Spring Boot que demuestra el uso de Terraform, Workflows, CI/CD (Integración Continua/Despliegue Continuo) y despliegue automático en AWS.

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

## Contacto -edited

Si tienes alguna pregunta o necesitas ayuda, no dudes en contactarme:

- **Email**: roco170@gmail.com
