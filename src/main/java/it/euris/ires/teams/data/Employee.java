package it.euris.ires.teams.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements MembersOperation {

    private String name;
    private Team team;


    @Override
    public void printTeamMembers() {
        System.out.println("Name:" + this.name );
    }

    public void printMember() {
        System.out.println("Name:" + this.name + " Team:" + this.team.getNameTeam());
    }



}
