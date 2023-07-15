package ru.netology;
public class PosterManager {
    private String[] films = new String[0];
    private int defaultCountFilm;

    public PosterManager(int defaultCountFilm){
        this.defaultCountFilm = defaultCountFilm;
    }

    public PosterManager(){
        this.defaultCountFilm = 10;
    }

    public void add(String film){
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++){
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll(){
        return films;
    }

    public String[] findLast(){
        int resultLenght;
        if(films.length < defaultCountFilm){
            resultLenght = films.length;
        }
        else{
            resultLenght = defaultCountFilm;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++){
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
