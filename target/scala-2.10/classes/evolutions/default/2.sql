# Tasks schema
 
# --- !Ups

CREATE SEQUENCE post_id_seq;
CREATE TABLE post (
    id integer NOT NULL DEFAULT nextval('post_id_seq') UNIQUE,
    dateCreation datetime,
    fkUser integer,
    content varchar(2000),
    title varchar(200)
);
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-03-12', 1, 'Questo e'' la prima notizia pubblicata dal sito. OMG OMG!!', 'Pubblicazione sito');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-03-13', 2, 'La secondo notizia e'' molto piu'' carina', 'Notiziona');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-03-14', 1, 'Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. Finalmente il sito e'' in beta. ', 'Apertura sito');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La quarta notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Quarta');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La quinta notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Quinta');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La sesta notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Sesta');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La settima notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Settima');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La ottava notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Ottava');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La nona notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Nona');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La 10 notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Decima');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La 11 notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Undicesima');
INSERT INTO post (dateCreation, fkUser, content, title) VALUES('2011-04-15', 2, 'La 12 notizia serve per inserire un testo abbastanza lungo che permetta di vedere la formattazione e il corretto utilizzo dell''elemento div. Speriamo che i margini facciano il loro dovere', 'Un titolo lunghissimo per la dodicesima');

# --- !Downs
 
DROP TABLE post;
DROP SEQUENCE post_id_seq;