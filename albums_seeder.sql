CREATE TABLE albums (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  artist VARCHAR(100) NOT NULL,
  album VARCHAR(100) NOT NULL ,
  genre VARCHAR(100) NOT NULL ,
  release_date YEAR,
  sales_in_millions DECIMAL (8, 2) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Michael Jackson', 'Thriller', 'Pop, Rock, R&B', 1982, 65.00);

INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('AC/DC', 'Back in Black', 'Hard rock', 1980, 50.00);
INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Pink Floyd', 'The Dark Side of the Moon', 'Progressive rock', 1973, 45.00);
INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Whitney Houston / Various artists', 'The Bodyguard', 'R&B, Soul, Pop, Soundtrack', 1992, 44.00);
INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Meat Loaf', 'Bat Out of Hell', 'Hard rock, Progressive rock', 1977, 43.00);
INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Eagles', 'Their Greatest Hits (1971–1975)', 'Rock, Soft rock, Folk rock', 1976, 42);
INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Fleetwood Mac', 'Rumours', 'Soft rock', 1977, 40);
INSERT INTO albums (artist, album, genre, release_date, sales_in_millions) VALUES ('Bee Gees / Various artists', 'Saturday Night Fever', 'Disco', 1977, 40);