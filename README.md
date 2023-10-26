# lab3

## Крок 1: Створення базових сутностей
 1.1. Створюємо клас Product з атрибутами id, name, та price:

 ```java
 public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    // Геттери і сеттери
}
```

1.2. Створюємо клас Cart, який буде зберігати список продуктів:

```java
public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }
    
    // Методи для додавання та видалення продуктів
    // Геттери і сеттери
}
```

1.3. Створюємо клас Order з атрибутами orderId, products, та status:

```java
public class Order {
    private int orderId;
    private List<Product> products;
    private OrderStatus status;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
        this.status = OrderStatus.NEW;
    }

    // Методи для розміщення замовлення та отримання статусу
    // Геттери і сеттери
}
```

## Крок 2: Додавання функціональності

2.1. Реалізуємо функції addProduct та removeProduct в класі Cart для додавання та видалення продукту з кошика.

```java
public void addProduct(Product product) {
    products.add(product);
}

public void removeProduct(Product product) {
    products.remove(product);
}
```

2.2. Реалізуємо функцію placeOrder в класі Order для розміщення замовлення.

```java
public void placeOrder() {
    // Розміщення замовлення
    status = OrderStatus.PROCESSING;
}
```

## Крок 2: Додавання тестів JUnit

Приклад тесту: 

```java

@Before
    public void setUp() {
        product1 = new Product(1, "Product 1", 10.0);
        product2 = new Product(2, "Product 2", 20.0);
        cart = new Cart();
        order = new Order(1, new ArrayList<>());
    }

    @Test
    public void testAddProductToCart() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(2, cart.getProducts().size());
    }
```
