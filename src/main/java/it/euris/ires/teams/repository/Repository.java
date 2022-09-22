package it.euris.ires.teams.repository;

import it.euris.ires.teams.data.Team;
import lombok.Getter;

import java.util.Set;
import java.util.TreeSet;

@Getter
public class Repository {

    Set<Team> teams = new TreeSet<Team>();

    public Boolean createTeam(String name) {
        return teams.add(new Team(name));
    }

    public void removeTeam(String name) {
        teams.remove(new Team(name));
    }

}
