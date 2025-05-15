# Serenity BDD + Screenplay: E2E de Compra en OpenCart

Este proyecto automatiza un flujo completo de compra en [OpenCart](http://opencart.abstracta.us/), aplicando el patrón Screenplay con Serenity BDD.

## Flujo Automatizado
1. Agrega dos productos al carrito
2. Visualiza el carrito
3. Completa la compra como invitado (Guest Checkout)
4. Finaliza con éxito hasta el mensaje: “Your order has been placed!”

## Tecnologías
- Java 17
- Maven 3.9.8
- Serenity BDD 3.6.12
- Screenplay Pattern
- Selenium WebDriver
- JUnit 4
- Chrome Driver 136.0.7103.114
## Cómo ejecutar
```bash
mvn clean verify
