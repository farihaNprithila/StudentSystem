CREATE TABLE IF NOT EXISTS student (
    student_id INT NOT NULL PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100),
    address VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS course (
    course_id INT NOT NULL PRIMARY KEY,
    course_name VARCHAR(50) NOT NULL,
    course_instructor VARCHAR(100)
);
CREATE TABLE IF NOT EXISTS department(
    department_id INT NOT NULL PRIMARY KEY,
    department_name VARCHAR(50) NOT NULL
);