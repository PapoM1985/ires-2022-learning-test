package it.euris.ires.teams.service;

import it.euris.ires.teams.data.Team;
import it.euris.ires.teams.repository.Repository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class TeamService {

    private Repository teamRepository = new Repository();

    public Boolean createTeam(String name) throws Exception {

        if (!isPresent(name)){
            return teamRepository.createTeam(name);
        }

        throw new Exception("Already exists team with name: " + name);
    }

    public Boolean isPresent(String name)  {

        for (Team team : teamRepository.getTeams()) {
            if (team.getNameTeam().equals(name)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    public Optional<Team> findTeamByName(String name){
        for (Team team: teamRepository.getTeams()) {
            if (team.getNameTeam().equals(name)) {
                return Optional.of(team);
            }
        }
        return Optional.empty();
    }
}
