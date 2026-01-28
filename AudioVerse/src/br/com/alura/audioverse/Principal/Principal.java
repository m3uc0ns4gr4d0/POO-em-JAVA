package br.com.alura.audioverse.Principal;
import br.com.alura.audioverse.modelos.MinhasPreferidas;
import br.com.alura.audioverse.modelos.Musica;
import br.com.alura.audioverse.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("BAD");
        minhaMusica.setCantor("David Guetta ft. Vassy");
        minhaMusica.setGenero("EDM (Eletronic Dance Music)");
        minhaMusica.setAlbum("Álbum: Listen");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("LUDOCAST - Deus está morto. E agora?");
        meuPodcast.setHost("Ludoviajante");
        meuPodcast.setDescricao("Qual a diferença entre niilismo e existencialismo? (etc etc)");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}