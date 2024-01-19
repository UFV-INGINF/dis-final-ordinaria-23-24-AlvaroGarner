package org.vaadin.example;

import org.springframework.beans.factory.annotation.Autowired;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.Route;

import com.vaadin.flow.component.grid.Grid;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import java.io.IOException;
import java.net.URISyntaxException;


/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route
public class MainView extends VerticalLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service
     *            The message service. Automatically injected Spring managed
     *            bean.
     */
    public MainView(@Autowired GreetService service) {

        // Layout principal
        final VerticalLayout layoutPrincipal = new VerticalLayout();

        // Layouts de las tabs del layout principal
        final HorizontalLayout layoutDatosGenerales = new HorizontalLayout();
        final HorizontalLayout layoutAgruparMsCode = new HorizontalLayout();

        // Layout Datos Generales


        // Creamos la tabla con sus respectivas columnas
        Grid<Naves> grid = new Grid<>(Naves.class, false);
        // Columnas con encabezado y tamaño automático
        grid.addColumn(Naves::getName).setHeader("Name").setAutoWidth(true);
        grid.addColumn(Naves::getModel).setHeader("Model").setAutoWidth(true);
        grid.addColumn(Naves::getCost_in_credits).setHeader("CiC").setAutoWidth(true);
        grid.addColumn(Naves::getCrew).setHeader("Crew").setAutoWidth(true);
        grid.addColumn(Naves::getCargo_capacity).setHeader("Cargo_Capacity").setAutoWidth(true);
        grid.addColumn(Naves::getConsumables).setHeader("Consumables").setAutoWidth(true);
        grid.addColumn(Naves::getHyperdrive_rating).setHeader("Hyperdrive rating").setAutoWidth(true);
        grid.addColumn(Naves::getStarship_class).setHeader("Starship class").setAutoWidth(true);
        grid.addColumn(Naves::getPilots).setHeader("Pilots").setAutoWidth(true);
        grid.addColumn(Naves::getFilms).setHeader("Films").setAutoWidth(true);

        try {
            grid.setItems(service.getDataList()); // Imprimir de nuevo la lista
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        grid.setHeight("85vh");
        layoutPrincipal.add(grid);
        add(layoutPrincipal);
    }

}
