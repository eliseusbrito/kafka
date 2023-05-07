package br.com.eliseu.kafka.producer;

import br.com.eliseu.kafka.producer.eventos.ProdutorEvento;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AplicacaoProducer {

    public static void main(String[] args) {
        AplicacaoProducer aplicacao = new AplicacaoProducer();
        aplicacao.iniciar();
    }

    private void iniciar() {
        log.info("Iniciando a aplicação");
        ProdutorEvento produtorEvento = new ProdutorEvento();
        produtorEvento.executar();
    }

}
