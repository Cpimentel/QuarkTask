INSERT INTO responsible (name) VALUES ('Ana Souza');
INSERT INTO responsible (name) VALUES ('Carlos Oliveira');
INSERT INTO responsible (name) VALUES ('Fernanda Lima');

INSERT INTO task (
    title,
    description,
    responsible_id,
    priority,
    deadline,
    concluded
) VALUES (
    'Revisar código do sistema',
    'Realizar revisão de código nas tarefas concluídas',
    2,
    'Média',
    '2025-06-12',
    false
);

INSERT INTO task (
    title,
    description,
    responsible_id,
    priority,
    deadline,
    concluded
) VALUES (
    'Agendar reunião com o cliente',
    'Marcar reunião para alinhamento de expectativas com o cliente final',
    3,
    'Alta',
    '2025-06-08',
    false
);

INSERT INTO task (
    title,
    description,
    responsible_id,
    priority,
    deadline,
    concluded
) VALUES (
    'Atualizar documentação',
    'Atualizar os documentos técnicos do projeto conforme as últimas mudanças',
    1,
    'Baixa',
    '2025-06-15',
    true
);

