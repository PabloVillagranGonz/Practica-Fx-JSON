package com.example.practicafxjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.File;
import java.util.ArrayList;

public class PeliculasController {

    @FXML
    private Button btnImoportar;

    @FXML
    private TextField txtDirector;

    @FXML
    private ListView<Pelicula> listPelicula;

    @FXML
    private TextField txtFecha;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextField txtTitulo;

    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    @FXML
    void btnImportar(ActionEvent event) {
        try{
            ArrayList<Pelicula> peliculas = JSON_MAPPER.readValue(new File("src/main/resources/peliculas.json"),
                    JSON_MAPPER.getTypeFactory().constructCollectionType(ArrayList.class, Pelicula.class));

            ObservableList<Pelicula> peliculasList = FXCollections.observableArrayList(peliculas);
            listPelicula.setItems(peliculasList);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void onImportar2(){
        try{
            Pelicula pelicula = listPelicula.getSelectionModel().getSelectedItem();
            if (pelicula != null){
                txtTitulo.setText(pelicula.titulo);
                txtFecha.setText(pelicula.fecha);
                txtGenero.setText(pelicula.genero);
                txtDirector.setText(pelicula.director);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}