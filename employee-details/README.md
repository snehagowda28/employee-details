INSERT INTO PROFILE VALUES (1, 3, 'Nav', 12345, 'JAVA', 1);
INSERT INTO PROFILE VALUES (2, 0, 'Sne', 12345, 'REACT', 1);
INSERT INTO PROFILE VALUES (3, 1, 'Nav3', 12345, 'C++', 2);
INSERT INTO PROFILE VALUES (4, 2, 'Naruto', 12345, 'JAVASCRIPT', 2);
INSERT INTO PROFILE VALUES (5, 32, 'Nagato', 12345, 'DOCKER', 1);
INSERT INTO PROFILE VALUES (6, 34, 'Sasuke', 12345, 'JENKINS', 3);


INSERT INTO ASSET VALUES (1, 'iphone12', 'Allocated', 'phone', 1) ;
INSERT INTO ASSET VALUES (2, 'laptop lenovo', 'Allocated', 'laptop', 1) ;
INSERT INTO ASSET VALUES (3, 'toycar', 'Allocated', 'car', 2) ;
INSERT INTO ASSET VALUES (4, 'bag', 'Allocated', 'bag', 2) ;
INSERT INTO ASSET VALUES (5, 'phonecase', 'Allocated', 'accessories', 1) ;



INSERT INTO PROJECT VALUES (1, 'Employee Sample');
INSERT INTO PROJECT VALUES (2, 'Airline app');
INSERT INTO PROJECT VALUES (3, 'Booking app');
INSERT INTO PROJECT VALUES (4, 'Spark App');

INSERT INTO PROJECT_EMP_ID_LIST VALUES(1, 1);
INSERT INTO PROJECT_EMP_ID_LIST VALUES(1, 2);
INSERT INTO PROJECT_EMP_ID_LIST VALUES(1, 5);

http://localhost:8080/api/swagger-ui.html
http://localhost:8080/api/h2-console

http://localhost:8082/assetManagement/h2-console
http://localhost:8088/h2-console
http://localhost:8181/h2-console