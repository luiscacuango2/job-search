# Guía de Contribución

¡Gracias por tu interés en colaborar con **Job Search CLI**! Este proyecto se rige por altos estándares de **Clean Code** y **Programación Funcional**. Sigue estas directrices para que tu proceso de contribución sea ágil y exitoso.

---

## Flujo de Trabajo (Workflow)

Para mantener el historial del proyecto limpio, seguimos el modelo de *Fork & Pull*:

1.  **Fork**: Crea una copia del repositorio en tu perfil de GitHub.
2.  **Clonación**: Trae el código a tu máquina local.
    ```bash
    git clone https://github.com/luiscacuango2/job-search.git
    cd job-search
    ```
3.  **Rama de Trabajo**: Crea una rama descriptiva para tus cambios.
    ```bash
    git checkout -b feature/nueva-funcionalidad
    # o
    git checkout -b fix/nombre-del-error
    ```
4.  **Validación**: Antes de realizar cualquier commit, asegúrate de que el proyecto compile y pase las validaciones de Gradle.
    ```bash
    ./gradlew clean build
    ```

---

## Estándares de Ingeniería

### Paradigma Funcional
Este proyecto **no utiliza bucles tradicionales** (`for`, `while`) a menos que sea estrictamente necesario por rendimiento.
* **Streams & Lambdas**: Utiliza flujos para transformar y filtrar datos.
* **Inmutabilidad**: Evita modificar estados; prefiere el retorno de nuevos objetos.
* **Optional**: Prohibido el uso de `null`. Envuelve los retornos inciertos en `Optional<T>`.

### Estilo de Java (Modern Java)
Aprovechamos las características de **Java 21**:
* Usa `records` para modelos de datos simples (DTOs).
* Aplica `switch` expressions y *Pattern Matching* cuando sea posible.
* Sigue las [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).

---

## Convención de Commits

Implementamos [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) para facilitar el mantenimiento.

| Tipo | Descripción |
| :--- | :--- |
| `feat` | Una nueva funcionalidad para el usuario. |
| `fix` | Corrección de un error o bug. |
| `docs` | Cambios únicamente en la documentación. |
| `refactor` | Cambio de código que no corrige un error ni añade funcionalidad. |
| `style` | Cambios de formato (espacios, comas) que no afectan la lógica. |
| `test` | Añadir o corregir pruebas existentes. |

**Ejemplo:** `feat: implementar filtro local por país usando Predicates`

---

## Envío de Pull Requests (PR)

Al abrir un PR, asegúrate de completar la siguiente información en la descripción:

1.  **Contexto**: ¿Qué problema resuelve o qué mejora aporta?
2.  **Cambios Críticos**: Lista los archivos o métodos clave modificados.
3.  **Pruebas**: ¿Cómo has verificado que el cambio funciona? (ej. captura de pantalla de la terminal).

> [!TIP]
> Mantén tus PRs enfocados. Si tienes dos funcionalidades distintas, abre dos PRs separados.

---

## Código de Conducta

Buscamos un entorno profesional y acogedor. Se espera que los colaboradores traten a los demás con respeto, realicen críticas constructivas y se centren en lo mejor para la comunidad del proyecto.

---
¡Gracias por ayudar a mejorar este proyecto!
**Luis Cacuango** - [luiscacuango2084@gmail.com](mailto:luiscacuango2084@gmail.com)