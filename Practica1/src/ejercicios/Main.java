package ejercicios;

public class Main {
	public static void main(String[] args) {

		Pedido pedido = new Pedido(1);

		Producto keyboard = new Producto("Teclado", 25.50);
		Producto mouse = new Producto("Ratón", 15.00);

		pedido.addProduct(keyboard);
		pedido.addProduct(mouse);

		System.out.println("Número de pedido: " + pedido.getNumber());
		System.out.println("Estado del pedido: " + pedido.getStatus());
		System.out.println("Total del pedido: " + pedido.calculateTotal() + " €");

		pedido.setStatus(EstadoPedido.ENVIADO);

		System.out.println("Estado del pedido tras el cambio: " + pedido.getStatus());
	}
}

/*

¿Qué tipo de relación se define en el diagrama UML entre Pedido y Producto?

En el diagrama UML que usamos, la relación entre Pedido y Producto está representada así:

Pedido "1" *-- "0..*" Producto : productos

El símbolo `*--` indica composición (relleno en el rombo negro).
Esto significa que un pedido contiene productos, y que los productos no existen por sí mismos fuera del pedido en este sistema.
En otras palabras, un Pedido es responsable de crear y eliminar los Producto que tiene.

Si fuera solo Pedido ---- Producto, sería una asociación simple, sin implicar propiedad fuerte.

---

¿Qué significa la cardinalidad indicada en esa relación?

La cardinalidad es:

Pedido "1" *-- "0..*" Producto

`"1"` en el lado de Pedido → cada producto pertenece exactamente a un pedido.
`"0..*"` en el lado de Producto → un pedido puede tener cero o muchos productos.

En palabras:
Un pedido puede no tener productos o tener varios, pero cada producto está siempre asociado a un único pedido.

---

¿Qué otros tipos de cardinalidad se pueden definir en UML?

En UML la cardinalidad indica cuántos objetos de una clase pueden asociarse a otro. Algunos ejemplos:

| Cardinalidad | Significado     | Ejemplo práctico                                   |
| ------------ | --------------- | -------------------------------------------------- |
| `1..1`       | Exactamente uno | Cada persona tiene exactamente un DNI              |
| `0..1`       | Cero o uno      | Un empleado puede tener o no un seguro médico      |
| `1..*`       | Uno o más       | Una clase escolar tiene al menos un estudiante     |
| `0..*`       | Cero o más      | Un pedido puede tener cero o varios productos      |
| `3..5`       | Entre 3 y 5     | Una reunión requiere entre 3 y 5 asistentes        |

---

¿Qué diferencias existen entre asociación, agregación y composición?

| Tipo de relación | Símbolo UML           | Explicación básica                                                                                                                                                |
| ---------------- | --------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Asociación       | Línea simple          | Relación “normal” entre objetos, sin propiedad fuerte. Por ejemplo: `Profesor ---- Curso`                                                                         |
| Agregación       | Línea con rombo vacío | Relación “tiene un” más débil, los objetos pueden existir de forma independiente. Ej.: `Clase <> Estudiante` (los estudiantes existen aunque la clase se elimine) |
| Composición      | Línea con rombo negro | Relación “parte de” fuerte. El objeto contenido depende del contenedor. Ej.: `Pedido *-- Producto` (si se elimina el pedido, sus productos también)               |


*/