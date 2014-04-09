# Tasks schema
 
# --- !Ups

CREATE SEQUENCE CONSIGLI_id_seq;
CREATE TABLE CONSIGLI (
   id integer NOT NULL DEFAULT nextval('CONSIGLI_id_seq') UNIQUE,
   titolo varchar(200) NOT NULL,
   descrizione varchar(4000) NOT NULL,
   autore varchar(100),
   tipo varchar(10) NOT NULL,
   posizione integer NOT NULL
);

INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo', 'Il migliore', 'test', 'Libro', 1);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo secondo', 'Il secondo', 'Oronzo Cana', 'Libro', 2);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo terzo', 'Bronzo', null, 'Oggetto',	 3);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo quarto', 'Legno', 'test', 'Libro',	 4);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo quinto', 'asd', 'test', 'Libro',	 5);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo sest', 'qwe', null, 'Oggetto',	 6);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo setto', 'Brsadasonzo', 'test', 'Libro',	 7);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo ottoo', 'Broasdwnzo', null,  'Oggetto',	 8);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo nono', 'qwrwqe', 'test', 'Libro',	 9);
INSERT INTO CONSIGLI (titolo, descrizione, autore, tipo, posizione) VALUES('Titolo decinzo', 'Browqdsfnzo', 'test', 'Libro',	 10);


# --- !Downs
DROP TABLE CONSIGLI;
DROP SEQUENCE CONSIGLI_id_seq;
