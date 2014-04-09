# Tasks schema
 
# --- !Ups

CREATE SEQUENCE user_id_seq;
CREATE TABLE user (
    id integer NOT NULL DEFAULT nextval('user_id_seq') UNIQUE,
    username varchar(50),
    password varchar(50),
    role varchar(20),
    name varchar(50),
    surname varchar (50),
    active varchar(20)
);
INSERT INTO user (username, password, role, name, surname, active) VALUES('diego@diego.it', 'welcome1', 'Admin', 'Dieg', 'Smith', null);
INSERT INTO user (username, password, role, name, surname, active)  VALUES('test@test.it', 'welcome2', 'User', 'Marety', 'Party', null);
# --- !Downs
 
DROP TABLE user;
DROP SEQUENCE user_id_seq;