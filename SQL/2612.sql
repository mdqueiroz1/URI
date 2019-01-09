select m.id, m.name 
from movies m join genres g on g.id = m.id_genres join movies_actors ma on m.id = ma.id_movies join actors a on a.id = ma.id_actors 
where a.name like 'Marcelo Silva' or a.name like 'Miguel Silva' and g.description like 'Action';
