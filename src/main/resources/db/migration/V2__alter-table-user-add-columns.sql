CREATE TABLE users (
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY (INCREMENT 1 START 1),
    username character varying(100) NOT NULL,
    password character varying(255) NOT NULL,
    PRIMARY KEY (id)
);