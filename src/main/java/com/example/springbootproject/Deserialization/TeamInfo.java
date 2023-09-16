package com.example.springbootproject.Deserialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class TeamInfo {
    private String leader;
    private List<String> teamMembers;

    public static TeamInfo from(List<Object> request){
        /*
        builder 사용 x
        setter 사용 x
         */
        String leader = (String)request.get(0);
        List<String> teamMembers = (List<String>)request.get(1);

        return new TeamInfo(leader, teamMembers);
    }


}
