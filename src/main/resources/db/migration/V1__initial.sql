
DROP TABLE IF EXISTS users;
CREATE TABLE users
  (
     id             UUID NOT NULL,
     first_name      VARCHAR(255),
     last_name       VARCHAR(255),
     email          VARCHAR(255) UNIQUE,
     email_verified BOOLEAN DEFAULT FALSE,
     status         varchar (50),
     account_locked BOOLEAN DEFAULT FALSE,
     password       VARCHAR(255) ,
     telephone      VARCHAR(255),
     picture_url     VARCHAR(255),
     created_on      DATE NOT NULL,
     PRIMARY KEY (id)
  );

DROP TABLE IF EXISTS roles;
CREATE TABLE roles
  (
     id         UUID NOT NULL,
     NAME       VARCHAR(200),
     PRIMARY KEY (id)
  );
DROP TABLE IF EXISTS users_roles;
CREATE TABLE users_roles
  (
     user_id         UUID NOT NULL,
     role_id         UUID NOT NULL,
    CONSTRAINT fk_roles FOREIGN KEY(role_id) REFERENCES roles(id),
	CONSTRAINT fk_user FOREIGN KEY(user_id)  REFERENCES users(id)

  );