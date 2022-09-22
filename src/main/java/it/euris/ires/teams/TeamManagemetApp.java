package it.euris.ires.teams;

import it.euris.ires.teams.repository.Repository;
import it.euris.ires.teams.service.TeamService;

public class TeamManagemetApp {

    public static void main(String[] args) throws Exception {

        Repository teamRepository = new Repository();
        TeamService teamService = new TeamService(teamRepository);

        teamService.createTeam("Team 1");
        teamService.createTeam("Team 2");

    }
}
