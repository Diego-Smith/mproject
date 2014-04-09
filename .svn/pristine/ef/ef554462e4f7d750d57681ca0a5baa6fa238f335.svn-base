# Tasks schema
 
# --- !Ups

CREATE SEQUENCE configuration_id_seq;
CREATE TABLE configuration (
    id integer NOT NULL DEFAULT nextval('configuration_id_seq') UNIQUE,
    key varchar(20) UNIQUE,
    value varchar(200)
);
INSERT INTO configuration (key, value) VALUES('css_base_color', '#660011');

# --- !Downs
 
DROP TABLE configuration;
DROP SEQUENCE configuration_id_seq;