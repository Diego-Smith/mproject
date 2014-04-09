# Tasks schema
 
# --- !Ups

CREATE SEQUENCE pagevisited_id_seq;
CREATE TABLE pages_visited (
    id integer NOT NULL DEFAULT nextval('pagevisited_id_seq') UNIQUE,
    pagename varchar(20),
    ip varchar(20),
    dateVisited datetime,
    fkUser integer
);

# --- !Downs
 
DROP TABLE pagevisited;
DROP SEQUENCE pagevisited_id_seq;