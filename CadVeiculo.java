import java.util.ArrayList;
import java.util.List;

List<String> veiculos = new ArrayList<>();

void main(){
    IO.println("Bem vindo ao Sistema CadVeiculos");
    String menu = """
        1 - Cadastrar Veículo
        2 - Listar Veículos
        3 - Remover por índice
        4 - Buscar veículo
        5 - Editar veículo
        6 - Remover por nome
        0 - Sair
            """;
    int opcao;
    do {
        IO.println(menu);
        opcao = Input.scanInt("Digite a opção desejada: ");
        switch (opcao) {
            case 1 -> {
                cadastrar();
                IO.readln("Pressione Enter para Continuar");
            }
            case 2 -> {
                listar();
                IO.readln("Pressione Enter para Continuar");
            }
            case 3 -> {
                //TODO Remover veículo
                IO.readln("Pressione Enter para Continuar");
            }
            case 0 -> {
                IO.println("Volte sempre!!!");
            }
            default -> {
                IO.println("Opção Inválida");
                IO.readln("Pressione Enter para Continuar");
            }
                
        }
    } while (opcao != 0);

}


boolean existeVeiculo(String nome) {
    for (int i = 0; i < veiculos.size(); i++) {
        if(veiculos.get(i).equalsIgnoreCase(nome)) {
            return true;
        }
    }
    return false;
}
void cadastrar() {
    String veiculo = IO.readln("Digite o nome do novo veículo: ");
    veiculo = veiculo.trim();
    if (veiculo.isEmpty()) {
        IO.println("Nome do veículo inválido!");
        return;
    }
    if (existeVeiculo(veiculo)) {
        IO.println("Veiculo ja existe!");
        return;

    } else {
        veiculos.add(veiculo);
    }
}

void listar() {

    if (veiculos.size() ==0) {
        IO.println("Lista Vazia!");
        return;
    }
}
void ordenar() {
    for (int i = 1; i <= veiculos.size() ; i++) {
        for (int j = 0; j < veiculos.size() - 1; j++) {
            String atual = veiculos.get(j);
            String proximo = veiculos.get(j + 1);
            if (atual.compareToIgnoreCase(proximo) > 0 ) {
                veiculos.set(j, proximo);
                veiculos.set(j + 1, atual);
            }

        }
        IO.println(i + " - " + veiculos.get(i - 1));
    }
}

void buscar() {
    if (veiculos.size() == 0) {
    IO.println("Lista Vazia!");
        return;
    }
    String nome = IO.readln("Digite o nome do veiculo a ser buscado: ");
    boolean encontrado = false;
    for (int i = 0; i < veiculos.size(); i++) {
        if (veiculos.get(i).equalsIgnoreCase(nome)) {
            IO.println("Veículo encontrado no índice: " + i);
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        IO.println("Veiculo não encontrado!");
    }
    IO.println("Total de veiculos:" + veiculos.size());
}

void removerPorIndice() {
    if (veiculos.size() == 0) {
        IO.println("Lista Vazia!");
        return;
    }

    int indicce = Input.scanInt("Digite o índice do veículo a ser removido: ");
    if(indice < 0 || indice >= veiculos.size()) {
        IO.println("incice inválido!");
        return;
    }
    veiculos.remove(indice);
    IO.println("Veículo removido com sucesso!");

}

void remocerPorNome() {
    if (veiculos.size() == 0 ) {
        IO.println("lista Vazia!");
        return;
    }
    String nome = IO.readln("Digite o nome do veiculo a ser removido: ");
    boolean removido = false;

    for (int i = 0; i < veiculos.size(); i++) {
        if (veiculos.get(i).equalsIgnoreCase(nome)) {
            veiculos.remove(i);
            IO.println("Veículo removido com sucesso!");
            removido = true;
            break;
        }
    }
    if (!removido) {
        IO.println("Veículo não encontrado!");
    }
}

void editar() {
    if (veiculos.size() == 0) {
        IO.println("Lista Vazia!");
        return;
    }

    int indice = Input.scanInt("Digite o índice do veículo a ser editado: ");
    if (indice < 0 || indice >= veiculos.size()) {
        IO.println("Indice invalido!");
        return;
    }

    String novoNome = IO.readln("Digite o novo nome do veículo: ").trim();
    if (novoNome.isEmpty()) {
        IO.println("Nome do veículo inválido!");
        return;
    }
    if (existeVeiculo(novoNome)) {
        IO.println("Veículo já existe!");
        return;
    }

    veiculos.set(indice, novoNome);
    IO.println("Veículo editado com sucesso!");
    
}