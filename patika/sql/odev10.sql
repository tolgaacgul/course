--ODEV10 -Aşağıdaki sorgu senaryolarını dvdrental örnek veri tabanı üzerinden gerçekleştiriniz.

--city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
SELECT city.city, country.country FROM city
LEFT OUTER JOIN country ON city.country_id = country.country_id;

SELECT city.city, country.country FROM country
LEFT OUTER JOIN city ON city.country_id = country.country_id;

--customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz
--RIGHT JOIN sorgusunu yazınız.
SELECT payment_id, first_name, last_name FROM customer
RIGHT JOIN payment ON customer.customer_id = payment.customer_id;

SELECT payment_id, first_name, last_name FROM payment
RIGHT JOIN customer ON customer.customer_id = payment.customer_id;

--customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz 
--FULL JOIN sorgusunu yazınız.
SELECT rental_id, first_name, last_name FROM rental
FULL OUTER JOIN customer ON rental.customer_id = customer.customer_id;

SELECT rental_id, first_name, last_name FROM customer
FULL OUTER JOIN rental ON rental.customer_id = customer.customer_id;
