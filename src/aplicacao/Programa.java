package aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Publicacao;


public class Programa {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Have a nice trip!");
		Comentario c2 = new Comentario("Wow that's awesome!");
		Publicacao p1 = new Publicacao(
				sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 12);
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Good night");
		Comentario c4 = new Comentario("May the Force be with you");
		Publicacao p2 = new Publicacao(sdf.parse("28/07/2018 23:14:19"), 
						"Good night guys", 
						"See you tomorrow", 5);
		p2.addComentario(c3);
		p2.addComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}