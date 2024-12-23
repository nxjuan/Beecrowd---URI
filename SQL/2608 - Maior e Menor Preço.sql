SELECT 
    (SELECT MAX(price) FROM products) AS price, 
    (SELECT MIN(price) FROM products) AS price;