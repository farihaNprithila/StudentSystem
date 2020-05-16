CREATE TABLE department(
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);
CREATE TABLE student (
    id INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    address VARCHAR(100),
    dep_id int NOT NULL ,
    FOREIGN KEY (dep_id) REFERENCES department(id)
);
CREATE TABLE course (
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    instructor VARCHAR(100),
    dep_id int NOT NULL ,
    FOREIGN KEY (dep_id) REFERENCES department(id)
);
CREATE TABLE student_course(
    student_id INT NOT NULL,
    course_id INT NOT NULL,
    PRIMARY KEY (student_id,course_id),
    FOREIGN KEY (student_id) REFERENCES student(id),
    FOREIGN KEY (course_id) REFERENCES course(id)
);