SELECT movies.id AS id, movies.name AS name
from movies
INNER JOIN prices
ON movies.id_prices = prices.id
WHERE value < 2.0