package principal;

import services.ConsumoDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);

    private ConsumoDados consumo = new ConsumoDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibirMenu() {
        var menu ="""
                *** OPÇÕES ***
                
                Carro 
                Moto 
                Caminhão
                
                Digite uma das Opções para consultar: 
                """;

        System.out.println(menu);
        var opcao = leitura.nextLine();

        String endereco;
        if(opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "carros/marcas";
        }else if(opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);
        System.out.println(json);

        

    }
}
