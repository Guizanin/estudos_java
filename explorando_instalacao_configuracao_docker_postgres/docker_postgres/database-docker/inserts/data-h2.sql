--inserir categoria
    insert into category (cta_id,cta_descricao,cta_created_at) values (1,'PIX',now());
    insert into category (cta_id,cta_descricao,cta_created_at) values (2,'CREDIT_CARD',now());
    insert into category (cta_id,cta_descricao,cta_created_at) values (3,'DEBIT_CARD',now());

-- Numero - MENOR
    insert into features (ft_id,ft_nome,ft_created_at,ft_valor_padrao,ft_valores,ft_estado,ft_category_id)
values (1,'feat_n_menor',now(),'on','{"on":"true", "off":"false"}',true,1);

    insert into context_rules(cr_id, cr_created_at, cr_prioridade, cr_valor, cr_valores_parametro, cr_ft_id)
       values(1,now(),2,'on','[{"parametros":{"agencia":[true]},"tipo":"B","comparador":4}]',1) ;
    insert into context_rules(cr_id, cr_created_at, cr_prioridade, cr_valor, cr_valores_parametro, cr_ft_id)
        values(2,now(),1,'off','[{"parametros":{"agencia":[9]},"tipo":"N","comparador":0},{"parametros":{"segmento":["prime"]},"tipo":"A","comparador":4}]',1) ;
    insert into context_rules(cr_id, cr_created_at, cr_prioridade, cr_valor, cr_valores_parametro, cr_ft_id)
        values(3,now(),3,'off','[{"parametros":{"agencia":[9]},"tipo":"N","comparador":0},{"parametros":{"segmento":["prime"]},"tipo":"A","comparador":4}]',1) ;
