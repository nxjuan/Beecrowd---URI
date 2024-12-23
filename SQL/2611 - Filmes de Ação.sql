SELECT movies.id AS id, movies.name AS name
from movies
INNER JOIN genres
ON movies.id_genres = genres.id
WHERE genres.description = 'Action'