package it.euris.ires.teams.data;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.TreeSet;

@Getter
@Setter
@NoArgsConstructor
public class Team implements MembersOperation {

    private String nameTeam;

    Set<MembersOperation> members = new TreeSet<MembersOperation>();

    public Team(String name){
        this.nameTeam = name;
    }


    public void addMember(MembersOperation member) {
        members.add(member);
    }

    public void removeMember(MembersOperation member) {
        members.remove(member);
    }


    @Override
    public void printTeamMembers() {
        members.forEach(MembersOperation::printTeamMembers);
    }

}
