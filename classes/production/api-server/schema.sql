
CREATE TABLE PRODUCT_THUMBNAIL(
 id INTEGER PRIMARY KEY
,created_at VARCHAR(40)
,updated_at VARCHAR(40)
,filename VARCHAR(256)
,thumbnail VARCHAR(256)
);

CREATE TABLE BRAND(
 brand_id INTEGER PRIMARY KEY
,created_at VARCHAR(40)
,updated_at VARCHAR(40)
,name VARCHAR(256)
,brand_maLL_url VARCHAR(1000)
,description VARCHAR(1000)
);


CREATE TABLE PRODUCT(
 id INTEGER PRIMARY KEY
,created_at VARCHAR(40)
,updated_at VARCHAR(40)
,name VARCHAR(256)
,store_url VARCHAR(1000)
,contractor_id INTEGER
,shop_prod_id VARCHAR(256)
,image_id INTEGER
,brand_id INTEGER
,color VARCHAR(256)
,store VARCHAR(256)
,price INTEGER
,discount_price INTEGER
,CONSTRAINT fk_image_id FOREIGN KEY (image_id) REFERENCES PRODUCT_THUMBNAIL (id)
,CONSTRAINT fk_brand_id FOREIGN KEY (brand_id) REFERENCES BRAND (brand_id)
);
