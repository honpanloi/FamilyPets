PGDMP     (                    y           postgres    12.5    12.3 #    o           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            p           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            q           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            r           1262    14314    postgres    DATABASE     z   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';
    DROP DATABASE postgres;
                postgres    false            s           0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                   postgres    false    3954            	            2615    16796 
   familypets    SCHEMA        CREATE SCHEMA familypets;
    DROP SCHEMA familypets;
                postgres    false            �            1259    17962    messageid_seq    SEQUENCE     z   CREATE SEQUENCE familypets.messageid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE familypets.messageid_seq;
    
   familypets          postgres    false    9            �            1259    17968    message    TABLE     �   CREATE TABLE familypets.message (
    messageid integer DEFAULT nextval('familypets.messageid_seq'::regclass) NOT NULL,
    content character varying(255) NOT NULL,
    requestid integer NOT NULL,
    personid integer NOT NULL
);
    DROP TABLE familypets.message;
    
   familypets         heap    postgres    false    237    9            �            1259    17665    message_id_seq    SEQUENCE     {   CREATE SEQUENCE familypets.message_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE familypets.message_id_seq;
    
   familypets          postgres    false    9            �            1259    17964    personid_seq    SEQUENCE     y   CREATE SEQUENCE familypets.personid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE familypets.personid_seq;
    
   familypets          postgres    false    9            �            1259    17974    person    TABLE     �  CREATE TABLE familypets.person (
    personid integer DEFAULT nextval('familypets.personid_seq'::regclass) NOT NULL,
    city character varying(255) NOT NULL,
    date_of_birth date NOT NULL,
    email character varying(255) NOT NULL,
    firstname character varying(255) NOT NULL,
    isbreeder boolean NOT NULL,
    lastname character varying(255) NOT NULL,
    phonenumber character varying(255) NOT NULL
);
    DROP TABLE familypets.person;
    
   familypets         heap    postgres    false    238    9            �            1259    17667    person_id_seq    SEQUENCE     z   CREATE SEQUENCE familypets.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE familypets.person_id_seq;
    
   familypets          postgres    false    9            �            1259    17983    person_login    TABLE     �   CREATE TABLE familypets.person_login (
    email character varying(255) NOT NULL,
    password character varying(255) NOT NULL,
    personid integer
);
 $   DROP TABLE familypets.person_login;
    
   familypets         heap    postgres    false    9            �            1259    17966    requestid_seq    SEQUENCE     z   CREATE SEQUENCE familypets.requestid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE familypets.requestid_seq;
    
   familypets          postgres    false    9            �            1259    17991    request    TABLE     �  CREATE TABLE familypets.request (
    requestid integer DEFAULT nextval('familypets.requestid_seq'::regclass) NOT NULL,
    animal character varying(255) NOT NULL,
    breed character varying(255) NOT NULL,
    dateaccepted date,
    dateissued date NOT NULL,
    photolink character varying(255),
    requeststatus character varying(255) NOT NULL,
    breederid integer,
    buyerid integer NOT NULL
);
    DROP TABLE familypets.request;
    
   familypets         heap    postgres    false    239    9            �            1259    17669    request_id_seq    SEQUENCE     {   CREATE SEQUENCE familypets.request_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE familypets.request_id_seq;
    
   familypets          postgres    false    9            i          0    17968    message 
   TABLE DATA           N   COPY familypets.message (messageid, content, requestid, personid) FROM stdin;
 
   familypets          postgres    false    240            j          0    17974    person 
   TABLE DATA           w   COPY familypets.person (personid, city, date_of_birth, email, firstname, isbreeder, lastname, phonenumber) FROM stdin;
 
   familypets          postgres    false    241            k          0    17983    person_login 
   TABLE DATA           E   COPY familypets.person_login (email, password, personid) FROM stdin;
 
   familypets          postgres    false    242            l          0    17991    request 
   TABLE DATA           �   COPY familypets.request (requestid, animal, breed, dateaccepted, dateissued, photolink, requeststatus, breederid, buyerid) FROM stdin;
 
   familypets          postgres    false    243            t           0    0    message_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('familypets.message_id_seq', 1, false);
       
   familypets          postgres    false    228            u           0    0    messageid_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('familypets.messageid_seq', 42, true);
       
   familypets          postgres    false    237            v           0    0    person_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('familypets.person_id_seq', 1, true);
       
   familypets          postgres    false    229            w           0    0    personid_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('familypets.personid_seq', 2, true);
       
   familypets          postgres    false    238            x           0    0    request_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('familypets.request_id_seq', 1, false);
       
   familypets          postgres    false    230            y           0    0    requestid_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('familypets.requestid_seq', 14, true);
       
   familypets          postgres    false    239            �           2606    17973    message message_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY familypets.message
    ADD CONSTRAINT message_pkey PRIMARY KEY (messageid);
 B   ALTER TABLE ONLY familypets.message DROP CONSTRAINT message_pkey;
    
   familypets            postgres    false    240            �           2606    17990    person_login person_login_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY familypets.person_login
    ADD CONSTRAINT person_login_pkey PRIMARY KEY (email);
 L   ALTER TABLE ONLY familypets.person_login DROP CONSTRAINT person_login_pkey;
    
   familypets            postgres    false    242            �           2606    17982    person person_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY familypets.person
    ADD CONSTRAINT person_pkey PRIMARY KEY (personid);
 @   ALTER TABLE ONLY familypets.person DROP CONSTRAINT person_pkey;
    
   familypets            postgres    false    241            �           2606    17999    request request_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY familypets.request
    ADD CONSTRAINT request_pkey PRIMARY KEY (requestid);
 B   ALTER TABLE ONLY familypets.request DROP CONSTRAINT request_pkey;
    
   familypets            postgres    false    243            �           2606    18005 #   message fk8y7hvvvh7qccc69x3655bw91y    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.message
    ADD CONSTRAINT fk8y7hvvvh7qccc69x3655bw91y FOREIGN KEY (personid) REFERENCES familypets.person(personid);
 Q   ALTER TABLE ONLY familypets.message DROP CONSTRAINT fk8y7hvvvh7qccc69x3655bw91y;
    
   familypets          postgres    false    3803    240    241            �           2606    18020 #   request fkcb00ehhnwg0srk584aucfpq71    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.request
    ADD CONSTRAINT fkcb00ehhnwg0srk584aucfpq71 FOREIGN KEY (buyerid) REFERENCES familypets.person(personid);
 Q   ALTER TABLE ONLY familypets.request DROP CONSTRAINT fkcb00ehhnwg0srk584aucfpq71;
    
   familypets          postgres    false    241    3803    243            �           2606    18010 (   person_login fkh0bw6f7ge4gpaklvptjar3nhe    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.person_login
    ADD CONSTRAINT fkh0bw6f7ge4gpaklvptjar3nhe FOREIGN KEY (personid) REFERENCES familypets.person(personid);
 V   ALTER TABLE ONLY familypets.person_login DROP CONSTRAINT fkh0bw6f7ge4gpaklvptjar3nhe;
    
   familypets          postgres    false    3803    242    241            �           2606    18000 "   message fkj6bfdiojf5e1eccp7ghye921    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.message
    ADD CONSTRAINT fkj6bfdiojf5e1eccp7ghye921 FOREIGN KEY (requestid) REFERENCES familypets.request(requestid);
 P   ALTER TABLE ONLY familypets.message DROP CONSTRAINT fkj6bfdiojf5e1eccp7ghye921;
    
   familypets          postgres    false    3807    243    240            �           2606    18015 #   request fkkaerk955fqs98mk7cybg9curi    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.request
    ADD CONSTRAINT fkkaerk955fqs98mk7cybg9curi FOREIGN KEY (breederid) REFERENCES familypets.person(personid);
 Q   ALTER TABLE ONLY familypets.request DROP CONSTRAINT fkkaerk955fqs98mk7cybg9curi;
    
   familypets          postgres    false    243    3803    241            i   �  x�]R���0���U�K�_���"M�4�5-9��8˻��}�G��8Crf,[�]@�����ε�4�ߟ�ma_Ձ݃�ݯ6�=�u�L�.�#����$�U3�}�f,��x��0�Qi�����&��U%u����T:s,�t<#�ҀAϢu�*?��J=~jF;U%$�4�@J�3�줚����L�nA[j;�Q�V���ʸ�v����e��O�r(5���w���.~��|^h$�
O$NK�Y���^��m�Rk�ܺ|���-��j�����i�Li�eq[���#)Z�K�k�sD�`�&.t��� �]���^O�Ӌ�3���7�=�y��tĎ8ѭeg�j~��آ��t�ٞ}t�%\�Xr_q)��e������Kj�b      j   _   x�3���/Vp�KO�I-�4����50"NC#c��������\N���<�4��LNCCC]###]c �2�L��LNL�G�jdl���)?��Sg� .Qg      k   *   x�342vH�M���K���442�4�226A�8��b���� �      l     x����N�0��_�b/PT���i��]���"�tr���=i�`�&���c��ϟe�m\�X�W��yς�t�)ˇ7���v߰A����X�κ���~�"�l9X�i�/k�ԧ0�HgŨe����[���||z��tsL�k�.�(1L���TO��P����b��M�X�K�nGK�%y����I��V�c��bc�� )"D�RwS���<s�;T&�މ57>�%��Zۙ� Ąc����Gރ�Z	x���Kk6����L��2�=ݐ??�?�ՕR��o�X      #    o           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            p           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            q           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            r           1262    14314    postgres    DATABASE     z   CREATE DATABASE postgres WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.UTF-8' LC_CTYPE = 'en_US.UTF-8';
    DROP DATABASE postgres;
                postgres    false            s           0    0    DATABASE postgres    COMMENT     N   COMMENT ON DATABASE postgres IS 'default administrative connection database';
                   postgres    false    3954            	            2615    16796 
   familypets    SCHEMA        CREATE SCHEMA familypets;
    DROP SCHEMA familypets;
                postgres    false            �            1259    17962    messageid_seq    SEQUENCE     z   CREATE SEQUENCE familypets.messageid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE familypets.messageid_seq;
    
   familypets          postgres    false    9            �            1259    17968    message    TABLE     �   CREATE TABLE familypets.message (
    messageid integer DEFAULT nextval('familypets.messageid_seq'::regclass) NOT NULL,
    content character varying(255) NOT NULL,
    requestid integer NOT NULL,
    personid integer NOT NULL
);
    DROP TABLE familypets.message;
    
   familypets         heap    postgres    false    237    9            �            1259    17665    message_id_seq    SEQUENCE     {   CREATE SEQUENCE familypets.message_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE familypets.message_id_seq;
    
   familypets          postgres    false    9            �            1259    17964    personid_seq    SEQUENCE     y   CREATE SEQUENCE familypets.personid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE familypets.personid_seq;
    
   familypets          postgres    false    9            �            1259    17974    person    TABLE     �  CREATE TABLE familypets.person (
    personid integer DEFAULT nextval('familypets.personid_seq'::regclass) NOT NULL,
    city character varying(255) NOT NULL,
    date_of_birth date NOT NULL,
    email character varying(255) NOT NULL,
    firstname character varying(255) NOT NULL,
    isbreeder boolean NOT NULL,
    lastname character varying(255) NOT NULL,
    phonenumber character varying(255) NOT NULL
);
    DROP TABLE familypets.person;
    
   familypets         heap    postgres    false    238    9            �            1259    17667    person_id_seq    SEQUENCE     z   CREATE SEQUENCE familypets.person_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE familypets.person_id_seq;
    
   familypets          postgres    false    9            �            1259    17983    person_login    TABLE     �   CREATE TABLE familypets.person_login (
    email character varying(255) NOT NULL,
    password character varying(255) NOT NULL,
    personid integer
);
 $   DROP TABLE familypets.person_login;
    
   familypets         heap    postgres    false    9            �            1259    17966    requestid_seq    SEQUENCE     z   CREATE SEQUENCE familypets.requestid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE familypets.requestid_seq;
    
   familypets          postgres    false    9            �            1259    17991    request    TABLE     �  CREATE TABLE familypets.request (
    requestid integer DEFAULT nextval('familypets.requestid_seq'::regclass) NOT NULL,
    animal character varying(255) NOT NULL,
    breed character varying(255) NOT NULL,
    dateaccepted date,
    dateissued date NOT NULL,
    photolink character varying(255),
    requeststatus character varying(255) NOT NULL,
    breederid integer,
    buyerid integer NOT NULL
);
    DROP TABLE familypets.request;
    
   familypets         heap    postgres    false    239    9            �            1259    17669    request_id_seq    SEQUENCE     {   CREATE SEQUENCE familypets.request_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 )   DROP SEQUENCE familypets.request_id_seq;
    
   familypets          postgres    false    9            i          0    17968    message 
   TABLE DATA           N   COPY familypets.message (messageid, content, requestid, personid) FROM stdin;
 
   familypets          postgres    false    240            j          0    17974    person 
   TABLE DATA           w   COPY familypets.person (personid, city, date_of_birth, email, firstname, isbreeder, lastname, phonenumber) FROM stdin;
 
   familypets          postgres    false    241   �       k          0    17983    person_login 
   TABLE DATA           E   COPY familypets.person_login (email, password, personid) FROM stdin;
 
   familypets          postgres    false    242   i        l          0    17991    request 
   TABLE DATA           �   COPY familypets.request (requestid, animal, breed, dateaccepted, dateissued, photolink, requeststatus, breederid, buyerid) FROM stdin;
 
   familypets          postgres    false    243   4        t           0    0    message_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('familypets.message_id_seq', 1, false);
       
   familypets          postgres    false    228            u           0    0    messageid_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('familypets.messageid_seq', 42, true);
       
   familypets          postgres    false    237            v           0    0    person_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('familypets.person_id_seq', 1, true);
       
   familypets          postgres    false    229            w           0    0    personid_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('familypets.personid_seq', 2, true);
       
   familypets          postgres    false    238            x           0    0    request_id_seq    SEQUENCE SET     A   SELECT pg_catalog.setval('familypets.request_id_seq', 1, false);
       
   familypets          postgres    false    230            y           0    0    requestid_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('familypets.requestid_seq', 14, true);
       
   familypets          postgres    false    239            �           2606    17973    message message_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY familypets.message
    ADD CONSTRAINT message_pkey PRIMARY KEY (messageid);
 B   ALTER TABLE ONLY familypets.message DROP CONSTRAINT message_pkey;
    
   familypets            postgres    false    240            �           2606    17990    person_login person_login_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY familypets.person_login
    ADD CONSTRAINT person_login_pkey PRIMARY KEY (email);
 L   ALTER TABLE ONLY familypets.person_login DROP CONSTRAINT person_login_pkey;
    
   familypets            postgres    false    242            �           2606    17982    person person_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY familypets.person
    ADD CONSTRAINT person_pkey PRIMARY KEY (personid);
 @   ALTER TABLE ONLY familypets.person DROP CONSTRAINT person_pkey;
    
   familypets            postgres    false    241            �           2606    17999    request request_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY familypets.request
    ADD CONSTRAINT request_pkey PRIMARY KEY (requestid);
 B   ALTER TABLE ONLY familypets.request DROP CONSTRAINT request_pkey;
    
   familypets            postgres    false    243            �           2606    18005 #   message fk8y7hvvvh7qccc69x3655bw91y    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.message
    ADD CONSTRAINT fk8y7hvvvh7qccc69x3655bw91y FOREIGN KEY (personid) REFERENCES familypets.person(personid);
 Q   ALTER TABLE ONLY familypets.message DROP CONSTRAINT fk8y7hvvvh7qccc69x3655bw91y;
    
   familypets          postgres    false    3803    240    241            �           2606    18020 #   request fkcb00ehhnwg0srk584aucfpq71    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.request
    ADD CONSTRAINT fkcb00ehhnwg0srk584aucfpq71 FOREIGN KEY (buyerid) REFERENCES familypets.person(personid);
 Q   ALTER TABLE ONLY familypets.request DROP CONSTRAINT fkcb00ehhnwg0srk584aucfpq71;
    
   familypets          postgres    false    241    3803    243            �           2606    18010 (   person_login fkh0bw6f7ge4gpaklvptjar3nhe    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.person_login
    ADD CONSTRAINT fkh0bw6f7ge4gpaklvptjar3nhe FOREIGN KEY (personid) REFERENCES familypets.person(personid);
 V   ALTER TABLE ONLY familypets.person_login DROP CONSTRAINT fkh0bw6f7ge4gpaklvptjar3nhe;
    
   familypets          postgres    false    3803    242    241            �           2606    18000 "   message fkj6bfdiojf5e1eccp7ghye921    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.message
    ADD CONSTRAINT fkj6bfdiojf5e1eccp7ghye921 FOREIGN KEY (requestid) REFERENCES familypets.request(requestid);
 P   ALTER TABLE ONLY familypets.message DROP CONSTRAINT fkj6bfdiojf5e1eccp7ghye921;
    
   familypets          postgres    false    3807    243    240            �           2606    18015 #   request fkkaerk955fqs98mk7cybg9curi    FK CONSTRAINT     �   ALTER TABLE ONLY familypets.request
    ADD CONSTRAINT fkkaerk955fqs98mk7cybg9curi FOREIGN KEY (breederid) REFERENCES familypets.person(personid);
 Q   ALTER TABLE ONLY familypets.request DROP CONSTRAINT fkkaerk955fqs98mk7cybg9curi;
    
   familypets          postgres    false    243    3803    241           