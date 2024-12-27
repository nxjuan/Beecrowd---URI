SELECT products.name, providers.name
from providers
INNER JOIN products
ON providers.id = products.id_providers
WHERE providers.name = 'Ajax SA';