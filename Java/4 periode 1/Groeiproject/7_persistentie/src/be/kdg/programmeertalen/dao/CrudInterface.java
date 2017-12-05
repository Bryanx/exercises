package be.kdg.programmeertalen.dao;

import be.kdg.programmeertalen.model.ProgrammeerTaal;

/**
 * @author Bryan de Ridder
 * @version 1.0 22/11/17 10:55
 */
public interface CrudInterface {
    boolean create(ProgrammeerTaal taal);

    ProgrammeerTaal retrieve(int id);

    boolean update(ProgrammeerTaal taal);

    boolean delete(int id);
}
