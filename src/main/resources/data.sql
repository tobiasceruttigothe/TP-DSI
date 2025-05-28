-- Tabla: alcance_sismo (10 registros)
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (1, 'Local', 'Sismo percibido en un área pequeña');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (2, 'Regional', 'Sismo sentido en una región amplia');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (3, 'Nacional', 'Sismo que afecta todo el territorio nacional');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (4, 'Provincial', 'Sismo limitado a una provincia específica');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (5, 'Metropolitano', 'Sismo que afecta el área metropolitana');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (6, 'Departamental', 'Sismo percibido en un departamento');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (7, 'Transfronterizo', 'Sismo que cruza fronteras internacionales');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (8, 'Continental', 'Sismo de escala continental');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (9, 'Zonal', 'Sismo en una zona geográfica específica');
INSERT INTO alcance_sismo (id, nombre, descripcion) VALUES (10, 'Intercontinental', 'Sismo con efectos entre continentes');

-- Tabla: origen_generacion (10 registros)
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (1, 'Natural', 'Origen natural del evento');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (2, 'Artificial', 'Causado por actividad humana');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (3, 'Tectónico', 'Movimiento de placas tectónicas');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (4, 'Volcánico', 'Actividad volcánica');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (5, 'Minero', 'Explosiones o actividad minera');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (6, 'Nuclear', 'Pruebas o explosiones nucleares');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (7, 'Colapso', 'Colapso de estructuras subterráneas');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (8, 'Hidroeléctrico', 'Llenado de embalses');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (9, 'Fracking', 'Fracturación hidráulica');
INSERT INTO origen_generacion (id, nombre, descripcion) VALUES (10, 'Meteorológico', 'Eventos meteorológicos extremos');

-- Tabla: magnitud_ritcher (10 registros)
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (1, 3.5, 'Leve');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (2, 5.2, 'Moderado');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (3, 2.1, 'Micro');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (4, 4.8, 'Ligero');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (5, 6.3, 'Fuerte');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (6, 7.5, 'Mayor');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (7, 8.2, 'Gran terremoto');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (8, 1.8, 'Imperceptible');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (9, 9.1, 'Catastrófico');
INSERT INTO magnitud_ritcher (id, numero, descripcion_magnitud) VALUES (10, 4.2, 'Perceptible');

-- Tabla: clasificacion_sismo (10 registros)
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (1, 0.0, 70.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (2, 70.1, 300.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (3, 0.0, 35.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (4, 35.1, 70.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (5, 300.1, 670.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (6, 0.0, 10.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (7, 10.1, 35.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (8, 150.1, 300.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (9, 670.1, 2900.0);
INSERT INTO clasificacion_sismo (id, km_profundidad_desde, km_profundidad_hasta) VALUES (10, 5.0, 15.0);

-- Tabla: estacion_sismologica (10 registros)
-- Nota: No incluimos id_sismografo ya que esa relación se maneja desde Sismografo

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (1, 1001, 'CERT-2023-001.pdf', '2023-01-15', -64.1836, -31.4201, 'Estación Córdoba Centro', 20230001);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (2, 1002, 'CERT-2023-002.pdf', '2023-02-20', -58.3816, -34.6037, 'Estación Buenos Aires Norte', 20230002);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (3, 1003, 'CERT-2023-003.pdf', '2023-03-10', -68.8458, -32.8895, 'Estación Mendoza Sierra', 20230003);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (4, 1004, 'CERT-2023-004.pdf', '2023-04-05', -65.4167, -24.1833, 'Estación Salta Valle', 20230004);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (5, 1005, 'CERT-2023-005.pdf', '2023-05-12', -67.6167, -45.8667, 'Estación Chubut Patagonia', 20230005);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (6, 1006, 'CERT-2023-006.pdf', '2023-06-18', -62.2681, -38.7183, 'Estación Mar del Plata Costa', 20230006);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (7, 1007, 'CERT-2023-007.pdf', '2023-07-22', -70.9167, -33.0167, 'Estación Aconcagua Oeste', 20230007);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (8, 1008, 'CERT-2023-008.pdf', '2023-08-14', -66.0775, -17.3895, 'Estación Tarija Frontera', 20230008);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (9, 1009, 'CERT-2023-009.pdf', '2023-09-25', -71.5430, -54.8019, 'Estación Ushuaia Austral', 20230009);

INSERT INTO estacion_sismologica (id_estacion_sismologica, id_codigo_estacion, documento_certificado, fecha_solicitud_certificado, longitud, latitud, nombre, numero_certificado_adquisicion)
VALUES (10, 1010, 'CERT-2023-010.pdf', '2023-10-30', -69.2167, -51.6167, 'Estación Santa Cruz Sur', 20230010);

-- Tabla: sismografo (10 registros)
INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (1, '2023-01-10', 'SN-1001-A', 1);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (2, '2023-02-18', 'SN-1002-B', 2);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (3, '2023-03-05', 'SN-1003-C', 3);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (4, '2023-04-12', 'SN-1004-D', 4);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (5, '2023-05-09', 'SN-1005-E', 5);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (6, '2023-06-21', 'SN-1006-F', 6);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (7, '2023-07-19', 'SN-1007-G', 7);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (8, '2023-08-23', 'SN-1008-H', 8);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (9, '2023-09-14', 'SN-1009-I', 9);

INSERT INTO sismografo (id_sismografo, fecha_adquisicion, nro_serie, id_estacion_sismologica)
VALUES (10, '2023-10-02', 'SN-1010-J', 10);



-- Tabla: tipo_de_dato (10 registros)
INSERT INTO tipo_de_dato (id, denominacion, nombre_unidad_medida, valor_umbral) VALUES
                                                                                    (1, 'Aceleración', 'm/s²', 9.8),
                                                                                    (2, 'Velocidad', 'm/s', 3.5),
                                                                                    (3, 'Desplazamiento', 'mm', 100),
                                                                                    (4, 'Frecuencia', 'Hz', 50),
                                                                                    (5, 'Amplitud', 'µm', 500),
                                                                                    (6, 'Ruido Ambiental', 'dB', 65),
                                                                                    (7, 'Intensidad Sísmica', 'MSK', 6),
                                                                                    (8, 'Tiempo de Llegada', 's', 10),
                                                                                    (9, 'Duración del Evento', 's', 120),
                                                                                    (10, 'Magnitud Local', 'ML', 4.5);

-- Tabla: serie_temporal (12 registros)
INSERT INTO serie_temporal (id, condicion_alarma, fecha_hora_registro, fecha_hora_inicio_muestras, frecuencia_muestras, id_evento_sismo, id_sismografo) VALUES
                                                                                                                                                            (1, 'Alarma 1', '2025-01-01T04:32:00', '2025-01-01T04:37:00', '5s', 1, 1),
                                                                                                                                                            (2, 'Alarma 2', '2025-01-02T05:00:00', '2025-01-02T05:05:00', '5s', 1, 1),
                                                                                                                                                            (3, 'Alarma 3', '2025-01-03T05:05:00', '2025-01-03T05:10:00', '1s', 1, 1),
                                                                                                                                                            (4, 'Alarma 4', '2025-01-04T01:04:00', '2025-01-04T01:09:00', '2s', 1, 1),
                                                                                                                                                            (5, 'Alarma 5', '2025-01-05T05:01:00', '2025-01-05T05:06:00', '2s', 1, 1),
                                                                                                                                                            (6, 'Alarma 6', '2025-01-06T03:51:00', '2025-01-06T03:56:00', '5s', 1, 1),
                                                                                                                                                            (7, 'Alarma 7', '2025-01-07T04:52:00', '2025-01-07T04:57:00', '2s', 1, 1),
                                                                                                                                                            (8, 'Alarma 8', '2025-01-08T01:45:00', '2025-01-08T01:50:00', '5s', 1, 1),
                                                                                                                                                            (9, 'Alarma 9', '2025-01-09T02:39:00', '2025-01-09T02:44:00', '5s', 1, 1),
                                                                                                                                                            (10, 'Alarma 10', '2025-01-10T02:19:00', '2025-01-10T02:24:00', '5s', 1, 1),
                                                                                                                                                            (11, 'Alarma 11', '2025-01-11T00:56:00', '2025-01-11T01:01:00', '2s', 1, 1),
                                                                                                                                                            (12, 'Alarma 12', '2025-01-12T00:12:00', '2025-01-12T00:17:00', '2s', 1, 1);

-- Tabla: muestra_sismica (27 registros)
INSERT INTO muestra_sismica (id, fecha_hora_muestra, id_serie_temporal) VALUES
                                                                            (1, '2025-01-01T04:37:00', 1),
                                                                            (2, '2025-01-01T04:37:05', 1),
                                                                            (3, '2025-01-02T05:05:00', 2),
                                                                            (4, '2025-01-02T05:05:05', 2),
                                                                            (5, '2025-01-03T05:10:00', 3),
                                                                            (6, '2025-01-03T05:10:01', 3),
                                                                            (7, '2025-01-03T05:10:02', 3),
                                                                            (8, '2025-01-04T01:09:00', 4),
                                                                            (9, '2025-01-04T01:09:02', 4),
                                                                            (10, '2025-01-05T05:06:00', 5),
                                                                            (11, '2025-01-05T05:06:02', 5),
                                                                            (12, '2025-01-05T05:06:04', 5),
                                                                            (13, '2025-01-06T03:56:00', 6),
                                                                            (14, '2025-01-06T03:56:05', 6),
                                                                            (15, '2025-01-07T04:57:00', 7),
                                                                            (16, '2025-01-07T04:57:02', 7),
                                                                            (17, '2025-01-07T04:57:04', 7),
                                                                            (18, '2025-01-08T01:50:00', 8),
                                                                            (19, '2025-01-08T01:50:05', 8),
                                                                            (20, '2025-01-09T02:44:00', 9),
                                                                            (21, '2025-01-09T02:44:05', 9),
                                                                            (22, '2025-01-10T02:24:00', 10),
                                                                            (23, '2025-01-10T02:24:05', 10),
                                                                            (24, '2025-01-11T01:01:00', 11),
                                                                            (25, '2025-01-11T01:01:02', 11),
                                                                            (26, '2025-01-12T00:17:00', 12),
                                                                            (27, '2025-01-12T00:17:02', 12);

-- Tabla: detalle_muestra_sismica (97 registros)
INSERT INTO detalle_muestra_sismica (id, valor, muestra_sismica, tipo_de_dato) VALUES
                                                                                   (1, 8.47, 1, 8),
                                                                                   (2, 5.84, 1, 10),
                                                                                   (3, 8.99, 1, 1),
                                                                                   (4, 72.93, 2, 4),
                                                                                   (5, 438.11, 2, 5),
                                                                                   (6, 12.36, 2, 1),
                                                                                   (7, 5.18, 3, 8),
                                                                                   (8, 29.18, 3, 4),
                                                                                   (9, 62.93, 3, 6),
                                                                                   (10, 6.44, 3, 7),
                                                                                   (11, 8.11, 4, 7),
                                                                                   (12, 4.78, 4, 10),
                                                                                   (13, 62.71, 4, 6),
                                                                                   (14, 79.58, 4, 3),
                                                                                   (15, 2.08, 5, 2),
                                                                                   (16, 87.44, 5, 6),
                                                                                   (17, 12.86, 5, 8),
                                                                                   (18, 7.95, 5, 7),
                                                                                   (19, 300.01, 6, 5),
                                                                                   (20, 85.53, 6, 9),
                                                                                   (21, 5.17, 6, 10),
                                                                                   (22, 87.82, 6, 6),
                                                                                   (23, 5.29, 7, 7),
                                                                                   (24, 718.37, 7, 5),
                                                                                   (25, 3.73, 7, 10),
                                                                                   (26, 264.1, 8, 5),
                                                                                   (27, 4.3, 8, 10),
                                                                                   (28, 70.26, 8, 6),
                                                                                   (29, 3.96, 9, 7),
                                                                                   (30, 38.75, 9, 6),
                                                                                   (31, 3.08, 9, 10),
                                                                                   (32, 3.52, 9, 2),
                                                                                   (33, 2.83, 10, 2),
                                                                                   (34, 2.46, 10, 10),
                                                                                   (35, 109.02, 10, 3),
                                                                                   (36, 38.87, 10, 4),
                                                                                   (37, 4.53, 11, 10),
                                                                                   (38, 12.07, 11, 1),
                                                                                   (39, 80.76, 11, 9),
                                                                                   (40, 4.79, 12, 2),
                                                                                   (41, 72.38, 12, 4),
                                                                                   (42, 100.22, 12, 3),
                                                                                   (43, 101.24, 13, 3),
                                                                                   (44, 8.84, 13, 1),
                                                                                   (45, 2.67, 13, 10),
                                                                                   (46, 29.73, 13, 4),
                                                                                   (47, 3.31, 14, 2),
                                                                                   (48, 3.72, 14, 7),
                                                                                   (49, 117.91, 14, 9),
                                                                                   (50, 56.32, 15, 6),
                                                                                   (51, 2.76, 15, 10),
                                                                                   (52, 11.92, 15, 8),
                                                                                   (53, 440.64, 15, 5),
                                                                                   (54, 8.21, 16, 7),
                                                                                   (55, 131.94, 16, 3),
                                                                                   (56, 92.22, 16, 6),
                                                                                   (57, 616.98, 17, 5),
                                                                                   (58, 3.02, 17, 2),
                                                                                   (59, 66.79, 17, 9),
                                                                                   (60, 58.83, 17, 6),
                                                                                   (61, 5.06, 18, 2),
                                                                                   (62, 105.88, 18, 3),
                                                                                   (63, 5.97, 18, 10),
                                                                                   (64, 27.71, 18, 4),
                                                                                   (65, 44.39, 19, 4),
                                                                                   (66, 138.82, 19, 3),
                                                                                   (67, 6.67, 19, 10),
                                                                                   (68, 12.52, 20, 8),
                                                                                   (69, 35.22, 20, 4),
                                                                                   (70, 3.99, 20, 2),
                                                                                   (71, 109.56, 21, 9),
                                                                                   (72, 10.09, 21, 8),
                                                                                   (73, 42.11, 21, 6),
                                                                                   (74, 50.81, 21, 4),
                                                                                   (75, 34.29, 22, 6),
                                                                                   (76, 9.6, 22, 1),
                                                                                   (77, 3.6, 22, 10),
                                                                                   (78, 56.27, 22, 3),
                                                                                   (79, 153.96, 23, 9),
                                                                                   (80, 6.08, 23, 7),
                                                                                   (81, 5.35, 23, 10),
                                                                                   (82, 703.16, 23, 5),
                                                                                   (83, 5.56, 24, 10),
                                                                                   (84, 125.6, 24, 9),
                                                                                   (85, 7.07, 24, 7),
                                                                                   (86, 106.42, 24, 3),
                                                                                   (87, 60.75, 25, 4),
                                                                                   (88, 6.15, 25, 1),
                                                                                   (89, 75.74, 25, 9),
                                                                                   (90, 79.71, 25, 6),
                                                                                   (91, 8.9, 26, 7),
                                                                                   (92, 6.58, 26, 10),
                                                                                   (93, 122.83, 26, 3),
                                                                                   (94, 408.26, 26, 5),
                                                                                   (95, 69.17, 27, 9),
                                                                                   (96, 8.08, 27, 8),
                                                                                   (97, 74.6, 27, 4);