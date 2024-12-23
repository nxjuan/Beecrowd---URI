SELECT prod.id AS prod_id, prod.name AS prod_name
FROM products prod
INNER JOIN categories cat ON prod.id_categories = cat.id
WHERE cat.name LIKE 'super%'