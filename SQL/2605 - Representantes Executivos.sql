SELECT prod.name AS product_name, prov.name AS provider_name
FROM products prod
INNER JOIN providers prov ON prod.id_providers = prov.id
WHERE prod.id_categories = 6;
