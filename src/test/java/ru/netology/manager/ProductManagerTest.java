package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductManagerTest {

    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);
    private Book item1 = new Book(1, "Harry Potter", 800, "J.Rowling");
    private Book item2 = new Book(2, "Buratino", 500, "Tolstoy");
    private Book item3 = new Book(3, "Lord Of The Rings", 600, "Tolkien");
    private Smartphone item4 = new Smartphone(4, "Iphone", 100000, "USA");
    private Smartphone item5 = new Smartphone(5, "OnePlus", 60000, "China");
    private Smartphone item6 = new Smartphone(6, "Samsung", 70000, "South Korea");
    private Smartphone item7 = new Smartphone(7, "Oppo", 50000, "China");

    @BeforeEach
    public void setUp() {

        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
        manager.add(item6);
        manager.add(item7);
    }

    @Test
    void shouldProductFindByName() {

        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = new Product[]{item4};

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldBookFindByName() {

        Product[] actual = manager.searchBy("Lord Of The Rings");
        Product[] expected = new Product[]{item3};

        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldBookFindByAuthor() {

        Product[] actual = manager.searchBy("J.Rowling");
        Product[] expected = new Product[]{item1};

        assertArrayEquals(expected, actual);

    }

    @Test
    void ShouldSmartPhoneFindByName() {

        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = new Product[]{item4};

        assertArrayEquals(expected, actual);


    }

    @Test
    void ShouldSmartPhoneFindByManufacture() {

        Product[] actual = manager.searchBy("China");
        Product[] expected = new Product[]{item5, item7};

        assertArrayEquals(expected, actual);

    }



















    /*@Test
    void shouldFindProductByName() {
        Product product1 = new Product(1,"Iphone", 100000);
        Product product2 = new Product(2,"OnePlus", 60000);
        Product product3 = new Product(3,"Harry Potter", 800);

        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);

        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = new Product[]{product1};


        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindBookByName() {

        Book book1 = new Book(1, "Harry Potter", 800, "J.Rowling");
        Book book2 = new Book(2, "Buratino", 500, "Tolstoy");
        Book book3 = new Book(3, "Lord Of The Rings", 800, "Tolkien");

        ProductRepository repository = new ProductRepository();
        ProductManager manager = new ProductManager(repository);

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] actual = manager.searchBy("Buratino");
        Product[] expected = new Product[]{book2};

        assertArrayEquals(expected, actual);*/




    }




