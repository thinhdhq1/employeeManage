CREATE TABLE IF NOT EXISTS employee (
    employee_id VARCHAR(10) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INTEGER NOT NULL,
    birthday VARCHAR(30) NOT NULL,
    address VARCHAR(200) NOT NULL,
    phone VARCHAR(20) NOT NULL
);
