SELECT 
    categories.name AS category_name, 
    SUM(products.amount) AS total_products
FROM 
    products
INNER JOIN 
    categories 
ON 
    products.id_categories = categories.id
GROUP BY 
    categories.name;
