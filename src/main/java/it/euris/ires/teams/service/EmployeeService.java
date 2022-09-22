package it.euris.ires.teams.service;

import it.euris.ires.teams.data.Employee;
import it.euris.ires.teams.data.MembersOperation;
import it.euris.ires.teams.data.Team;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class EmployeeService {

    private TeamService team = new TeamService();


    public void createEmployee(String nameTeam, String nameEmployee) throws Exception {

        Optional<Team> teamFound = team.findTeamByName(nameTeam);


 /*       if (teamFound.isPresent()) {

            teamFound.get().getMembers().contains();

            for (MembersOperation member : teamFound.get().getMembers()) {
                if (member.equals()) {
                    throw new Exception("Already exists Employee " + nameEmployee + "into team " + teamFound.get().getNameTeam());
                }
            }
        }*/

    }


}
