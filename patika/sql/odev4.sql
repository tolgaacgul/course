--film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
SELECT DISTINCT replacement_cost FROM film
ORDER BY replacement_cost ASC;

--film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
SELECT COUNT (DISTINCT replacement_cost) FROM film;

--film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
SELECT COUNT(*) FROM film
WHERE title ILIKE 't%' AND rating ='G';

--country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
-- 5 adet -
SELECT COUNT(*) FROM country
WHERE country ILIKE '_____';

--city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
SELECT COUNT(*) FROM city
WHERE city ILIKE '%r'