           /El patrón Strategy define familias de algoritmos, haciendolos intercambiables entre ellos.

  

En estas páginas se muestra cómo se aplica el **Patrón Strategy** para manejar el comportamiento de vuelo y graznido en la jerarquía de la clase `Duck`. La clave está en que, en lugar de que cada pato implemente directamente sus métodos de `fly()` y `quack()`, se **delegan** esas responsabilidades a **objetos de comportamiento**:

  

---

  

### Paso 1: Agregar variables de tipo interfaz en `Duck`

- Se introducen dos variables: `FlyBehavior flyBehavior` y `QuackBehavior quackBehavior`.

- Cada una es un **tipo de interfaz** (no una clase concreta), para que cada objeto `Duck` pueda inyectar la implementación que necesite (por ejemplo, `FlyWithWings`, `FlyNoWay`, `Quack`, `Squeak`, etc.).

- Se eliminan los métodos `fly()` y `quack()` de la clase `Duck` (y subclases), porque ahora `Duck` no maneja directamente esos comportamientos.

  

### Paso 2: Delegar el comportamiento con `performFly()` y `performQuack()`

- En lugar de `fly()` y `quack()`, la clase `Duck` define métodos “intermediarios”:

```java
public void performFly() {
    flyBehavior.fly();
}

public void performQuack() {
    quackBehavior.quack();
}

```

- Estos métodos se limitan a llamar al comportamiento que tenga asignado el pato (sea volar con alas, no volar, graznar, chillar, etc.).

  

### Paso 3: Configurar los comportamientos en las subclases

- Cada subclase de `Duck` (por ejemplo, `MallardDuck`) **inicializa** sus comportamientos en el constructor:

```java
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack(); // Grazna como un pato real

        flyBehavior = new FlyWithWings(); // Vuela con alas
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

```

- Así, cada tipo de pato elige la implementación concreta adecuada para sus acciones.

  

---

  

### ¿Por qué es útil?

  

1. **Flexibilidad**: Si mañana quieres un pato que vuele con cohetes (`FlyRocketPowered`), basta con crear esa clase que implemente `FlyBehavior` y asignarla al pato.

2. **Mantenimiento sencillo**: En vez de llenar subclases con métodos repetidos o condicionales interminables, se centraliza cada “forma de volar” o “tipo de graznido” en su propia clase.

3. **Cambio en tiempo de ejecución**: Podrías incluso ofrecer métodos `setFlyBehavior()` o `setQuackBehavior()` para cambiar el comportamiento mientras el programa corre (por ejemplo, un pato herido deja de volar).

  

En resumen, estas páginas enseñan cómo, aplicando Strategy, se logra que los patos sean más **modulares** y **extensibles** al delegar sus acciones de vuelo y graznido a objetos intercambiables en lugar de incrustar la lógica en la misma clase `Duck`.