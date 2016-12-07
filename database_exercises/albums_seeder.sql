USE codeup_test_db;

TRUNCATE albums;

INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Michael Jackson', 'Thriller', 'Pop, Rock, R&B', 1982, 65.00),
  ('AC/DC', 'Back in Black', 'Hard rock', 1980, 50.00),
  ('Pink Floyd', 'The Dark Side of the Moon', 'Progressive rock', 1973, 45.00),
  ('Whitney Houston / Various artists', 'The Bodyguard', 'R&B, Soul, Pop, Soundtrack', 1992, 44.00),
  ('Meat Loaf', 'Bat Out of Hell', 'Hard rock, Progressive rock', 1977, 43.00),
  ('Eagles', 'Their Greatest Hits (1971–1975)', 'Rock, Soft rock, Folk rock', 1976, 42),
  ('Fleetwood Mac', 'Rumours', 'Soft rock', 1977, 40),
  ('Bee Gees / Various artists', 'Saturday Night Fever', 'Disco', 1977, 40);
