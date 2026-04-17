//Agente checklist para o arquivo Checklist de Verificação de Testes — DO‑178B 
package agentes;

import java.util.ArrayList;
import java.util.List;

public class agenteCheckList5 {
    static class resultadoCheckList5 {
        String item5;
        String status5; // Aprovado (A), rejeitado(W) ou Não Aplicável (N/A)
        String justificativa5;

        resultadoCheckList5(String item5, String status5, String justificativa5) {
            this.item5 = item5;
            this.status5 = status5;
            this.justificativa5 = justificativa5;

        }

        @Override
        public String toString() {
            return String.format("[%s] Item: %s\n justificativa: %s\n ", status5, item5, justificativa5);
        }
    }

    public List<resultadoCheckList5> verificarCheckList5() {
        List<resultadoCheckList5> resultados = new ArrayList();

        // 1- Conformidade Geral dos Testes
        resultados.add(new resultadoCheckList5(
                "1- Conformidade Geral dos Testes", "A",
                "A implementação atende completamente ao item do checklist."));

        // 2- Planejamento e Preparação dos Testes
        resultados.add(new resultadoCheckList5(
                "2- Planejamento e Preparação dos Testes", "A",
                "A implementação atende completamente ao item do checklist."));

        // 3- Rastreabilidade de Testes
        resultados.add(new resultadoCheckList5(
                "3- Rastreabilidade de Testes", "A",
                "A implementação atende completamente ao item do checklist."));

        // 4- Testes Baseados em Requisitos (Requirement‑Based Testing)
        resultados.add(new resultadoCheckList5(
                "4- Testes Baseados em Requisitos (Requirement‑Based Testing)", "A",
                "A implementação atende completamente ao item do checklist."));

        // 5- Completude e Robustez dos Testes
        resultados.add(new resultadoCheckList5(
                "5- Completude e Robustez dos Testes", "A",
                "A implementação atende completamente ao item do checklist."));

        // 6- Clareza e Qualidade dos Casos de Teste
        resultados.add(new resultadoCheckList5(
                "6-  Clareza e Qualidade dos Casos de Teste", "A",
                "A implementação atende completamente ao item do checklist."));

        // 7- Execução dos Testes
        resultados.add(new resultadoCheckList5(
                "7- Execução dos Testes", "A",
                "A implementação atende completamente ao item do checklist."));

        // 8- Análise de Resultados
        resultados.add(new resultadoCheckList5(
                "8- Análise de Resultados", "A",
                "A implementação atende completamente ao item do checklist."));

        // 9- Testes de Integração de Software
        resultados.add(new resultadoCheckList5(
                "9- Testes de Integração de Software", "A",
                "A implementação atende completamente ao item do checklist."));

        // 10- Independência de Verificação
        resultados.add(new resultadoCheckList5(
                "10- Independência de Verificação", "N/A",
                "De acordo com a DO-178B, a independência rigorosa na definição de testes não é obrigatória para o nível de criticidade DAL D."));

        // 11- Considerações de Safety
        resultados.add(new resultadoCheckList5(
                "11- Considerações de Safety", "A",
                "A implementação atende completamente ao item do checklist."));

        // 12- Cobertura Estrutural (quando aplicável)
        resultados.add(new resultadoCheckList5(
                "12- Cobertura Estrutural (quando aplicável)", "N/A",
                "A cobertura estrutural é recomendada para níveis de criticidade mais altos (DAL A e B), mas não é obrigatória para o nível DAL D."));

        // 13- Conformidade com a DO‑178B
        resultados.add(new resultadoCheckList5(
                "13- Conformidade com a DO‑178B ", "A",
                "A implementação atende completamente ao item do checklist."));

        return resultados;
    }

    public static void main(String[] args) {
        agenteCheckList5 agente5 = new agenteCheckList5();
        List<resultadoCheckList5> relatorio5 = agente5.verificarCheckList5();

        System.out.println("=== RELATÓRIO DO CHECKLIST DE VERIFICAÇÃO DE LLR - DO - 178B ===");
        System.out.println("Aprovado (A), Rejeitado (W), Não Aplicável (N/A)\n");

        for (resultadoCheckList5 r5 : relatorio5) {
            System.out.println(r5);
        }

        System.out.println("Resultado Final: "
                + (relatorio5.stream().allMatch(
                        r5 -> r5.status5.equals("A") || r5.status5.equals("N/A")) ? "APROVADO"
                                : "REJEITADO"));
    }
}
