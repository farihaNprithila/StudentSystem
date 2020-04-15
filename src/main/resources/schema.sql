CREATE TABLE student (
    id INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    address VARCHAR(100)
);
CREATE TABLE course (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    instructor VARCHAR(100)
);
CREATE TABLE department(
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);