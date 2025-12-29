# Job Search CLI

![Java](https://img.shields.io/badge/Java-21.0.5-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-8.12-blue?style=for-the-badge&logo=gradle&logoColor=white)
![Status](https://img.shields.io/badge/Status-Gradle_9_Ready-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

**Job Search CLI** es una herramienta profesional de línea de comandos para la búsqueda centralizada de ofertas laborales. Desarrollado bajo el paradigma de **Programación Funcional**, el proyecto utiliza flujos de datos inmutables y procesamiento reactivo para interactuar con la API de [Arbeitnow](https://www.arbeitnow.com/).

---

## Características Principales

* **Arquitectura de Vanguardia:** Configurado con **Java 21 (LTS)** y **Gradle 8.12**, optimizado para el rendimiento y preparado para la transición a Gradle 9.
* **Paradigma Funcional:** Uso extensivo de `Java Streams`, `Optional` y `Lambdas` para un procesamiento de datos limpio y sin efectos secundarios.
* **Consumo de API Declarativo:** Integración con **OpenFeign** para una comunicación eficiente y desacoplada con servicios REST.
* **CLI Robusto:** Gestión avanzada de argumentos mediante **JCommander**, incluyendo validaciones personalizadas y ayuda dinámica.
* **Filtrado Inteligente:** Implementación de predicados locales para garantizar resultados precisos por ubicación (ej. Ecuador) y tipo de jornada.

---

## Stack Tecnológico

| Tecnología | Propósito |
| :--- | :--- |
| **Java 21 (Temurin)** | Runtime de alto rendimiento y lenguaje principal. |
| **Gradle 8.12** | Automatización de compilación y gestión de dependencias (Toolchains). |
| **OpenFeign** | Cliente HTTP declarativo para consumo de servicios externos. |
| **JCommander** | Motor de parseo para interfaces de línea de comandos. |
| **Gson** | Deserialización y manejo de estructuras de datos JSON. |

---

## Configuración e Instalación

### Requisitos previos
* **Java 21** (Recomendado vía [SDKMAN!](https://sdkman.io/)):
    ```bash
    sdk install java 21.0.5-tem
    ```
* **Gradle 8.12** (Gestionado automáticamente por el wrapper incluido en el proyecto).

### Instalación
1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/luiscacuango2/job-search.git
    cd job-search
    ```

2.  **Construir el proyecto:**
    ```bash
    ./gradlew build
    ```

---

## Guía de Uso

Ejecuta la aplicación pasando las opciones deseadas seguidas de la palabra clave (`KEYWORD`):

### Ejemplos de Comandos:

* **Búsqueda por ubicación específica:**
    ```bash
    ./gradlew run --args="--location Ecuador java"
    ```

* **Trabajos remotos (Full-Time):**
    ```bash
    ./gradlew run --args="--full-time --location Remote python"
    ```

* **Manual de ayuda:**
    ```bash
    ./gradlew run --args="--help"
    ```

### Referencia de Argumentos:

| Argumento | Descripción | Requerido |
| :--- | :--- | :--- |
| `KEYWORD` | Término de búsqueda (ej. Java, Spring, React). | **Sí** |
| `--location`, `-l` | Filtra por ciudad o país (ej. Ecuador, Quito). | No |
| `--full-time` | Filtra solo empleos de jornada completa. | No |
| `--help` | Muestra la documentación de comandos. | No |

---

## Convenciones de Código

Se utiliza **Conventional Commits** para la gestión del historial:
* `feat:` Nuevas funcionalidades.
* `fix:` Corrección de errores.
* `refactor:` Mejoras en código sin cambios funcionales.
* `docs:` Actualización de documentación técnica.

---

### Contribución

¡Las contribuciones son bienvenidas! Por favor, lee nuestro archivo [CONTRIBUTING.md](CONTRIBUTING.md) para conocer los detalles sobre nuestro código de conducta y el proceso para enviarnos pull requests.

### Licencia
.
Este proyecto está bajo la Licencia MIT - mira el archivo [LICENSE](LICENSE) para más detalles.

---

## Autor
**Luis Cacuango**
* [GitHub Profile](https://github.com/luiscacuango2)

---
*Desarrollado con pasión por el Clean Code y la Programación Funcional.*