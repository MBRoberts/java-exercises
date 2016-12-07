CREATE TABLE albums (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  artist VARCHAR(100) NOT NULL,
  album VARCHAR(100) NOT NULL ,
  genre VARCHAR(100) NOT NULL ,
  release_date YEAR,
  sales_in_millions DECIMAL (8, 2) NOT NULL,
  PRIMARY KEY (id)
);
