El **Patrón Observer** (u “Observador”) establece una relación de **uno a muchos** entre objetos, de modo que cuando un objeto (llamado “Sujeto” u “Observable”) cambia su estado, **notifica automáticamente** a todos los objetos dependientes (llamados “Observadores”). Cada observador puede reaccionar de manera distinta a la notificación, sin que el sujeto conozca sus implementaciones específicas.

A grandes rasgos, el patrón provee un mecanismo para que diversas partes de tu sistema se sincronicen cuando ocurre un evento o cambio de estado, todo **sin acoplar** fuertemente las clases.

---

## ¿Cuándo usar el Patrón Observer?

1. **Necesitas notificaciones automáticas**
    
    - Cuando un objeto cambia y quieres que otras partes del sistema se enteren de inmediato (por ejemplo, una interfaz gráfica que se actualiza cuando cambian datos).
2. **Evitar “polling” o chequeos constantes**
    
    - En lugar de que cada componente pregunte todo el tiempo “¿Cambió algo?”, el sujeto avisa sólo cuando hay una modificación.
3. **Desacoplamiento**
    
    - El sujeto no debe saber quién está observándolo, ni cuántos observadores hay, ni qué hacen con la información. Simplemente los _notifica_.

---

## Estructura del Patrón

1. **Sujeto (Subject/Observable)**
    
    - Mantiene una lista de observadores.
    - Ofrece métodos para suscribirse (`attach/addObserver`) y para quitar la suscripción (`detach/removeObserver`).
    - Cada vez que cambia su estado o detecta un evento relevante, **notifica** a todos los observadores (llamando a un método como `notifyObservers()`).
2. **Observador (Observer)**
    - Define una interfaz, por ejemplo: 
	- Cada observador implementa esa interfaz y se registra en el sujeto que le interesa.
    - Cuando el sujeto llama a `update(...)`, el observador ejecuta la acción que requiera (actualizar pantalla, recalcular un valor, etc.).
```java
interface Observer {
    void update(State newState);
}
```

---

## Ejemplo en Java

Imagina que tienes una clase `WeatherData` que provee información sobre temperatura, humedad y presión, y quieres que varias pantallas de visualización se actualicen automáticamente cuando cambien estos valores.

**Sujeto (Observable):**

```java
public class WeatherData {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Método que invoca cambios en el estado y notifica
    public void setMeasurements(float temp, float hum, float pres) {
        this.temperature = temp;
        this.humidity = hum;
        this.pressure = pres;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }
}

```

**Observador:**

```java
public interface Observer {
    void update(float temp, float humidity, float pressure);
}

```

**Observador Concreto (ej. CurrentConditionsDisplay):**

```java
public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println(
            "Current conditions: " +
            temperature +
            "C degrees and " +
            humidity +
            "% humidity"
        );
    }
}

```

Al crear una instancia de `CurrentConditionsDisplay` y suscribirla a `WeatherData`:

```java
public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();

    weatherData.addObserver(currentDisplay);

    // Simular nuevos datos
    weatherData.setMeasurements(28.3f, 65f, 1013.1f);
    // currentDisplay se actualiza automáticamente
}

```

Cada vez que cambian las mediciones (con `setMeasurements`), se llama a `notifyObservers()`, que ejecuta el `update(...)` de cada observador.

---

## Buenas Prácticas y Consejos

1. **Gestión de suscripciones**
    
    - Asegúrate de dar métodos claros para añadir y remover observadores, evitando fugas de memoria o notificaciones a observadores inexistentes.
2. **Evita notificaciones recursivas**
    
    - Diseña cuidadosamente cuándo y cómo se notifica. Si los observadores cambian el estado del sujeto, podría producirse una cascada infinita de notificaciones.
3. **Múltiples sujetos**
    
    - Un observador puede suscribirse a varios sujetos a la vez, siempre que implementen la misma interfaz de notificación.
4. **Cambiar a Pub/Sub**
    
    - Para aplicaciones más grandes o distribuidas, a veces se usa un sistema de mensajería tipo “Publish/Subscribe” (similar en concepto, pero con un middleware que desacopla el emisor y el receptor).

---

## Ejemplos Reales

- **Interfaces Gráficas (GUI)**: En la mayoría de frameworks (Swing, JavaFX, React, Angular, etc.), los componentes se “suscriben” a eventos, y cuando el estado cambia, la UI se actualiza.
- **Notificaciones**: Sistemas de notificaciones en aplicaciones móviles o correos que se disparan cuando ocurre cierto evento.
- **Streams de datos**: Observadores que reciben actualizaciones constantes (datos en tiempo real).

---

## Recursos para Profundizar

1. **“Head First Design Patterns”** (Kathy Sierra, Bert Bates, Elisabeth Freeman, Eric Freeman): Explica este patrón con el ejemplo del _Weather Station_.
2. **“Design Patterns: Elements of Reusable Object-Oriented Software”** (GoF): Contiene el capítulo original sobre el patrón Observer (también conocido como Subject-Observer).
3. **Refactoring Guru** (sitio web): Provee explicaciones, diagramas y ejemplos en varios lenguajes para el patrón Observer.

---

### Conclusión

El **Patrón Observer** es un mecanismo muy común para **mantener un sistema modular y desacoplado**, especialmente en situaciones donde hay múltiples interesados en los cambios de un objeto. Cada observador “escucha” a un sujeto y reacciona en su `update()` sin que el sujeto necesite saber detalles de su implementación.