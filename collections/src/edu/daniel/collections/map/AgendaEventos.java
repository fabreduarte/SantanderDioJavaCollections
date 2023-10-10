package edu.daniel.collections.map;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventoMap;

	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, evento);
	}

	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventosTreeMap);
	}

	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
			LocalDate dataEvento = entry.getKey();
			if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
				proximaData = dataEvento;
				proximoEvento = entry.getValue();
				break;
			}
		}
		if (proximoEvento != null) {
			System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
		} else {
			System.out.println("Não há eventos futuros na agenda.");
		}
	}

	public static void main(String[] args) {

		AgendaEventos agendaEventos = new AgendaEventos();

		agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia",
				"Palestrante renomado");
		agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação",
				"Aula prática de desenvolvimento");
		agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software",
				"Demonstração da nova versão");
		agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação",
				"Competição de soluções criativas");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial",
				"Discussão sobre IA avançada");

		agendaEventos.exibirAgenda();

		System.out.println("------------------------");

		agendaEventos.obterProximoEvento();

	}

}
