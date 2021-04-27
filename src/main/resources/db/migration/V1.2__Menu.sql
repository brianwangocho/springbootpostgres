
DROP TABLE IF EXISTS kitchen_menu;
CREATE TABLE kitchen_menu
(
    id         UUID NOT NULL,
    kitchen_id         UUID NOT NULL,
    name varchar(255),
    PRIMARY KEY (id),


    CONSTRAINT fk_kitchen FOREIGN KEY(kitchen_id)  REFERENCES kitchens(id)

);


DROP TABLE IF EXISTS food_item;
CREATE TABLE food_item
(
    id         UUID NOT NULL,
    menu_id    UUID NOT NULL,
    name        VARCHAR(255),
    description varchar(255),
    picture_url varchar(255),
    created_on      DATE NOT NULL,
    PRIMARY KEY (id),

    constraint fk_kitchen_menu  FOREIGN KEY (menu_id) REFERENCES kitchen_menu (id)


);
