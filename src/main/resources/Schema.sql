DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS (
    ID INT NOT NULL AUTO_INCREMENT ,
    FIRST_NAME VARCHAR(255) NOT NULL,
    LAST_NAME VARCHAR(255) NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);
DROP TABLE IF EXISTS CUENTA;
CREATE TABLE CUENTA (
    ID INT NOT NULL ,
    PASSWORD VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);