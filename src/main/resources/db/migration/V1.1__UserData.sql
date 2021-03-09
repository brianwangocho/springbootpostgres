
INSERT INTO users
            (id,
             first_name,
             last_name,
             email,
             email_verified,
             status,
             account_locked,
             password,
             telephone,
             picture_url,
             created_on)
VALUES      ( '531e4cdd-bb78-4769-a0c7-cb948a9f1238',
                'Brian',
                'wangocho',
              'bwangocho@gmail.com',
              true ,
              'active',
              false ,
              'Default*123',
              '123456',
              'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ruben2017.jpg/245px-Ruben2017.jpg',
              '12-12-2020');

INSERT INTO roles (id,NAME) VALUES ('531e4cdd-bb78-4769-a0c7-cb948a9f1240','ADMIN');
INSERT INTO roles (id,NAME) VALUES ('531e4cdd-bb78-4769-a0c7-cb948a9f1241','USER');

INSERT INTO users_roles (user_id, role_id) VALUES ('531e4cdd-bb78-4769-a0c7-cb948a9f1238', '531e4cdd-bb78-4769-a0c7-cb948a9f1240'); -- user brian has role ADMIN
