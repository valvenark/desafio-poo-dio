import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso de JS");
        curso2.setCargaHoraria(4);

//        System.out.println(curso1);
//        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

//        Mentoria mentoria2 = new Mentoria();
//        mentoria2.setTitulo("Mentoria JS");
//        mentoria2.setDescricao("Descrição Mentoria de JS");
//        mentoria2.setData(LocalDate.now());

//        System.out.println(mentoria);
//        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJackson = new Dev();
        devJackson.setNome("Jackson");
        devJackson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJackson.getConteudosInscritos());
        devJackson.progredir();
        devJackson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devJackson.getConteudosConcluidos());
        System.out.println("XP: " + devJackson.calcularTotalXp());

        System.out.println("---------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());


    }
}
