# Tasks schema
 
# --- !Ups

CREATE SEQUENCE mail_id_seq;
CREATE TABLE mail (
    id integer NOT NULL DEFAULT nextval('mail_id_seq') UNIQUE,
    to varchar(200),
    cc varchar(200),
    obj varchar(100),
    subject varchar(2000),
    dateCreation datetime,
    dateUpdated datetime,
    status integer
);

# --- !Downs
 
DROP TABLE mail;
DROP SEQUENCE mail_id_seq;