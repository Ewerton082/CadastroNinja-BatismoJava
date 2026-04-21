--Migration via flyway para adicionar os ranks na tabela Ninjas de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);